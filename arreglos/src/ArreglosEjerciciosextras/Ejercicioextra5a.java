package ArreglosEjerciciosextras;

public class Ejercicioextra5a {

        public static void main(String[] args) {
            // Realizar un programa que llene una matriz de tamaño NxM 
            //con valores aleatorios y muestre la suma de sus elementos.
            int[][] matriz = new int[3][4];
            int suma = 0;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    matriz[i][j] = (int) (Math.random() * 10 + 1);
                    suma = suma + matriz[i][j];
                    System.out.print("[" + matriz[i][j] + "]");

                }
                System.out.println("");
            }

            System.out.println("la suma de todos los elementos es: " + suma);
        }

    }   

