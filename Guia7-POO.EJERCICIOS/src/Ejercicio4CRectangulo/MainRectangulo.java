/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4CRectangulo;


public class MainRectangulo {
    public static void main(String[] args) {

    Rectangulo r1 = new Rectangulo();
     // Pedimos al usuario que ingrese los datos del rectángulo
r1.crearRectangulo();
        
System.out.println("La superficie del rectángulo es: " + r1.calcularSuperficie());
System.out.println("El perímetro del rectángulo es: " + r1.calcularPerímetro());
r1.dibujarRectangulo();
}
    }
