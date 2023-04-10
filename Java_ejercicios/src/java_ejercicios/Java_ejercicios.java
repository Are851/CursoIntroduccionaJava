/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios;

/**
 *
 * @author flavia
 */
import java.util.Scanner;

public class Java_ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una secuencia de caracteres: ");
        String cadena = sc.nextLine();
        String codificada = codificar(cadena);
        System.out.println("La cadena codificada es: " + codificada);
    }
    
    public static String codificar(String cadena) {
        String codificada = "";
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            switch (c) {
                case 'a':
                case 'A':
                    codificada += "@";
                    break;
                case 'e':
                case 'E':
                    codificada += "#";
                    break;
                case 'i':
                case 'I':
                    codificada += "$";
                    break;
                case 'o':
                case 'O':
                    codificada += "%";
                    break;
                case 'u':
                case 'U':
                    codificada += "*";
                    break;
                default:
                    codificada += c;
            }
        }
        return codificada;
    }
}
