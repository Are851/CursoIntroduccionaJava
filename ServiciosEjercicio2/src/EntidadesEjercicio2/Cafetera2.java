/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadesEjercicio2;

/**
 *
 * @author flavia
 */
public class Cafetera2 {
    private int capacidadMaxima, capadidadActual;

    public Cafetera2() {
    }

    public Cafetera2(int capacidadMaxima, int capadidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capadidadActual = capadidadActual;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCapadidadActual() {
        return capadidadActual;
    }

    public void setCapadidadActual(int capadidadActual) {
        this.capadidadActual = capadidadActual;
    }

}    

