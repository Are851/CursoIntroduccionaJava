/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Estudiante;

/**
 *
 * @author flavia
 */
public class Escuela {
    private Estudiante[] estudiantes;

    public Escuela() {
        estudiantes = new Estudiante[8];
        estudiantes[0] = new Estudiante("Juan", 7.5);
        estudiantes[1] = new Estudiante("Maria", 8.2);
        estudiantes[2] = new Estudiante("Pedro", 6.8);
        estudiantes[3] = new Estudiante("Laura", 9.1);
        estudiantes[4] = new Estudiante("Carlos", 5.9);
        estudiantes[5] = new Estudiante("Ana", 8.7);
        estudiantes[6] = new Estudiante("Jorge", 7.3);
        estudiantes[7] = new Estudiante("Luisa", 6.5);
    }

    public double calcularPromedio() {
        double sum = 0.0;
        for (Estudiante estudiante : estudiantes) {
            sum += estudiante.getNota();
        }
        return sum / estudiantes.length;
    }

    public String[] obtenerNombresNotasMayoresAlPromedio() {
        double promedio = calcularPromedio();
        int count = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                count++;
            }
        }
        String[] nombres = new String[count];
        int index = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                nombres[index] = estudiante.getNombre();
                index++;
            }
        }
        return nombres;
    }

    public void mostrarEstudiantesNotasMayoresAlPromedio() {
        double promedio = calcularPromedio();
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                System.out.println(estudiante.getNombre() + " - " + estudiante.getNota());
            }
        }
    }
}   

