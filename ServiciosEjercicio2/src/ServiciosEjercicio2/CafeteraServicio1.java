
package ServiciosEjercicio2;

import Entidad.Cafetera;
import java.util.Scanner;

public class CafeteraServicio1 {

    private  Cafetera cafetera;
    Scanner scanner = new Scanner(System.in);
    int cantidad = 0;

    public CafeteraServicio1(Cafetera cafetera) {
        this.cafetera = cafetera;
    }

    public void llenarCafetera() {
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
    }

    public void servirTaza(int tamanoTaza) {
        if (tamanoTaza <= cafetera.getCantidadActual()) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tamanoTaza);
            System.out.println("Se ha llenado la taza.");
        } else {
            System.out.println("No se ha podido llenar la taza completamente.");
            System.out.println("La taza ha sido llenada con " + cafetera.getCantidadActual() + " unidades de café.");
            cafetera.setCantidadActual(0);
        }
    }

    public void vaciarCafetera() {
        cafetera.setCantidadActual(0);
    }

    public void agregarCafe(int cantidad) {
        cafetera.setCantidadActual(Math.min(cafetera.getCapacidadMaxima(), cafetera.getCantidadActual() + cantidad));
        System.out.println("La Cafetera contiene " + cafetera.getCantidadActual() + " unidades de café.");

    }

}
