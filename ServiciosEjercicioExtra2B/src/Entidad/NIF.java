/*
Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su correspondiente letra (NIF). 
Los atributos serán el número de DNI (entero largo) y la letra (String o char) que 
le corresponde. 
*/
package Entidad;

public class NIF {
    //atributos
    private long DNI;
    private String letra;
    
    //constructor vacio
    public NIF(){
    }
    
    //constructor por referencia/parametro
    public NIF(long DNI, String letra){
        this.DNI = DNI;
        this.letra = letra;
    }
    
    //set
    public void setDNI(long DNI) {
        this.DNI = DNI;
    }
    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    //get
    public double getDNI() {
        return DNI;
    }
    public String getLetra() {
        return letra;
    }
    
    
}
