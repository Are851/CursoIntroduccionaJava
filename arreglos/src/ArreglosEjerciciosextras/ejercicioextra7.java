package ArreglosEjerciciosextras;

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

