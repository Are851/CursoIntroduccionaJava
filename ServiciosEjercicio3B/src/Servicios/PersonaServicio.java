
package Servicios;

import java.util.Scanner;
import Entidades.Persona;
public class PersonaServicio2 {


public class PersonaServicio {

    public boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() >= 18;
    }

    public Persona crearPersona() {
        Scanner scanner = new Scanner(System.in);
        Persona persona = new Persona();

        System.out.print("Ingrese el nombre de la persona: ");
        persona.setNombre(scanner.nextLine());

        System.out.print("Ingrese la edad de la persona: ");
        persona.setEdad(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Ingrese el sexo de la persona (H/M/O): ");
        String sexo = scanner.nextLine();
        while (sexo != 'H' ||  sexo != 'M' ||  sexo != 'O') {
            System.out.print("El sexo ingresado no es correcto. Ingrese H, M u O: ");
            sexo = scanner.nextLine();
        }
        persona.setSexo(sexo);

        System.out.print("Ingrese el peso de la persona en kilogramos: ");
        persona.setPeso(scanner.nextInt());

        System.out.print("Ingrese la altura de la persona en metros: ");
        persona.setAltura(scanner.nextInt());

        return persona;
    }

    public int calcularIMC(Persona persona) {
        double imc = persona.getPeso() / Math.pow(persona.getAltura(), 2);
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }
}    
}
