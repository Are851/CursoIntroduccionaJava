/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

/**
 *
 * @author flavia
 */

import Entidad.Curso;
import java.util.Scanner;

public class ServiciosCurso {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public String[] cargarAlumnos() {
        String[] ca = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del alumno " + i + ": ");
            ca[i] = read.next();
        }
        return ca;
    }

    public Curso crearCurso(Curso cur) {

        System.out.print("Ingrese nombre del curso: ");
        cur.setNombreCurso(read.next());
        System.out.print("Ingrese cantidad Horas Por Dia: ");
        cur.setCantidadHorasPorDia(read.nextDouble());
        System.out.println("Ingrese cantidad Dias PorSemana: ");
        cur.setCantidadDiasPorSemana(read.nextInt());
        System.out.print("Ingrese Turno:");
        cur.setTurno(read.next());
        System.out.print("Ingrese el precio por hora");
        cur.setPrecioPorHora(read.nextDouble());
        cur.setAlumnos(cargarAlumnos());

        return cur;
    }

    public void calcularGananciaSemanal(Curso cur) {
        double ganancia = cur.getCantidadHorasPorDia() * cur.getCantidadDiasPorSemana() * cur.getPrecioPorHora()
                * cur.getAlumnos().length;
        System.out.print("La ganacia Semanal es: " + ganancia);

    }
}    

