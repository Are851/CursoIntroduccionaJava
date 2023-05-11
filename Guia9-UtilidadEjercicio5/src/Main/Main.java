package Main;

import Servicios.PersonaService;
import java.util.Date;
import Entidad.Persona;

public class Main {

    /**
     * Implemente la clase Persona en el paquete entidades.Una persona tiene un
     * nombre y una fecha de nacimiento TipoDate),constructorvacío,
     * constructorparametrizado,getyset. CrearunaclasePersonaService, en el
     * paquete servicio,con los siguientes métodos: a)MétodocrearPersona que
     * pida al usuario Nombre y fecha de nacimiento de la persona a
     * crear.Retornar el objeto Persona creado. b)Método calcularEdad que
     * calcule la edad del usuario utilizando el atributo de fecha de nacimiento
     * y la fecha actual. c)Métodomenor Que recibe como parámetro una Persona y
     * una edad. Retorna true si la persona es menor que la edad consultada o
     * false en caso contrario. d)Método mostrar Persona que muestra la
     * información de la persona deseada.
     * @param args
     */
    public static void main(String[] args) {
        PersonaService personaService = new PersonaService();

        // Creamos una nueva persona
        String nombre = "Juan";
        Date fechaNacimiento = new Date(95, 2, 23); // 23 de marzo de 1995
        Persona persona = personaService.crearPersona(nombre, fechaNacimiento);
        ///cargamos los datos en el codigo
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
