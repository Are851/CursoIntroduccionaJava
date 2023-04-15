/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4Rectangulo;

/**
 *
 * @author flavia
 */
public class Ejercicio4Rectangulo {
    public static void main(String[] args) {
        // Creamos un nuevo objeto Rectangulo
        Rectangulo r = new Rectangulo();
        
        // Pedimos al usuario que ingrese los datos del rectángulo
        r.crearRectangulo();
        
        // Imprimimos la superficie y el perímetro del rectángulo
        System.out.println("Superficie: " + r.calcularSuperficie());
        System.out.println("Perímetro: " + r.calcularPerímetro());
        
        // Dibujamos el rectángulo
        r.dibujarRectangulo();
    }
}   

