/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
y le pida al usuario un número a buscar en el vector. El programa mostrará 
dónde se encuentra el numero y si se encuentra repetido
 */
package arreglosejercicio;

import java.util.Scanner;

public class ArreglosEjercicio2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int n;

        System.out.print("Ingrese tamano del arreglo");
        n = leer.nextInt();
        
        int[] arreglo = new int[n];

        for (int i = 0; i < n; i++) {
            arreglo[i] = (int) (Math.random() * 100);
///asigna valor entre 0 y 100 multiplicando por 100
///Math.random() da un valor decimal double por eso se convierte en int
}
            ///opcion 2
//arreglo[i] = rnd.nextInt(100); // Asigna un valor aleatorio entre 0 y 99
            for (int i = 0; i < n; i++) {
                System.out.println(arreglo[i]);

            }
        }

    }