/* EJERCICIO 3 GUIA 8
Realizar una clase llamada Persona en el paquete de entidades que tengan 
los siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, 
‘O’ para otro), peso y altura. Si desea añadir algún otro atributo, puede 
hacerlo. Agregar constructores, getters y setters.
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
================================================================================
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, 
llamaremos todos los métodos para cada objeto, deberá comprobar si la persona 
está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e 
indicar para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y 
esMayorDeEdad en distintas variables(arrays), para después calcular un 
porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas 
en su peso ideal y cuantos, por encima, y también calcularemos un porcentaje 
de cuantos son mayores de edad y cuantos menores. Para esto, podemos crear 
unos métodos adicionales.
================================================================================
 */
package guia8_ej03_main;

import Servicios.PersonaServicio;
import java.util.Scanner;

public class Guia8_Ej03_main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");

        //Crear 4 objetos de tipo Persona con distintos valores
        System.out.print("Cuántas personas desea cargar? ");
        int cantidad = read.nextInt();
        //instanciar el array de objetos
        PersonaServicio sujeto[] = new PersonaServicio[cantidad];
        //crear los objetos y guardarlos en el array instanciado
        for (int i = 0; i < cantidad; i++) {
            System.out.println((i+1) + "° persona");
            PersonaServicio j = new PersonaServicio();
            j.crearPersona();
            sujeto[i]=j;
        }
        
        //verificar los datos guardados en el array (no se pide)
        for (int i = 0; i < cantidad; i++) {
            System.out.println("\n" + (i+1) + "° persona:");
            System.out.print(sujeto[i].toString());
        }
        
        //llamaremos todos los métodos para cada objeto
        //comprobar si la persona está en su peso ideal y si es mayor de edad
        //guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad 
        //en distintas variables(arrays)
        boolean edad[]= new boolean[cantidad];
        int pesoIdeal[] = new int[cantidad];
        int contEdad = 0;
        int contPesoBajo = 0;
        int contPesoIdeal = 0;
        int contSobrePeso = 0;

        for (int i = 0; i < cantidad; i++) {
            if (sujeto[i].esMayorDeEdad() == true) { //indicar para cada objeto si la persona es mayor de edad
                edad[i] = true;
                contEdad++;
            } else {
                edad[i] = false;
            }
            switch (sujeto[i].calcularIMC()){ //comprobar si la persona está en su peso ideal 
                case -1: 
                    pesoIdeal[i] = -1;
                    contPesoBajo++;
                    break;
                case 0:
                    pesoIdeal[i] = 0;
                    contPesoIdeal++;
                    break;
                case 1:
                    pesoIdeal[i] = 1;
                    contSobrePeso++;
                    break;
            }
        }
        
        //también calcularemos un porcentaje de cuantos son mayores de edad y 
        //cuantos menores. Para esto, podemos crear unos métodos adicionales.
        //calcular un porcentaje de esas 4 personas cuantas están por debajo 
        //de su peso, cuantas en su peso ideal y cuantos, por encima

        System.out.println("\nEl porcentaje de personas mayores de edad "
                + "es igual a " + ((float)contEdad/cantidad*100));
        System.out.print("\nEl " + ((float)contPesoBajo/cantidad*100) + "% de personas está por debajo de su peso" );
        System.out.print("\nEl " + ((float)contPesoIdeal/cantidad*100) + "% de personas tiene peso ideal" ); 
        System.out.print("\nEl " + ((float)contSobrePeso/cantidad*100) + "% de personas tiene sobrepeso" );
    } 
    

}
