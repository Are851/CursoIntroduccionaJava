///Desarrollar una clase Cancion con los siguientes atributos: título y autor.
///Se deberá definir además dos constructores: uno vacío que inicializa el
//título y el autor a cadenas vacías y otro que reciba como parámetros el 
///título y el autor de la canción. 
///Se deberán además definir los métodos getters y setters correspondientes.
package EjercExtra1ACongetySet;

import java.util.Scanner;

public class Cancion {
///Atributos
public String titulo;
public String Autor;
    
///Constructor vacio
public Cancion() {
    }

    public Cancion(String titulo, String Autor) {
        this.titulo = titulo;
        this.Autor = Autor;
    }

    public String getAutor() {
        return Autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

        public void Cargarautor() {
          Scanner cancion = new Scanner(System.in);
        System.out.print("Ingrese Autor: ");
        this.Autor = cancion.nextLine();
        System.out.print("Ingrese titulo: ");
        this.titulo = cancion.nextLine();
        System.out.println("Autor: "+this.Autor+" Titulo: "+ this.titulo);
   
        }
         }
    

