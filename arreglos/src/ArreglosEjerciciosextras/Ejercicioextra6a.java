package ArreglosEjerciciosextras;

import static ArreglosEjerciciosextras.ejercicioextra6.verificarLongitudPalabra;
  import java.util.ArrayList ;
    import java.util.Collections ;
import java.util.Scanner;

public class Ejercicioextra6a {
  
        public static void main (String[] args) {

            // Crear una lista para almacenar las palabras ingresadas por el usuario
            ArrayList<String> palabras = new ArrayList<>();
            Scanner sc = new Scanner(System.in);

            // Leer 5 palabras de mínimo 3 y máximo 5 caracteres
            for (int i = 1; i <= 5; i++) {
                System.out.print("Ingrese la palabra #" + i + ": ");
                String palabra;
                palabra = sc.nextLine();
                if (verificarLongitudPalabra(palabra)) {
                } else {
                    System.out.println("La palabra debe tener entre 3 y 5 caracteres.");
                    i--;
                    continue;
                }
                palabras.add(palabra.toUpperCase());
            }

            // Crear una matriz de 20x20 para la sopa de letras
            char[][] sopa = new char[20][20];

            // Llenar la sopa de letras con números aleatorios
            for (int i = 0; i < sopa.length; i++) {
                for (int j = 0; j < sopa[0].length; j++) {
                    sopa[i][j] = (char) (Math.random() * 10 + '0');
                }
            }
public static boolean verificarLongitudPalabra(String palabra) {
        return palabra.length() >= 3 && palabra.length() <= 5;
    }
            // Seleccionar aleatoriamente una fila para colocar las palabras
            int fila = (int) (Math.random() * sopa.length);

            // Ordenar las palabras alfabéticamente
            Collections.sort(palabras);

            // Colocar las palabras en la fila seleccionada
            int columna = 0;
            for (String palabra : palabras) {
                for (int i = 0; i < palabra.length(); i++) {
                    sopa[fila][columna + i] = palabra.charAt(i);
                }
                columna += palabra.length() + 1;
            }

            // Imprimir la sopa de letras
          for (int j = 0; j < sopa[0].length; j++) {
                int i = 0;
    System.out.print(sopa[i][j] + " ");
                    System.out.print(sopa[i][j] + " ");
                }
                System.out.println();
            }
        }

       
        }
  
