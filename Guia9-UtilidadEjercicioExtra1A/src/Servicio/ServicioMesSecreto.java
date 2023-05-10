/*
Pide los datos una sola vez y no tiene un condicional para ingresar un mes 
entre 1 y 12
 */
package Servicio;

import java.util.Scanner;

import Entidad.MesSecreto;
public class ServicioMesSecreto {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public void adivineMes(MesSecreto ms){
        boolean ver;
        do {
            System.out.println("Adivine el mes\nIngrese un mes del año");
            String a = read.next();
            ver = a.equalsIgnoreCase(ms.mesSecreto);
            if (ver){
                System.out.println("Muy bien. Usted Acertó");
            }else{
                System.out.println("No ha acertado. Intente adivinarlo "
                        + "introduzca otro mes");
            }
        } while (!ver);
    }
}
