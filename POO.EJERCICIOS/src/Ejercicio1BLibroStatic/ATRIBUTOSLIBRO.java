
package Ejercicio1BLibroStatic;

import java.util.Scanner;

/**
 *
 * @author flavia
 */
public class ATRIBUTOSLIBRO {
   
    public int ISBN;
    public String Titulo;
    public String Autor;
    public int NumeroDePaginas;

    public ATRIBUTOSLIBRO() {
    }

    public ATRIBUTOSLIBRO(int ISBN, String Titulo, String Autor, int NumeroDePaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroDePaginas = NumeroDePaginas;
    }
    

    public void libroCarga() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero de ISBN del libro: ");
        this.ISBN = sc.nextInt();
        System.out.print("Ingrese el titulo del libro: ");
        this.Titulo = sc.next();
        System.out.print("Ingrese el autor del libro: ");
        this.Autor = sc.next();
        System.out.print("Ingrese la cantidad de paginas del libro: ");
        this.NumeroDePaginas = sc.nextInt();
    }
       

    @Override
    public String toString() {
        
        //return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", NumeroDePaginas=" + NumeroDePaginas + '}';
        return "El libro " + Titulo + " de " + Autor + " cuyo ISBN es " + ISBN + " tiene " + NumeroDePaginas + " paginas";
    }
    
} 

