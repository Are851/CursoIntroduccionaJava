/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosEjerciciosextras;

 import java.util.Random;

public class Ejercicioextra4 {

    public static double calcularPromedio(double[] notas) {
        double promedio = (double) ((notas[0] * 0.1) + (notas[1] * 0.15) + (notas[2] * 0.25) + (notas[3] * 0.5));
        return promedio;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int aprobados = 0;
        int desaprobados = 0;

        // Generar notas aleatorias para cada uno de los alumnos y almacenarlas en una matriz
        double[][] notasAlumnos = new double[10][4];
        for (int i = 0; i < 10; i++) {
            notasAlumnos[i][0] = rand.nextDouble() * (7) + 4; // Nota primer práctico
            notasAlumnos[i][1] = rand.nextDouble() * (7) + 4; // Nota segundo práctico
            notasAlumnos[i][2] = rand.nextDouble() * (7) + 4; // Nota primer integrador
            notasAlumnos[i][3] = rand.nextDouble() * (7) + 4; // Nota segundo integrador
        }
        for (int i = 0; i < 10; i++) {
    System.out.println("Notas del alumno " + (i + 1) + ":");
    for (int j = 0; j < 4; j++) {
        System.out.println("Nota " + (j + 1) + ": " + Math.floor (notasAlumnos[i][j]));
    }
    System.out.println(); // Imprimir una línea en blanco para separar los datos de cada alumno
}
        // Calcular promedio para cada alumno y actualizar contadores de aprobados y desaprobados
        
        for (int i = 0; i < 10; i++) {
            double promedio = (double) calcularPromedio(notasAlumnos[i]);
            System.out.println (" Nota promedio del alumno " + (i + 1)+" es "+Math.floor((calcularPromedio(notasAlumnos[i]))));
            if (promedio >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }

        // Imprimir resultados
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);
    }
}