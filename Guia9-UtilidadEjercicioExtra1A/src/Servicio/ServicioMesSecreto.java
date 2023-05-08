/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
