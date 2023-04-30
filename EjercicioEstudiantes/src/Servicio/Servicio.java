package Servicio;

import Entidad.Estudiante;
import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in);
    Estudiante[] estudiantes = new Estudiante[8];

    public Servicio() {
    }

    public void crearEstudiantes() {

        // Crear estudiantes
        estudiantes[0] = new Estudiante("Juan", 6.5);
        estudiantes[1] = new Estudiante("Pedro", 7.8);
        estudiantes[2] = new Estudiante("Ana", 8.2);
        estudiantes[3] = new Estudiante("Lucía", 5.4);
        estudiantes[4] = new Estudiante("Santiago", 6.9);
        estudiantes[5] = new Estudiante("María", 9.0);
        estudiantes[6] = new Estudiante("Roberto", 6.7);
        estudiantes[7] = new Estudiante("Luisa", 7.5);
    }
    // Calcular promedio de notas

    public void Calcularnotas() {
        double sumaNotas = 0; /// va a sumar cada nota de los estudiantes
        for (Estudiante alumnos : estudiantes) {///estudiantes es el arreglo
            sumaNotas += alumnos.getNota();
            ///estudiantes1 es el llamado al arreglo
        }
        double promedio = sumaNotas / estudiantes.length;
///estudiantes.length es una propiedad de un arreglo en Java que devuelve 
//el número de elementos en ese arreglo. En el código proporcionado, 
//estudiantes.length se utiliza para calcular el promedio de notas 
//de todos los estudiantes y para determinar cuántos estudiantes tienen una 
//nota por encima del promedio. Como el tamaño del arreglo estudiantes es 8, 
//estudiantes.length será igual a 8 en este caso.
        System.out.println("El promedio de notas de todo el curso es: "
                + promedio);

        // Alumnos con nota mayor al promedio
        Estudiante[] alumnosEncimaPromedio = new Estudiante[8];
        ///alumnosEncimaPromedio es un nuevo arreglo para cargar notas arreba
        ///del promedio
        int cantidadEncimaPromedio = 0;
        for (Estudiante alumnos1 : estudiantes) {///es un for-each
            ///alumnos1 es como es llamado el arreglo estudiantes(es como un atajo)
            if (alumnos1.getNota() > promedio) {
                alumnosEncimaPromedio[cantidadEncimaPromedio] = alumnos1;

                cantidadEncimaPromedio++;///es un contador
                System.out.println("Los estudiantes con una nota mayor al promedio son:");
                for (int i = 0; i < cantidadEncimaPromedio; i++) {
                    System.out.println(alumnosEncimaPromedio[i].getNombre() +
                            ": " + alumnosEncimaPromedio[i].getNota());
                }
            }
        }
    }
}
