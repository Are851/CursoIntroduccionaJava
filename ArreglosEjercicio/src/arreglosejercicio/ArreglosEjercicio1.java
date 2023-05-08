/*
Realizar un algoritmo que llene un vector con los 100 primeros números enteros
y los muestre por pantalla en orden descendente.
 */
package arreglosejercicio;

public class ArreglosEjercicio1 {

    public static void main(String[] args) {
        int[] arreglo = new int[100];
        for (int i = 0; i < 100; i++) {
            arreglo[i]=i+1;
            System.out.print(arreglo[i]);
        }
        for (int i = 99; i < 0; i--) {
            System.out.println(arreglo[i]);

        }
    }
}
