package guia9ej5;

import Entidades.Persona;
import Servicios.PersonaService1;


public class Guia9Ej5 {
    public static void main(String[] args) {
       PersonaService1 personaService = new PersonaService1();
        Persona persona = personaService.crearPersona();
        personaService1.mostrarPersona(persona);
        int edad = personaService1.calcularEdad(persona);
        System.out.println("Edad: " + edad);
        boolean esMenor = personaService.menorQue(persona, 18);
        if (esMenor) {
            System.out.println("La persona es menor de 18 años");
        } else {
            System.out.println("La persona es mayor de 18 años");
        }
    }
}