/*
En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La función 
devuelve un booleano.
b) Metodo crearPersona(): el método crear persona, le pide los valores de los 
atributos al usuario y después se le asignan a sus respectivos atributos 
para llenar el objeto Persona. Además, comprueba que el sexo introducido 
sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje.
c) Método calcularIMC(): calculara si la persona está en su peso ideal (peso en 
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, 
significa que la persona está por debajo de su peso ideal y la función devuelve 
un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), 
significa que la persona está en su peso ideal y la función devuelve un 0. 
Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa 
que la persona tiene sobrepeso, y la función devuelve un 1.
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {
    Scanner read = new Scanner(System.in);
    //instancio el objeto
    Persona individuo;
    
    //a) Método esMayorDeEdad(): indica si la persona es mayor de edad. 
    //La función devuelve un booleano.
    public boolean esMayorDeEdad(){
        if (individuo.getEdad() < 18) {
            return false;
        } else {return true;}
    }

    //b) Metodo crearPersona(): el método crear persona, le pide los valores 
    //de los atributos al usuario y después se le asignan a sus respectivos 
    //atributos para llenar el objeto Persona. 
    public void crearPersona(){
            //pido los datos/atributos al usuario
            System.out.print("Nombre: "); 
            String nombre = read.next();
            System.out.print("Nacionalidad: ");
            String nacion = read.next();
            System.out.print("Edad: ");
            int edad = read.nextInt();
            System.out.print("Sexo (H: hombre, M: mujer, O: otro): ");
            String sexo = read.next().toLowerCase();
            //comprueba que el sexo introducido sea correcto, es decir, H, M o O. 
            //Si no es correcto se deberá mostrar un mensaje.
            if ("h".equals(sexo) || "m".equals(sexo) || "o".equals(sexo)) {
                sexo = sexo;
            } else {
                System.out.println("Error. No se pudo cargar el sexo. Valor incorrecto");
                sexo = "";
            }
            System.out.print("Peso (en kg): ");
            float peso = read.nextFloat();
            System.out.print("Altura (en mts.): ");
            float altura = read.nextFloat();
            System.out.print("Color de cabello: ");
            String pelo = read.next();
            System.out.print("Color de ojos: ");
            String ojo = read.next();
            //cargo los datos en el objeto instanciado al inicio
            //con el constructor por parámetro
            individuo = new Persona(nombre,nacion,edad,sexo,peso,altura,pelo,ojo);    
    }
    
    /*
    c) Método calcularIMC(): calculara si la persona está en su peso ideal (peso en 
    kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, 
    significa que la persona está por debajo de su peso ideal y la función devuelve 
    un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), 
    significa que la persona está en su peso ideal y la función devuelve un 0. 
    Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa 
    que la persona tiene sobrepeso, y la función devuelve un 1.
    */    
    public int calcularIMC(){
        //se puede obviar la variable poniendo su asignación como condición del if
        double formula = individuo.getPeso()/(Math.pow(individuo.getAltura(), 2));
        if (formula < 20) {
            return -1;
        } else if (formula >= 20 && formula <= 25){
            return 0;
        } else {
            return 1;
        }
    }

    
}
