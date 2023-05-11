/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.Curso;
import Servicio.ServicioCurso1;
import java.util.Arrays;

public class Main1 {

    public static void main(String[] args) {
        Curso curso = new Curso();
        ServicioCurso1 curs = new ServicioCurso1();
        System.out.println("Los nombres de los alumnos son:");
        curs.cargarAlumnos();
        ///cargo alumnos sin parametros como void  opcion1
        System.out.println(Arrays.toString(curso.getAlumnos()));
        curs.crearCurso(curso);
        System.out.println("La ganancia semanal es: $" + curs.calcularGananciaSemanal(curso));
            
///opcion 2 retorna el valor del tipo vector String sin parametros
//        System.out.println(curs.cargarAlumnos());
//        ///trae la funcion sin parametros opcion2

    }
}
