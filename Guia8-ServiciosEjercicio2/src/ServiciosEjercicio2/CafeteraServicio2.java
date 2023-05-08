/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiciosEjercicio2;

import Entidad.Cafetera;

public class CafeteraServicio2 {
    private Cafetera cafetera;

    // Constructor que recibe la capacidad máxima de la cafetera como parámetro.
    public CafeteraServicio2(int capacidadMaxima) {
        this.cafetera = new Cafetera(capacidadMaxima, 0);
    }

    public void llenarCafetera() {
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
    }

    public void servirTaza(int tamanoTaza) {
        if (cafetera.getCantidadActual() >= tamanoTaza) {
            System.out.println("Se ha llenado la taza con " + tamanoTaza + " unidades de cafe.");
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tamanoTaza);
            System.out.println("Quedan " + cafetera.getCantidadActual()  + " unidades de cafe.");
        } else {
            System.out.println("No se ha llenado la taza. Se carga a la taza " + cafetera.getCantidadActual() + " unidades de cafe en la taza.");
            cafetera.setCantidadActual(0);
        }
    }

    public void vaciarCafetera() {
        cafetera.setCantidadActual(0);
    }

    public void agregarCafe(int cantidad) {
        System.out.println("Ingresar la cantidad de cafe a agregar:");
        cafetera.setCantidadActual(cafetera.getCantidadActual() + cantidad);
        if (cafetera.getCantidadActual() > cafetera.getCapacidadMaxima()) {
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("La Cafetera contiene " + cafetera.getCantidadActual() + " unidades de café.");
        }
    }

    public Cafetera getCafetera() {
        return cafetera;
    }

    public void setCafetera(Cafetera cafetera) {
        this.cafetera = cafetera;
    }
}    

