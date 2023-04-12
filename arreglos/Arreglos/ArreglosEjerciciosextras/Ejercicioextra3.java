/// Crear una función rellene un vector con números aleatorios, 
///pasándole un arreglo por parámetro. Después haremos otra función o 
///procedimiento que imprima el vector.
package ArreglosEjerciciosextras;

public class Ejercicioextra3 {
    public static void main(String[] args) {
        int[] vector = new int[6];
        llenarvector(vector);
        mostrarvector(vector);
    }

    public static void mostrarvector(int[] vector) {
        for (int i = 0; i < 6; i++) {
            System.out.print(vector[i] + "");
        }
    }

    public static void llenarvector(int[] vector) {
        for (int i = 0; i < 6; i++) {
            vector[i] = (int) (Math.random() * 20);
        }
    }  
}
