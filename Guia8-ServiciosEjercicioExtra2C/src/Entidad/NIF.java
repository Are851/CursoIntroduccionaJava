package Entidad;


public class NIF {
    /* 
       Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su correspondiente letra (NIF). 
       Los atributos serán el número de DNI (entero largo) y la letra (String o char) que le corresponde. 
       
     */
    private long DNI;
    private char letra;
    //private char[] vector = new char[] ;
    public char vector[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

    public NIF() {
    }
    
    public NIF(long DNI, char letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public long getDNI() {
        return DNI;
    }
    public void setDNI(long DNI) {
        this.DNI = DNI;
    }
    public char getLetra() {
        return letra;
    }
    public void setLetra(char letra) {
        this.letra = letra;
    }
    
}    

