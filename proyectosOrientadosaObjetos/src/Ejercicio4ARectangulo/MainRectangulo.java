/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4ARectangulo;

import java.util.Scanner;


public class MainRectangulo {
       public static void main(String[] args) {

        // Crear un objeto Entidad
        Entidad entidad = new Entidad();

        // Pedir al usuario que ingrese la base y la altura del rectángulo
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        double base = leer.nextDouble();
        System.out.print("Ingrese la altura: ");
        double altura = leer.nextDouble();

     
        // Calcular y mostrar el área del rectángulo
        entidad.areaRectangulo();

        // Calcular y mostrar el perímetro del rectángulo
        entidad.perimetroRectangulo();

        // Dibujar el rectángulo
        entidad.dibujoRectangulo();
    }

}

