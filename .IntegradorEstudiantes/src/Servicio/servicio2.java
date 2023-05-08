/// En este ejercicio usamos estudiantes.length para medir el arreglo
///for (int i = 0; i < estudiantes.length; i++) {
///estudiantes.length es una propiedad de un arreglo en Java que devuelve 
//el número de elementos en ese arreglo. En el código proporcionado, 
//estudiantes.length se utiliza para calcular el promedio de notas 
//de todos los estudiantes y para determinar cuántos estudiantes tienen una 
//nota por encima del promedio. Como el tamaño del arreglo estudiantes es 8, 
//estudiantes.length será igual a 8 en este caso.
package Servicio;

import Entidad.Estudiante;
import java.util.Scanner;

public class servicio2 {

    Scanner leer = new Scanner(System.in);
    Estudiante[] estudiantes = new Estudiante[8];

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

        double sumaNotas = 0;
        for (int i = 0; i < estudiantes.length; i++) {
///estudiantes.length es una propiedad de un arreglo en Java que devuelve 
//el número de elementos en ese arreglo. En el código proporcionado, 
//estudiantes.length se utiliza para calcular el promedio de notas 
//de todos los estudiantes y para determinar cuántos estudiantes tienen una 
//nota por encima del promedio. Como el tamaño del arreglo estudiantes es 8, 
//estudiantes.length será igual a 8 en este caso.
            sumaNotas += estudiantes[i].getNota();
        }
        double promedio = sumaNotas / estudiantes.length;
        System.out.println("El promedio de notas de todo el curso es: " 
                + promedio);

        // Alumnos con nota mayor al promedio
        Estudiante[] alumnosEncimaPromedio = new Estudiante[8];
        int cantidadEncimaPromedio = 0;
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getNota() > promedio) {
                alumnosEncimaPromedio[cantidadEncimaPromedio] = estudiantes[i];
                cantidadEncimaPromedio++;
                // Mostrar lista de estudiantes con nota mayor al promedio
                System.out.println("Estudiantes con nota mayor al promedio:");
            }
        }
        for (int i = 0; i < cantidadEncimaPromedio; i++) {
            System.out.println(alumnosEncimaPromedio[i].getNombre() + " - " 
                    + alumnosEncimaPromedio[i].getNota());
        }

    }
}
