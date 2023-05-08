/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author flavia
 */
public class ServicioCurso1 {
  Scanner read = new Scanner(System.in).useDelimiter("\n");

    public String[] cargarAlumnos(Curso x) {
        ///Llamo a la clase Curso con la x
    for (int i = 0; i < x.getAlumnos().length; i++) {
        System.out.println("Ingrese el nombre del alumno " + i);
        x.getAlumnos()[i] = read.next();
    }
    return x.getAlumnos();
}
///opcion2 de caargas alumnos sin parametro
    public String[] cargarAlumnos() {
        String[] ca = new String[5];
        for (int i = 0; i < ca.length; i++) {
            System.out.print("Ingrese el nombre del alumno " + i + ": ");
            ca[i] = read.next();
        }
        return ca;
    }

     public void crearCurso(Curso curs){
        System.out.print("Ingrese el nombre del curso >> ");
        curs.setNombreCurso(read.next());
        System.out.print("Ingrese la cantidad de horas por día >> ");
        curs.setCantidadHorasPorDia(read.nextDouble());
        System.out.print("Ingrese la cantidad de días por semana >> ");
        curs.setCantidadDiasPorSemana(read.nextInt());
        System.out.print("Ingrese el turno >> ");
        curs.setTurno(read.next());
        System.out.print("Ingrese el precio por hora >> ");
        curs.setPrecioPorHora(read.nextDouble());
        cargarAlumnos(curs);
    }
    
    public double calcularGananciaSemanal(Curso curs){
        return curs.getCantidadHorasPorDia() * curs.getPrecioPorHora()*
                curs.getAlumnos().length * curs.getCantidadDiasPorSemana();
    }
}
