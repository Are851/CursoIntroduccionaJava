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
public class NewClass {
public static void main(String[] args) {
        int num1, num2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese dos numero enteros:");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        System.out.print("La suma es: ");   
        System.out.println(num1 + num2);   
    }
}