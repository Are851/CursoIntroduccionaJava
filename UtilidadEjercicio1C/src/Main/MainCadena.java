
package Main;

import ServicioCadena.CadenaServicio;
import java.util.Scanner;


public class MainCadena {
    public static void main(String[] args) {
        CadenaServicio serv =new CadenaServicio();
        Scanner leer= new Scanner(System.in);
        serv.MostrarVocales();
        serv.InverirFrase();
        System.out.println("Ingresar letra para ver cuantas veces esta repetido");
        String letra=(leer.nextLine());
        serv.VecesRepetido(letra);
        System.out.println("Ingrese Frase para comparar longitud");
        String frase2=(leer.nextLine());
        serv.CompararLongitud(frase2);
        System.out.println("Ingrese Frase para a unir");
        String frase=(leer.nextLine());
        serv.UnirFrase(frase);
        serv.Remplazar();
        if (serv.Contiene())
        System.out.println("La palabra contiene la letra ingresada");
        else
            System.out.println("La palabra no contien la letra ingresada");
        
        
        
        
    }
   
}
