package Main;
import java.util.Scanner;
import Entidad.Ej1Cadena;
import Servicios.ServicioCadena1;

public class MainCadena {
 public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String frase = leer.nextLine();
        Ej1Cadena miCadena = new Ej1Cadena(frase);
        ServicioCadena1 miServicio = new ServicioCadena1();
          
        // Mostrar número de vocales
        miServicio.mostrarVocales(miCadena);

        // Invertir la frase
        miServicio.invertirFrase(miCadena);

        // Contar veces que se repite una letra
        System.out.println("Ingrese una letra:");
        String letra = leer.nextLine();
        miServicio.vecesRepetido(miCadena, letra);

        // Comparar longitud de la frase con otra frase
        System.out.println("Ingrese una frase nueva:");
        String otraFrase = leer.nextLine();
        System.out.println(miServicio.compararLongitud(miCadena, otraFrase));

        // Unir frases
        System.out.println("Ingrese una frase para unir:");
        String unirFrase = leer.nextLine();
        miServicio.unirFrases(miCadena,unirFrase);

        // Reemplazar caracteres
        System.out.println("Ingrese una letra a reemplazar:");
        String letraareemplazar = leer.nextLine();
        System.out.println("Ingrese una letra de reemplazo:");
        String reemplazo = leer.nextLine();
        miServicio.reemplazar(miCadena, letraareemplazar, reemplazo);
        
        // Comprobar si contiene una letra
        System.out.println("Ingrese una letra a comparar:");
        String letraacomparar = leer.nextLine();
        miServicio.contiene(miCadena,letraacomparar);

    }

}

