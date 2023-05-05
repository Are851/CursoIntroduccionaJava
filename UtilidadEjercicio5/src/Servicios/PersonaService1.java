/*Implemente la clase Persona en el paquete entidades. 
Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. 
Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.

*/
package Servicios;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaService1 {

     public Persona crearPersona() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el día de nacimiento: ");
        int dia = sc.nextInt();
        System.out.print("Ingrese el mes de nacimiento: ");
        int mes = sc.nextInt() - 1;
        System.out.print("Ingrese el año de nacimiento: ");
        int anio = sc.nextInt() - 1900;
        Date fechaNacimiento = new Date(anio, mes, dia);
        return new Persona(nombre, fechaNacimiento);
    }

    public int calcularEdad(Persona persona) {
        Date fechaNacimiento = persona.getFechaNacimiento();
        Date fechaActual = new Date();
        long tiempo = fechaActual.getTime() - fechaNacimiento.getTime();
        long edadEnDias = tiempo / (1000 * 60 * 60 * 24);
        int edad = (int) (edadEnDias / 365);
        return edad;
    }

    public boolean menorQue(Persona persona, int edad) {
        return calcularEdad(persona) < edad;
    }

    public void mostrarPersona(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de Nacimiento: " + persona.getFechaNacimiento());
    }
}