/*
Realizar una clase llamadaCadena,en el paquete de entidades,que tenga como 
atributos una frase String) y su longitud. Agregar constructor vacío y con 
atributo frase solamente.Agregar getters y setters. El constructor con frase
como atributo debe setear la longitud de la frase de manera automática.
Crear una clase CadenaServicio en el paquete servicios que implemente los 
siguientes métodos: a)MétodomostrarVocales(), deberá contabilizar la cantidad 
de vocales que tiene la frase ingresada. 
b)Método invertirFrase(),deberá invertir la frase ingresada y mostrarla por 
pantalla.Por ejemplo:Entrada:"casablanca",Salida:"acnalb asac". 
c)Método vecesRepetido(Stringletra),recibirá un carácter ingresado por el 
usuario y contabilizar cuántas veces se repite el carácter en la frase,
porejemplo:  d)Entrada:frase="casablanca".Salida:Elcarácter'a'serepite4 veces. 
e)MétodocompararLongitud(Stringfrase),deberá comparar la longitud de la 
frase que compone la clase con otra nueva frase ingresa da por elusuario. 
f)MétodounirFrases(Stringfrase),deberá unir la frase contenida en la clase 
Cadena con una nueva frase ingresada por el usuario y mostrar la frase 
resultante. 
g)Métodoreemplazar(Stringletra),deberá reemplazar todas las letras “a” que se 
encuentren en la frase,por algúno tro carácter seleccionado por el usuario y 
mostrar la frase resultante. 
h)Métodocontiene(Stringletra),deberá comprobar si la frase contiene una letra
que ingresa el usuario y devuelve verdadero si la contiene y falsosino.
 */
package Servicios;

import Entidad.Ej1Cadena;
import java.util.Scanner;


public class ServicioCadena {
    private Ej1Cadena cadena;


    public Ej1Cadena crearCadena(String a) {
        return new Ej1Cadena(a);
    }
///opcion 1
    public String mostrarVocales(Ej1Cadena cadena) {
        int cont = 0;
        for (char caracter : cadena.getFrase().toLowerCase().toCharArray()) {
        ///for-each
            if ("aeiou".contains(String.valueOf(caracter))) {
                cont++;
            }
        }
        return "La cadena tiene " + cont + " vocales.";
    }
///opcion 2
//     public void mostrarVocales(Ej1Cadena cadena) {
//        int contador = 0;
//        String vocales = "aeiouAEIOU";
//        for (int i = 0; i < cadena.getFrase().length(); i++) {
//            if (vocales.contains(String.valueOf(cadena.getFrase().charAt(i)))) {
//                contador++;
//            }
//        }
//        System.out.println("La frase contiene " + contador + " vocales");
//    }
    ///opcion1
    public String invertirFrase(Ej1Cadena cadena) {
        String frase = cadena.getFrase();
        String fraseInvertida = "";

        for (int i = cadena.getLongitud()/*otra formafrase.length()*/ - 1; i >= 0; i--) {
            fraseInvertida += frase.charAt(i);
        } ///Chart() da la letra en un posicón. En este caso el valor de i.
        return fraseInvertida;
    }
    ///opcion2
//   public void invertirFrase(Ej1Cadena cadena) {
//        StringBuilder builder = new StringBuilder(cadena.getFrase());
//        builder.reverse();
//        System.out.println("La frase invertida es: " + builder.toString());
//    }
    public void vecesRepetido(Ej1Cadena cadena, char letra) {
        int contador = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().charAt(i) == letra) {
                contador++;
            }
        }
        System.out.println("El carácter '" + letra + "' se repite " + contador + " veces.");
    }
    ///opcion2
//        public void vecesRepetido(Ej1Cadena cadena, String letra) {
////        int contador = 0;
////        for (int i = 0; i < cadena.getLongitud(); i++) {
//            if (cadena.getFrase().charAt(i) == letra.charAt(0)) {
//                contador++;
//            }
//        System.out.println("El carácter '" + letra + "' se repite " + contador + " veces.");
//
//        }
//    }
    public void compararLongitud(String frase) {
        int longitud = cadena.getLongitud();
        if (longitud == frase.length()) {
            System.out.println("Las frases tienen la misma longitud.");
        } else if (longitud > frase.length()) {
            System.out.println("La frase original es más larga que la ingresada.");
        } else {
            System.out.println("La frase ingresada es más larga que la original.");
        }
    }
//    opcion2
//     public String compararLongitud(Ej1Cadena cadena, String otraFrase){
//        if (cadena.getLongitud() == otraFrase.length()) {
//            return "Las frases tienen la misma longitud: " + cadena.getLongitud();
//        }else{
//            return "La frase almacenada tiene longitud " + cadena.getLongitud() + "\n"
//                    + "La frase ingresada tiene longitud: " + otraFrase.length();
//        }
//    }
        public String unirFrases(String frase) {
        return cadena.getFrase() + " " + frase;
    }

    public String reemplazar(String letra, String reemplazo) {
        return cadena.getFrase().replace(letra, reemplazo);
    }

    public boolean contiene(String letra) {
        return cadena.getFrase().contains(letra);
    }
    
 
    
}

