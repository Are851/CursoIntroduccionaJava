/*
A diferencia de Servicio en este cargamos opcion2 arreglo estudiantes por forç
y calcular notas con for comun y opcion2 cargar for-each.
 */
package Servicio;

import java.util.Scanner;
import Entidad.Estudiante;

public class Servicio1 {

    Scanner leer = new Scanner(System.in);
    Estudiante[] estudiantes = new Estudiante[8];
//La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear 
///los 8. El enunciado pide 8 alumnos.
    // Método para crear el arreglo de estudiantes

    public void crearEstudiantes() {
        // Crear estudiantes
        ///opcion1 cargando los datos de los estudiantes
        estudiantes[0] = new Estudiante("Juan", 6.5);
        estudiantes[1] = new Estudiante("Pedro", 7.8);
        estudiantes[2] = new Estudiante("Ana", 8.2);
        estudiantes[3] = new Estudiante("Lucía", 5.4);
        estudiantes[4] = new Estudiante("Santiago", 6.9);
        estudiantes[5] = new Estudiante("María", 9.0);
        estudiantes[6] = new Estudiante("Roberto", 6.7);
        estudiantes[7] = new Estudiante("Luisa", 7.5);
        ///opcion 2
        // Loop para crear cada estudiante y agregarlo al arreglo
//        for (int i = 0; i < 8; i++) {
//            System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ":");
//            String nombre = leer.nextLine();
//
//            System.out.println("Ingrese la nota del estudiante " + (i + 1) + ":");
//            double nota = leer.nextDouble();
//            leer.nextLine(); // Para consumir el salto de línea después de la nota
//        }
    }

    // Calcular promedio de notas
    public void Calcularnotas() {
        double sumaNotas = 0;
        ///opcion A con for tradicional

        ///opcion 1
        for (int i = 0; i < 8; i++) {
            sumaNotas += estudiantes[i].getNota();
        }

        ///opcion 2
//      
//        for (Estudiante alumno1 : estudiantes) { ///for-each
//            sumaNotas += alumno1.getNota();
//        }
        double promedio = sumaNotas / estudiantes.length;
        System.out.println("El promedio de notas de todo el curso es: " + promedio);

        // Alumnos con nota mayor al promedio
        Estudiante[] alumnosEncimaPromedio = new Estudiante[estudiantes.length];
        int cantidadEncimaPromedio = 0;
        ///opcion 1
        for (int i = 0; i < 8; i++) {
            if (estudiantes[i].getNota() > promedio) {
                alumnosEncimaPromedio[cantidadEncimaPromedio] = estudiantes[i];
                cantidadEncimaPromedio++;
            }
            ///opcion 2
//        for (Estudiante estudiante : estudiantes) {
//            if (estudiante.getNota() > promedio) {
//                alumnosEncimaPromedio[cantidadEncimaPromedio] = estudiante;
//                cantidadEncimaPromedio++;
//            }
        }
///opcion B

//        for (int i = 0; i < estudiantes.length; i++) {
/////estudiantes.length es una propiedad de un arreglo en Java que devuelve 
////el número de elementos en ese arreglo. En el código proporcionado, 
////estudiantes.length se utiliza para calcular el promedio de notas 
////de todos los estudiantes y para determinar cuántos estudiantes tienen una 
////nota por encima del promedio. Como el tamaño del arreglo estudiantes es 8, 
////estudiantes.length será igual a 8 en este caso.
//            sumaNotas += estudiantes[i].getNota();
//        }
//        double promedio = sumaNotas / estudiantes.length;
//        System.out.println("El promedio de notas de todo el curso es: " 
//                + promedio);
//
//        // Alumnos con nota mayor al promedio
//        Estudiante[] alumnosEncimaPromedio = new Estudiante[8];
//        int cantidadEncimaPromedio = 0;
//        for (int i = 0; i < estudiantes.length; i++) {
//            if (estudiantes[i].getNota() > promedio) {
//                alumnosEncimaPromedio[cantidadEncimaPromedio] = estudiantes[i];
//                cantidadEncimaPromedio++;
//                // Mostrar lista de estudiantes con nota mayor al promedio
//                System.out.println("Estudiantes con nota mayor al promedio:");
//            }
//        }
//        for (int i = 0; i < cantidadEncimaPromedio; i++) {
//            System.out.println(alumnosEncimaPromedio[i].getNombre() + " - " 
//                    + alumnosEncimaPromedio[i].getNota());
//        }
//
//    }
//        // Mostrar lista de estudiantes con nota mayor al promedio
        System.out.println("Estudiantes con nota mayor al promedio:");
        for (int i = 0; i < cantidadEncimaPromedio; i++) {
            System.out.println(alumnosEncimaPromedio[i].getNombre() + " - " + alumnosEncimaPromedio[i].getNota());
        }
    }
}
