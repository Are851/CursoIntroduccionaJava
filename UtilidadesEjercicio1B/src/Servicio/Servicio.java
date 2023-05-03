/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author flavia
 */
public class Servicio {


    Scanner leer = new Scanner(System.in);
    Cadena texto = new Cadena("Hola mundo");

    public void mostrarVocales() {
        int vocales = 0;
        String frase = texto.getFrase().toUpperCase();
        for (int i = 0; i < frase.length(); i++) {
            if (frase.substring(i,i+1).equals("A") ||
                    frase.substring(i,i+1).equals("E") ||
                    frase.substring(i,i+1).equals("I") ||
                    frase.substring(i,i+1).equals("O") ||
                    frase.substring(i,i+1).equals("U")){
                vocales ++;
            }            
        }
        System.out.println("La cantidad de vocales es " +vocales );
    }
    
    public void invertirFrase(){
        String letra="";
        System.out.println(texto.getLongitud());
        for (int i = texto.getLongitud(); i>0 ; i--) {  
            letra = letra.concat(texto.getFrase().substring(i-1,i));
        }
        System.out.println(letra);
    }

    public void vecesRepetido(String letra){          
        int contador = 0;
        for (int i = 0; i <texto.getLongitud(); i++){
            if(texto.getFrase().substring(i,i+1).equalsIgnoreCase(letra)){
                contador ++;
            }
        }
        System.out.println("La letra aparece "+contador+" veces.");
    }
    
    public String compararLongitud(String otraFrase) {
        if (texto.getLongitud() == otraFrase.length()) {
            return "Las frases tienen la misma longitud: " + texto.getLongitud();
        } else {
            return "La frase almacenada tiene longitud " + texto.getLongitud() + "\n"
                    + "La frase ingresada tiene longitud: " + otraFrase.length();
        }
    }

    public void unirFrases( String unirFrase) {
        System.out.println(texto.getFrase().concat(" " + unirFrase));
    }

//    public void reemplazar(String letraareemplazar, String reemplazo) {
//        System.out.println(texto.getFrase().replace(letraareemplazar, reemplazo));
//    }
    public void reemplazar(String fraseA) {
        String fraseA = "";
        for (int i = 0; i < texto.getLongitud(); i++) {
            if (texto.getFrase().substring(i, i + 1).equalsIgnoreCase("a")) {
                fraseA = fraseA.concat(letra)2;
            } else {
                fraseA = fraseA.concat(texto.getFrase().substring(i, i + 1));
            }
        }
        System.out.print(fraseA+"\n");
    }
    public void contiene( String letraacomparar) {
        if (texto.getFrase().contains(letraacomparar)) {
            System.out.println("La frase contiene a la " + letraacomparar);
            }
        else {
        System.out.println("La frase contiene a la "+ letraacomparar);
    }
        
    }
    }
