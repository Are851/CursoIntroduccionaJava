/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.ejercicioextra05;

import entidades.Empleado;
import java.util.Scanner;


public class Guia7EjercicioExtra05 {

  
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
//      System.out.println("Ingrese su nombre");
//        String nombre = leer.nextLine();
//        
//      System.out.println("Ingrese su edad");
//        int edad = leer.nextInt();
//        
//      System.out.println("Ingrese su salario");
//        double salario = leer.nextDouble();
        
       

      Empleado empleado1 = new Empleado();
    
      System.out.println("Ingrese el nombre: ");
      empleado1.setNombre(leer.nextLine());
      
      System.out.println("Ingrese la edad: ");
      empleado1.setEdad(leer.nextInt());
      
      System.out.println("Ingrese el salario: ");
      empleado1.setSalario(leer.nextDouble());
      

      empleado1.calcular_aumento();
    }
    
}
