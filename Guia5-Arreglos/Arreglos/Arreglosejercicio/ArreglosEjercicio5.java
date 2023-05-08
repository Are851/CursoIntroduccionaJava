/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosejercicio;

/**
 *
 * @author flavia
 */
public class ArreglosEjercicio5 {
  public static void main(String[] args) {
        int[][] matriz = {{0, 1, -2}, {-1, 0, 3}, {2, -3, 0}}; // matriz de ejemplo
        
        boolean esAntisimetrica = true; // inicialmente asumimos que la matriz es antisimétrica
        
        // comparamos la matriz con su traspuesta multiplicada por -1
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    esAntisimetrica = false;
                    break;
                }
            }
            if (!esAntisimetrica) {
                break;
            }
        }
        
        if (esAntisimetrica) {
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz no es antisimétrica.");
        }
    }
}
   

