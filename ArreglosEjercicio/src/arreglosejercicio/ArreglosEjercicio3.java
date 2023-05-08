/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y 
muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se 
denota por B y se obtiene cambiando sus filas por columnas (o viceversa).

 */
package arreglosejercicio;
        import java.util.Random;


public class ArreglosEjercicio3 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Random rand = new Random();
        
        // Rellenar la matriz con valores aleatorios
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = rand.nextInt(10); // Genera valores aleatorios entre 0 y 9
            }
        }
        
        // Mostrar la matriz original
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);
        
        // Crear la matriz traspuesta
        int[][] traspuesta = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for 
                    (int j = 0; j < 4; j++) {
                traspuesta[i][j] = matriz[j][i]; // Intercambiar filas por columnas
            }
        }
        
        // Mostrar la matriz traspuesta
        System.out.println("Matriz traspuesta:");
        mostrarMatriz(traspuesta);
    }
    
    // Método auxiliar para mostrar una matriz en consola
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
        //  for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

    

