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
package Entidad;


public class Ej1Cadena {
private String frase;
private int longitud;

    public Ej1Cadena() {
    }

    public Ej1Cadena(String frase) {
        this.frase = frase;
        longitud=frase.length();
    
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }


    @Override
    public String toString() {
        return "Ej1Cadena{" + "frase=" + frase + ", longitud=" + longitud + '}';
    }



    }
    

