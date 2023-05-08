/*
 Ejercicio 3 Recorrer un vector de N enteros contabilizando cuántos números 
son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package arreglosejercicio;

import java.util.Arrays;

public class ArreglosEjercicio3 {
// Ejercicio 3 Recorrer un vector de N enteros contabilizando cuántos números 
 ///son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).


    public static void main(String[] args) {
        int[] numeros = {12, 345, 6789, 5, 3210, 9, 87, 6543};
        int[] digitos = new int[5];
        
    ///opcion 1
//        for (int n : numeros) {
//    if (n < 10) {
//                digitos[0]++;
//            } else if (n < 100) {
//                digitos[1]++;
//            } else if (n < 1000) {
//                digitos[2]++;
//            } else if (n < 10000) {
//                digitos[3]++;
//            } else {
//                digitos[4]++;
//            }
//               }
            for (int i = 0; i < numeros.length; i++) {
                
            
            if (numeros[i] < 10) {
                digitos[0]++;
            } else if (numeros[i] < 100) {
                digitos[1]++;
            } else if (numeros[i]  < 1000) {
                digitos[2]++;
            } else if (numeros[i]  < 10000) {
                digitos[3]++;
            } else {
                digitos[4]++;
            }
               }
        
        
        System.out.println(Arrays.toString(digitos));
    }
}
   

