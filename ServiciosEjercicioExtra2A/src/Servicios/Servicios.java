package Servicios;

import Entidad.NIF;
import java.util.Scanner;

public class Servicios {

    NIF nif = new NIF();
    Scanner scanner = new Scanner(System.in);

    public char crearNif(NIF nif) {
        System.out.println("Ingrese el DNI con 8 cifras ");
        nif.setDni(scanner.nextInt());
        int posicióndni = nif.getDni() % 23;
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letras.charAt(posicióndni); 
        } 

    public void mostrar(NIF nif){
    String aux = String.valueOf((int) (nif.getDni()));
//    String.valueOf es un método estático de la clase String en Java que 
//    se utiliza para convertir un valor de cualquier tipo en una cadena 
//    de caracteres. Este método puede tomar un parámetro de cualquier
//    tipo de objeto o tipo de dato primitivo, incluyendo enteros, flotantes,
//    caracteres, etc.

    System.out.println(aux +"-" +crearNif(nif));
    }
   }
