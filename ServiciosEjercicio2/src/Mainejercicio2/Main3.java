/*
Hacemos el main sin menu pero pidiendo capacidad maxima y cantidad de cafe a 
agregar
 */
package Mainejercicio2;

import Servicios.CafeteraServicio2;
import java.util.Scanner;


public class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la cafetera Nespresso.");

        // Pide al usuario la capacidad máxima de la cafetera
        System.out.print("Ingrese la capacidad máxima de la cafetera: ");
        int capacidadMaxima = scanner.nextInt();
        CafeteraServicio2 miServicio = new CafeteraServicio2(capacidadMaxima);
        miServicio.llenarCafetera();
       
        System.out.print("Ingrese el tamaño de la taza: ");
        int tamanoTaza = scanner.nextInt();
        miServicio.servirTaza(tamanoTaza);
        miServicio.vaciarCafetera();
        System.out.println("La cafetera ha sido vaciada.");
        System.out.print("Ingrese la cantidad de café a agregar: ");
        int cantidad = scanner.nextInt();
        miServicio.agregarCafe(cantidad);
        System.out.println("Se han agregado " + cantidad + " unidades de cafe a la cafetera.");
            }
        }
    

