///Escriba un programa que averigüe si dos vectores de N enteros s
///on iguales (la comparación deberá detenerse en cuanto se detecte 
///alguna diferencia entre los elementos).
package ArreglosEjerciciosextras;

import java.util.Random;

public class Ejercicioextra2 {
 public static void main(String[] args) {
        int N = 5; // Número de elementos en los vectores
        int[] vector1 = new int[N];
        int[] vector2 = new int[N];
        boolean iguales = true;

        // Genera valores aleatorios para los elementos de los vectores
        Random rand = new Random();
        for (int i = 0; i < N; i++) {
            vector1[i] = rand.nextInt(10); // Genera un número aleatorio entre 0 y 9
            vector2[i] = rand.nextInt(10); // Genera un número aleatorio entre 0 y 9
        }

        // Compara los elementos de los dos vectores
        if (vector1.length == vector2.length) {
            for (int i = 0; i < vector1.length; i++) {
                if (vector1[i] != vector2[i]) {
                    iguales = false;
                    break;
                }
            }
        } else {
            iguales = true;
        }

        // Imprime el resultado de la comparación
        if (iguales) {
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("Los vectores no son iguales");
        }
    }
}