/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.Curso;
import Servicio.ServiciosCurso;

/**
 *
 * @author flavia
 */
public class Main {


    public static void main(String[] args) {

        ServiciosCurso sc1 = new ServiciosCurso();
        Curso c1 = new Curso();

        System.out.println(c1.toString());
        for (int i = 0; i < 5; i++) {
            System.out.println(c1.getAlumnos()[i]);
        }

        sc1.calcularGananciaSemanal(c1);

    }

}
