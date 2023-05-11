/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

/**
 *
 * @author flavia
 */
    import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
 */
public class PersonaService2 {
    Scanner read = new Scanner(System.in);
    Persona pp = new Persona();
    
    public Persona crearPersona(){
        System.out.println("ingrese su nombre");
        String nombre = read.nextLine();
        System.out.println("ingrese fecha de nacimiento aa/mm/dd ");
        int anio = read.nextInt();
        int mes = read.nextInt();
        int dia = read.nextInt();
        
        Date fecha = new Date(anio - 1900, mes - 1, dia);  
        return new Persona(nombre,fecha);       
    }
    
//Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual. 
    public long calcularEdad(Persona pp){
        Date fechaActual = new Date();
        long tiempo = fechaActual.getTime() - pp.getFechaNacimiento().getTime();
        long edad = (tiempo / (1000 * 60 * 60 * 24))/365;
        System.out.println(fechaActual);
        return edad;
    }
//Método menorQue recibe como parámetro una Persona y una edad. Retorna true si 
//la persona es menor que la edad consultada o false en caso contrario.
    
    public boolean menorQue(Persona pp ,long edad ){
        return edad >= 18;
    }
    public void mostrarPersona(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de Nacimiento: " + persona.getFechaNacimiento());
    }
}

