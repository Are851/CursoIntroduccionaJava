///Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N,
///con los valores ingresados por el usuario.
package ArreglosEjerciciosextras;

/**
 *
 * @author flavia
 */
import java.util.Scanner;

public class Ejercicioextra1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario que ingrese el tamaño del vector
        System.out.print("Ingrese el tamaño del vector: ");
        int n = sc.nextInt();

        // Creamos el vector y pedimos al usuario que ingrese los valores
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor " + (i+1) + ": ");
            vector[i] = sc.nextInt();
        }

        // Calculamos la suma de todos los elementos del vector
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += vector[i];
        }

        // Imprimimos el resultado
        System.out.println("La suma de los elementos del vector es: " + suma);
    }
}    

