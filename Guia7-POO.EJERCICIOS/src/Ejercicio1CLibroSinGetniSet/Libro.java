package Ejercicio1CLibroSinGetniSet;

//// Crear una clase llamada Libro que contenga los siguientes atributos: 

import java.util.Scanner;

//ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos
//pasados por parámetro y un constructor vacío. Crear un método para cargar un 
//libro pidiendo los datos al usuario y luego informar mediante otro método el 
//número de ISBN, el título, el autor del libro y el número de páginas.

public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private int numPaginas;

    public Libro() {
        // Constructor vacío
    }

    public Libro(String isbn, String titulo, String autor, int numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public void cargarLibro() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de ISBN: ");
        this.isbn = scanner.nextLine();

        System.out.print("Ingrese el título del libro: ");
        this.titulo = scanner.nextLine();

        System.out.print("Ingrese el nombre del autor: ");
        this.autor = scanner.nextLine();

        System.out.print("Ingrese el número de páginas: ");
        this.numPaginas = scanner.nextInt();
    }

    public void informarLibro() {
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.numPaginas);
    }
  }
   