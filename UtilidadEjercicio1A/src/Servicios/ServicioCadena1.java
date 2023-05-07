/*
Realizar una clase llamadaCadena,en el paquete de entidades,que tenga como 
atributos una frase String) y su longitud. Agregar constructor vacío y con 
atributo frase solamente.Agregar getters y setters. El constructor con frase
como atributo debe setear la longitud de la frase de manera automática.
Crear una clase CadenaServicio en el paquete servicios que implemente los 
siguientes métodos: a)MétodomostrarVocales(), deberá contabilizar la cantidad 
de vocales que tiene la frase ingresada. 
b)MétodoinvertirFrase(),deberá invertir la frase ingresada y mostrarla por 
pantalla.Por ejemplo:Entrada:"casablanca",Salida:"acnalb asac". 
c)MétodovecesRepetido(Stringletra),recibirá un carácter ingresado por el 
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

public class ServicioCadena1 {

    private Ej1Cadena cadena;
    Scanner leer = new Scanner(System.in);

    public ServicioCadena1() {
    }

    public Ej1Cadena crearCadena(String a) {
        return new Ej1Cadena(a);
    }

    public void mostrarVocales(Ej1Cadena cadena) {
        int contador = 0;
        String vocales = "aeiouAEIOU";
        for (int i = 0; i < cadena.getFrase().length(); i++) {
            if (vocales.contains(String.valueOf(cadena.getFrase().charAt(i)))) {
                contador++;
            }
        }
        System.out.println("La frase contiene " + contador + " vocales");
    }

    public void invertirFrase(Ej1Cadena cadena) {
        StringBuilder builder = new StringBuilder(cadena.getFrase());
        builder.reverse();
        System.out.println("La frase invertida es: " + builder.toString());
    }

    public void vecesRepetido(Ej1Cadena cadena, String letra) {
        int contador = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().charAt(i) == letra.charAt(0)) {
                contador++;
            }
            System.out.println("El carácter '" + letra + "' se repite " + contador + " veces.");

        }
    }

    public String compararLongitud(Ej1Cadena cadena, String otraFrase) {
        if (cadena.getLongitud() == otraFrase.length()) {
            return "Las frases tienen la misma longitud: " + cadena.getLongitud();
        } else {
            return "La frase almacenada tiene longitud " + cadena.getLongitud() + "\n"
                    + "La frase ingresada tiene longitud: " + otraFrase.length();
        }
    }

    public void unirFrases(Ej1Cadena cadena, String unirFrase) {
        System.out.println(cadena.getFrase() + " " + unirFrase);
    }

    public void reemplazar(Ej1Cadena cadena, String letraareemplazar, String reemplazo) {
        System.out.println(cadena.getFrase().replace(letraareemplazar, reemplazo));
    }

    public void contiene(Ej1Cadena cadena, String letraacomparar) {
        if (cadena.getFrase().contains(letraacomparar)) {
            System.out.println("La frase contiene a la " + letraacomparar);
            }
        else {
        System.out.println("La frase contiene a la "+ letraacomparar);
    }
        
    }
}

