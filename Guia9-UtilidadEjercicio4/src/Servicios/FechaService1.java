/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Date;
import java.util.Scanner;


 public class FechaService1 {
    public Date fechaNacimiento(){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese fecha de nacimiento: año, mes y dia");
        int anio = read.nextInt();
        int mes = read.nextInt();
        int dia = read.nextInt();
        
        Date fecha = new Date(anio - 1900, mes - 1, dia);  
        return fecha;
        
}
//Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos
//el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date()
//El método debe retornar el objeto Date.
   
       public Date fechaActual(){
           Date fechaActual = new Date();
           return fechaActual;
           
       }
//Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia
//de años entre una y otra (edad del usuario).     
       public long diferencia(){
          long dif = fechaActual().getTime() - fechaNacimiento().getTime();
          
          double aniosDif = (double) dif /(1000*60*60*24*365.25);
          return (int) Math.floor(Math.abs(aniosDif));
                  
       }
}   

