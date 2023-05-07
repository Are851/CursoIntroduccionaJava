package Entidad;
public class Ahorcado {
    private char[] palabra; // Vector con la palabra a buscar
    private int letrasEncontradas; // Cantidad de letras encontradas
    private int jugadasMaximas; // Cantidad máxima de jugadas permitidas
    private int jugadasActuales; // Cantidad de jugadas realizadas
    
    public void setPalabra(String palabra) {
        this.palabra = palabra.toCharArray();
    }
    
    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }
    
    public void crearJuego(String palabra, int jugadasMaximas) {
        setPalabra(palabra);
        this.jugadasMaximas = jugadasMaximas;
        this.letrasEncontradas = 0;
        this.jugadasActuales = 0;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }
    
    public int longitud() {
        return palabra.length;
    }
    
    public boolean buscar(char letra) {
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i] == letra) {
                return true;
            }
        }
        jugadasActuales++;
        return false;
    }
    
    public boolean encontradas(char letra) {
        boolean encontrada = false;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i] == letra) {
                letrasEncontradas++;
                encontrada = true;
            }
        }
        return encontrada;
        
   
    }
    
    public int intentos() {
        return jugadasMaximas - jugadasActuales;
    }
}