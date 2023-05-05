
package Servicio;

import Entidad.Curso;
    import java.util.Scanner ;

public class ServicioCurso {
         Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void cargarAlumnos(Curso curs){
        System.out.println("Ingrese los nombres de sus alumnos");
        for (int i = 0; i < curs.getAlumnos().length; i++) {
            System.out.print((i+1) + ">> ");
            curs.getAlumnos()[i] = read.next();
        }
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

