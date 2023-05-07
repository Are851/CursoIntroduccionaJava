/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidadesejercicio1b;

import Entidad.Cadena;
import Servicio.Servicio;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cadena miCadena=new Cadena();
        Servicio cadena = new Servicio();

        System.out.println("Ingrese una letra:");
        String letra = sc.nextLine();

        cadena.mostrarVocales();
        cadena.invertirFrase();
        cadena.vecesRepetido(letra);
        
        // Comparar longitud de la frase con otra frase
        System.out.println("Ingrese una frase nueva:");
        String otraFrase = sc.nextLine();
        System.out.println(cadena.compararLongitud(otraFrase));

        // Unir frases
        System.out.println("Ingrese una frase para unir:");
        String unirFrase = sc.nextLine();
        cadena.unirFrases(unirFrase);

        // Reemplazar caracteres
        System.out.println("Ingrese una letra a reemplazar:");
        String letra2 = sc.nextLine(); 
        cadena.reemplazar(letra2);

        // Comprobar si contiene una letra
        System.out.println("Ingrse una letra a comparar:");
        String letraacomparar = sc.nextLine();
        cadena.contiene( letraacomparar);

    }    }
   
