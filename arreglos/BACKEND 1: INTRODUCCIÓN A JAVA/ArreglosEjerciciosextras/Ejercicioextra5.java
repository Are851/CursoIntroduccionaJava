/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosEjerciciosextras;

import java.util.Random;

public class Ejercicioextra5 {
    
    public static void main(String[] args) {
        // Definir el tamaño de la matriz
        int n = 5;
        int m = 3;

        // Crear matriz y generar valores aleatorios
        int[][] matriz = new int [n][m];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = rand.nextInt(11);
            }
        }

        // Mostrar la matriz
        System.out.println("Matriz generada:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Calcular la suma de los elementos de la matriz
        double suma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                suma += matriz[i][j];
            }
        }

        // Mostrar la suma de los elementos de la matriz
        System.out.println("La suma de los elementos de la matriz es: " + suma);
    }
}