
package MaineEjercicio2;

import java.util.Scanner;
import ServiciosEjercicio2.CafeteraServicio2;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        int tamanoTaza = 0;
        int cantidad = 0;

        System.out.println("Bienvenido a la cafetera Nespresso.");

        // Pide al usuario la capacidad máxima de la cafetera
        System.out.print("Ingrese la capacidad máxima de la cafetera: ");
        int capacidadMaxima = scanner.nextInt();
        CafeteraServicio2 miServicio = new CafeteraServicio2(capacidadMaxima);
        miServicio.llenarCafetera();

        System.out.println("La cafetera ha sido llenada al máximo.");
        // Bucle para mostrar las opciones hasta que el usuario seleccione la opción 5 (salir)
        while (opcion != 4) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Servir una taza");
            System.out.println("2. Vaciar la cafetera");
            System.out.println("3. Agregar café a la cafetera");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el tamaño de la taza: ");
                    tamanoTaza = scanner.nextInt();
                    miServicio.servirTaza(tamanoTaza); 
                    break;
                case 2:
                    miServicio.vaciarCafetera();
                    System.out.println("La cafetera ha sido vaciada.");
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad de café a agregar: ");
                    cantidad = scanner.nextInt();
                    miServicio.agregarCafe(cantidad);
                    break;
                case 4:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }
        scanner.close();
    }
}    

