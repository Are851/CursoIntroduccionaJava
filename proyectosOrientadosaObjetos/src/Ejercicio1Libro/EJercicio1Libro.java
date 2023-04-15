//// Crear una clase llamada EJercicio1Libro que contenga los siguientes atributos: 
//ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos
//pasados por parámetro y un constructor vacío. Crear un método para cargar un 
//libro pidiendo los datos al usuario y luego informar mediante otro método el 
//número de ISBN, el título, el autor del libro y el número de páginas.
package Ejercicio1Libro;


public class EJercicio1Libro {
    
        
    public static void main(String[] args) {
        // Crear un objeto de la clase Libro
        Libro libro = new Libro();

        // Cargar los datos del libro
        libro.cargarLibro();

        // Imprimir los datos del libro
        libro.informarLibro();
    }
}
 
