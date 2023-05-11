package guia9ej5;

import Entidad.Persona;
import Servicios.PersonaService1;


public class Main1 {
    public static void main(String[] args) {
       PersonaService1 personaService = new PersonaService1();
        Persona persona = new Persona();
                personaService.crearPersona();
        ///Cargamos los datos en Servicios
        personaService.mostrarPersona(persona);
        int edad = personaService.calcularEdad(persona);
        System.out.println("Edad: " + edad);
        boolean esMenor = personaService.menorQue(persona, 18);
        if (esMenor) {
            System.out.println("La persona es menor de 18 años");
        } else {
            System.out.println("La persona es mayor de 18 años");
        }
    }
}