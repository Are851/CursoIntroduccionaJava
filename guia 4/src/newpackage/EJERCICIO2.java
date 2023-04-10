/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
/**
 *
 * @author flavia
 */
import java.util.Scanner;
public class EJERCICIO2 {
        public static void main(String[] args) {        
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        frase = leer.nextLine();
        if(frase.equalsIgnoreCase("eureka")){
            System.out.println("correcto");
        }else{
            System.out.println("incorrecto");       
        }      
      }
        
