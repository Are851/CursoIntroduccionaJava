package Servicios;

import java.util.Scanner;
import Entidades.Persona;

public class PersonaServicio {
        Scanner scanner = new Scanner(System.in);
        Persona persona = new Persona();
    public boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() >= 18;
    }

    public Persona crearPersona() {


        System.out.print("Ingrese el nombre de la persona: ");
        persona.setNombre(scanner.nextLine());

        System.out.print("Ingrese la edad de la persona: ");
        persona.setEdad(scanner.nextInt());

        System.out.print("Ingrese el sexo de la persona (H/M/O): ");
        persona.setSexo(scanner.nextLine());

        

        

        System.out.print("Ingrese el peso de la persona en kilogramos: ");
        persona.setPeso(scanner.nextInt());

        System.out.print("Ingrese la altura de la persona en metros: ");
        persona.setAltura(scanner.nextInt());

        return persona;
    }

    public void calcularIMC(Persona persona) {
        double imc = persona.getPeso() / Math.pow(persona.getAltura(), 2);
        if (imc < 20) {
            System.out.println("La persona tiene peso bajo");
        } else if (imc >= 20 && imc <= 25) {
                System.out.println("La persona tiene peso ideal");
        } else {
                System.out.println("La persona tiene sobrepeso");
        }
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
