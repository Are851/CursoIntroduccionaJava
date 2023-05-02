/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.Persona;
import Servicios.PersonaService;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author flavia
 */
public class main1 {


    public static void main(String[] args) {
        PersonaService personaService = new PersonaService();
        
        Scanner scanner = new Scanner(System.in);

        // Pedimos el nombre de la persona
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();

        // Pedimos la fecha de nacimiento de la persona
        System.out.println("Ingrese la fecha de nacimiento de la persona:");
        System.out.print("Día: ");
        int dia = scanner.nextInt();
        System.out.print("Mes: ");
        int mes = scanner.nextInt(); 
        System.out.print("Año: ");
        int anio = scanner.nextInt() - 1900; // restamos 1900 al año porque Date comienza en 1900

        // Creamos la persona con los datos ingresados
        Date fechaNacimiento = new Date(anio, mes, dia);
        Persona persona = personaService.crearPersona(nombre, fechaNacimiento);
        ///Persona persona es una forma abreviada de instar Persona persona=new Persona();

        // Mostramos la información de la persona
        personaService.mostrarPersona(persona);

        // Calculamos la edad de la persona
        int edad = personaService.calcularEdad(persona);
        System.out.println("Edad: " + edad);

        // Verificamos si la persona es menor de edad
        boolean esMenor = personaService.menorQue(persona, 18);
        if (esMenor) {
            System.out.println("Es menor de edad");
        } else {
            System.out.println("Es mayor de edad");
        }

    }
}

