/*
CreUna clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año,en minúsculas.A continuación, declara una 
variable mes Secreto de tipo String,y hazla igual a un elemento del 
array(porejemplo,mesSecreto=mes[9]. El programa debe pedir al usuario
que adivine el mes secreto.Si el usuario acierta mostrar un mensaje,y si no 
lo hace,pedir que vuelva a intentar adivinar el mes secreto.
Un ejemplo de ejecución del programa podría ser este: Adivine el mes secreto.
Introduzca el nombre del mes en minúsculas: febrero No ha acertado.
Intente adivinarlo introduciendo otro mes: agosto ¡Haacertado!
 */
package Servicio;

import Entidad.Meses;
import java.util.Scanner;

public class ServicioMeses {

    Scanner sc = new Scanner(System.in);

// Mostrar el menú de opciones.
    public void adivinarMesSecreto(Meses ms) {
        System.out.println("Tienes que adivinar el mes secreto");
        System.out.println("--------------------------------");
        System.out.println("1. Enero");
        System.out.println("2. Febrero");
        System.out.println("3. Marzo");
        System.out.println("4. Abril");
        System.out.println("5. Mayo");
        System.out.println("6. Junio");
        System.out.println("7. Julio");
        System.out.println("8. Agosto");
        System.out.println("9. Septiembre");
        System.out.println("10. Octubre");
        System.out.println("11. Noviembre");
        System.out.println("12. Diciembre");

        int numeroIngresado;
        do {
            System.out.print("Ingresa el número del mes: ");
            numeroIngresado = sc.nextInt();

            if (numeroIngresado < 1 || numeroIngresado > 12) {
                System.out.println("El número ingresado no es válido. Debe ser un número entre 1 y 12.");
            }
        } while (numeroIngresado < 1 || numeroIngresado > 12);

        String mesIngresado = ms.getMeses()[numeroIngresado - 1];

            if (mesIngresado.equals(ms.getMesSecreto())) {
                System.out.println("¡Adivinaste el mes secreto!");
            } else {
                System.out.println("Lo siento, el mes secreto era " + ms.getMesSecreto());
            }

    }
}
