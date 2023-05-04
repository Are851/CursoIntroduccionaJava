package ServicioCadena;
 /*Realizar una clase llamada Cadena, en el paquete de entidades, que tenga
como atributos una frase (String) 
y su longitud. Agregar constructor vacío y con atributo frase solamente. 
Agregar getters y setters.
El constructor con frase como atributo debe setear la longitud de la frase de 
manera automática. 
Crear una clase CadenaServicio en el paquete servicios que implemente los 
siguientes métodos:
a)Método mostrarVocales(), deberá contabilizar la cantidad de vocales que 
la frase ingresada.
b)Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por 
pantalla. Por ejemplo: 
Entrada: "casa blanca", Salida: "acnalb asac".
C)Método vecesRepetido(String letra), recibirá un carácter ingresado por el 
usuario y contabilizar 
cuántas veces se repite el carácter en la frase, por ejemplo:
d)Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e)Método compararLongitud(String frase), deberá comparar la longitud de la
frase que compone la clase con 
otra nueva frase ingresada por el usuario.
F)Método unirFrases(String frase), deberá unir la frase contenida en la clase 
Cadena con una nueva 
frase ingresada por el usuario y mostrar la frase resultante.
G)Método reemplazar(String letra), deberá reemplazar todas las letras “a” que
se encuentren en la frase, 
por algún otro carácter seleccionado por el usuario y mostrar la frase 
resultante.
h)Método contiene(String letra), deberá comprobar si la frase contiene una 
letra que ingresa el usuario y 
devuelve verdadero si la contiene y falso si no.

 */

import Entidad.CadenaClase;
import java.util.Scanner;


public class CadenaServicio {
    Scanner leer = new Scanner(System.in);
    CadenaClase c1 = new CadenaClase("aguante boca");
    String letra;
    //Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada
    public void MostrarVocales(){
        int cont = 0;
        for (int i = 0; i < c1.getLongitud(); i++) {
            
            char c = c1.getFrase().charAt(i);
            if (c == 'a' || c == 'e'|| c == 'i'|| c == 'o' || c == 'u'|| 
                c == 'A'|| c == 'E'|| c == 'I' || c == 'O'|| c == 'U'){
            cont++;
            }
            
        }
        System.out.println("las vocales son =" + cont);
    }
    //Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: 
    //Entrada: "casa blanca", Salida: "acnalb asac".
    
    public void InverirFrase(){
         
        StringBuilder cs = new StringBuilder(c1.getFrase());
        System.out.println("la frase invertida quedaria asi ; " + cs.reverse());
    }
    //Método vecesRepetido(String letra), recibirá un carácter ingresado por el 
    //usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    public void VecesRepetido(String letra){
         int cont = 0;
            char letrac = letra.charAt(0);
            for (int i = 0; i < c1.getLongitud(); i++) {
            
            if (letrac == c1.getFrase().charAt(i)){
            cont++;
            }
        
        
    }
                System.out.println("El carácter " + letrac + " se repite " + cont + " veces.");
}
    //Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con 
    //otra nueva frase ingresada por el usuario.
    public void CompararLongitud(String frase2){
        if (c1.getLongitud()== frase2.length()){
            System.out.println("las frases tinen la misma longitud");
        }else 
            System.out.println("no tienen la misma longitud :) ");
        }
    //Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva 
    //frase ingresada por el usuario y mostrar la frase resultante.
    public void UnirFrase(String frase){
        System.out.println(c1.getFrase()+"////"+ frase );
    }
    //Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, 
    //por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
    public void Remplazar(){
        System.out.println("por que caracter desea remplazar la letra a?");
        letra=leer.next();
        String frase3 = c1.getFrase().replace('a', letra.charAt(0));
        System.out.println("la frase queda asi " + frase3);
    }
    //Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y 
    //devuelve verdadero si la contiene y falso si no.
    public boolean Contiene(){
        System.out.println("ingresa letra a comparar");
        String frase = leer.next();
        return c1.getFrase().contains(frase);
       
    }
    }
   

