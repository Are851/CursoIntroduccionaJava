package ArreglosEjerciciosextras;
 ///// Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas,
///sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por teclado
///y determine si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos 
///son correctos, es decir, están entre el 1 y el 9.

public class ejercicioextra7 {
    public static void main(String[] args) {
        int n = 10; // Definimos el número de términos a generar
        int[] fib = new int[n]; // Creamos un arreglo para almacenar los términos
        
        // Generamos los primeros términos de la sucesión de Fibonacci
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        
        // Imprimimos los términos generados
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
    }
}    

