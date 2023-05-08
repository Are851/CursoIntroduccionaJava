
package Ejercicio1ALibroStatic;


public class Main {
   public static void main(String[] args) {
        
        Libro ingreso1 = new Libro();

       Libro.cargarLibro(ingreso1); //estatico se puede llamar a traves de la clase.
       Libro.mostrarLibro(ingreso1); // si no es estatico debo crear una instancia y luego llamar al metodo.
       
    } 
}
