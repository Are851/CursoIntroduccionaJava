
package Main;

import Servicio.Escuela;


public class Main3 {
    public static void main(String[] args) {
        Escuela escuela = new Escuela();
        double promedio = escuela.calcularPromedio();
        System.out.println("Promedio de notas del curso: " + promedio);

        String[] nombresNotasMayoresAlPromedio = escuela.obtenerNombresNotasMayoresAlPromedio();
        System.out.println("Alumnos con notas mayores al promedio:");
        for (String nombre : nombresNotasMayoresAlPromedio) {
            System.out.println(nombre);
        }

        System.out.println("Todos los estudiantes con notas mayores al promedio:");
        escuela.mostrarEstudiantesNotasMayoresAlPromedio();
    }
}    

