
package Main;


import Entidad.NIF;
import Servicios.Servicios;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Servicios servicios = new Servicios();
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dni: ");
        int cantidadNifs = leer.nextInt();
        NIF[] nifs = new NIF[cantidadNifs];

// Crear NIFs
for (int i = 1; i < cantidadNifs; i++) {
    nifs[i] = new NIF();
    servicios.crearNif(nifs[i]);
}
            // Mostrar NIFs recorremos el arreglo nifs
        for (int i = 0; i < nifs.length; i++) {
        servicios.mostrar(nifs[i]);
//        nifs.length
////        En el segundo bucle "for", se utiliza la propiedad "length" de 
//          la matriz "nifs" en lugar de la variable "cantidadNifs"
//          porque la propiedad "length" es la forma correcta y segura de 
//          obtener el tamaño de una matriz en Java.La propiedad "length"
//          de una matriz en Java devuelve el número de elementos en la
//          matriz.Si se utiliza la variable "cantidadNifs" en su lugar
////            , el código podría generar un error si la variable 
//            no se actualiza correctamente durante la ejecución del  programa,
//                      lo que podría provocar errores en tiempo de ejecución
////            . Por lo tanto
////            , es más seguro y recomendable utilizar la propiedad 
//              "length" para obtener el tamaño de la matriz.
    }
        ///OPCION 2 SE USA UN FOR EACH
        // Muestra el arreglo de NIFs que creamos en el punto 15
//   /// se usa el FOR EACH  que es parecido al for pero para mostrar arreglos.
//        for (NIF nif : nifs) {
//            servicios.mostrar(nif);
        }
    }
