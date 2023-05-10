/*
Tiene un blucle que vuelve a pedir numero de mes hasta adivinar
 */
package Servicio;

import Entidad.Meses;
import java.util.Scanner;

public class ServicioMeses1 {

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

        while (!mesIngresado.equals(ms.getMesSecreto())) {
            System.out.println("Lo siento, el mes secreto no es " + mesIngresado);
            do {
                System.out.print("Ingresa el número del mes: ");
                numeroIngresado = sc.nextInt();

                if (numeroIngresado < 1 || numeroIngresado > 12) {
                    System.out.println("El número ingresado no es válido. Debe ser un número entre 1 y 12.");
                }
            } while (numeroIngresado < 1 || numeroIngresado > 12);

            mesIngresado = ms.getMeses()[numeroIngresado - 1];
            /*
Tiene un blucle que vuelve a pedir numero de mes hasta adivinar
 */
        }

        System.out.println("¡Adivinaste el mes secreto! "+"El mes es "+mesIngresado);
    }
}

