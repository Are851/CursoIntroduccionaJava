
package EjercicioExtra2C;


public class Main {
    public static void main(String[] args) {
        
        Puntos puntos = new Puntos();
        
        puntos.crearPuntos();
                  
        System.out.println("La distancia entre los dos puntos es: " + puntos.calcularDistancia());
    }
}
