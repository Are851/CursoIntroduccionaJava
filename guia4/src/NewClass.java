/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author flavia
 */
import java.util.Scanner;

public class NewClass {
public static void main(String[] args) {
        int[] numeros = new int[100];

        // Llenar el vector con los 100 primeros números enteros
        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
        }

        // Ordenar el vector en orden descendente
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] < numeros[j]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }

        // Mostrar los números en orden descendente
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}