/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author flavia
 */
import java.util.Scanner;

public class ejercicio1 {
    
    public static void main(String[] args) {
        
        int num;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero:");
        num = leer.nextInt();
        
        if(num%2==0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }
}