/*Este ejemplo crea una cafetera con capacidad máxima de 500 unidades de café
y cantidad actual de 250 unidades de café. Luego, utiliza la instancia de 
CafeteraServicio para realizar algunas operaciones, como llenar la cafetera, 
servir una taza de 100 unidades de café, agregar 200 unidades de café y vaciar
la cafetera. Los resultados de cada operación se imprimirán en la consola.
Le cargamos los datos en el main por codigo y no ejecutandolo
Agregamos opciones de los metodos por while y swicth
*/ 
package Mainejercicio2;
import java.util.Scanner;
import Entidades.Cafetera;
import Servicios.CafeteraServicio1;

public class Main1 {

    public static void main(String[] args) {
        // Crear una cafetera con capacidad máxima de 500 unidades de café y cantidad actual de 250 unidades de café.
        Cafetera miCafetera = new Cafetera(500, 250);

        // Crear una instancia de CafeteraServicio con la cafetera creada anteriormente.
        CafeteraServicio1 miServicio = new CafeteraServicio1(miCafetera);

        // Crear un objeto Scanner para leer las opciones ingresadas por el usuario.
        Scanner sc = new Scanner(System.in);

        // Mostrar el menú de opciones.
        System.out.println("Bienvenido a la cafetera virtual");
        System.out.println("--------------------------------");
        System.out.println("1. Llenar la cafetera");
        System.out.println("2. Servir una taza");
        System.out.println("3. Agregar café");
        System.out.println("4. Vaciar la cafetera");
        System.out.println("0. Salir");

        // Leer la opción ingresada por el usuario.
        int opcion = sc.nextInt();

        // Procesar la opción ingresada por el usuario.
        while (opcion != 0) {
            switch (opcion) {
                case 1:
                    miServicio.llenarCafetera();
                    System.out.println("La cafetera ha sido llenada");
                    break;
                case 2:
                    System.out.println("Ingrese el tamaño de la taza en unidades de café:");
                    int tamañoTaza = sc.nextInt();
                    miServicio.servirTaza(tamañoTaza);
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad de café que desea agregar:");
                    int cantidadCafe = sc.nextInt();
                    miServicio.agregarCafe(cantidadCafe);
                    System.out.println("Se han agregado " + cantidadCafe + " unidades de café a la cafetera");
                    break;
                case 4:
                    miServicio.vaciarCafetera();
                    System.out.println("La cafetera ha sido vaciada");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }

            // Volver a mostrar el menú de opciones y leer la opción ingresada por el usuario.
            System.out.println("--------------------------------");
            System.out.println("1. Llenar la cafetera");
            System.out.println("2. Servir una taza");
            System.out.println("3. Agregar café");
            System.out.println("4. Vaciar la cafetera");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
        }

        // Cerrar el objeto Scanner.
        sc.close();
    }
}    

