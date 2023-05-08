package main;

import Entidades.Persona;
import Servicios.PersonaServicio;

public class MainPersona {

public static void main(String[] args) {
    PersonaServicio servicio = new PersonaServicio();

    // Creamos una persona y mostramos si es mayor de edad
    Persona persona1 = servicio.crearPersona();
    boolean esMayorDeEdad = servicio.esMayorDeEdad(persona1);
    System.out.println(persona1.getNombre() + " es mayor de edad: " + esMayorDeEdad);

    // Calculamos el IMC de otra persona
    Persona persona2 = servicio.crearPersona();
    servicio.calcularIMC(persona2);
    System.out.println(persona2.toString());
}
}
