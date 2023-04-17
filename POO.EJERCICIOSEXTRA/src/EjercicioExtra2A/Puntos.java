
package EjercicioExtra2A;


public class Puntos {
 private double x1, y1, x2, y2;

    public Puntos(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double calcularDistancia() {
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return distancia;
    }   
}
