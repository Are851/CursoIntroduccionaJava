
package Entidad;


public class CadenaClase {

    private int longitud;
    private String frase;

  


    public CadenaClase() {
    }

    public CadenaClase(String frase) {
        this.frase = frase;
        this.longitud=frase.length();
    
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }


    @Override
    public String toString() {
        return "Ej1Cadena{" + "frase=" + frase + ", longitud=" + longitud + '}';
    }



    }
    
