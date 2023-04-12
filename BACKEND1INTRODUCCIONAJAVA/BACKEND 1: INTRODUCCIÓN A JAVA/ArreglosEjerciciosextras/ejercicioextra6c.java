/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosEjerciciosextras;

  import java.util.Random;
import java.util.Scanner;
public class ejercicioextra6c {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random ran = new Random();
        char name = (char) (Math.random() * 26 + 'A');

        char[][] matriz = new char[20][20];
        int contFrases = 0;
        String frase;

        for (int i = 0; i < matriz.length; i++) {
            do {
                System.out.println("Ingrese una palabra o frase. Entre 3 y 5 caracteres." + "(" + (i + 1) + ")");
                frase = leer.nextLine();
                 frase = frase.toUpperCase();
            } while (frase.length() > 5 || frase.length() < 3);
            int filarandom = ran.nextInt(20);
            for (int j = 0; j < frase.length(); j++) {
                //System.out.println(frase.charAt(j));
                matriz[filarandom][j] =  frase.charAt(j);               
            }
            contFrases++;
            if (contFrases == 5) {
                break;
            }
        }
        // Relleno la matriz con números aleatorios entre 0 y 9 cuando no encuentro una letra
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {    
                if (matriz[i][j] == 0)
                    matriz[i][j] = (char) (Math.random() * 26 + 'A');
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }
    }
}  

