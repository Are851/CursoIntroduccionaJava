
package Main;


import Entidad.NIF;
import Servicios.Servicios1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Servicios1 servicios = new Servicios1();
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dni: ");
        int cantidadNifs = leer.nextInt();
        NIF[] nifs = new NIF[cantidadNifs];

        // Crear NIFs
        for (int i = 0; i < cantidadNifs; i++) {
            nifs[i] = new NIF();
            servicios.crearNif(nifs[i]);
        }

        // Mostrar NIFs
        for (NIF nif : nifs) {
            servicios.mostrar(nif);
        }
    }
}