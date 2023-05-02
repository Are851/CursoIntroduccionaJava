package Servicio;

import Entidad.Empleado;
import java.util.Scanner;

public class MainEmpleado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleado[] empleados = new Empleado[6];

        for (int i = 0; i < empleados.length; i++) {
            System.out.print("Ingrese nombre del empleado ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el salario ");
            double salario = scanner.nextDouble();
            empleados[i] = new Empleado(salario, nombre);
        }
        double sumasalarios = 0;
        for (int i = 0; i < empleados.length; i++) {
            sumasalarios += empleados[i].getSalario();
        }
        double promediosalario = sumasalarios / empleados.length;
        System.out.print("el promedio de los salarios es:" + promediosalario);

        int contador = 0;
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i].getSalario() > promediosalario) {
                contador++;
            }
        }
        String[] nombresalariosmayores = new String[contador];
        contador = 0;
        ///opcion1
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i].getSalario() > promediosalario) {
                nombresalariosmayores[contador] = empleados[i].getNombre();
                contador++;
            }
            
        }
        ///opcion2 for each 
//        for (Empleado empleado : empleados) {
//            if (empleado.getSalario() > promediosalario) {
//                nombresalariosmayores[contador] = empleado.getNombre();
//                contador++;
//            }
//        }

        ///Opcion 1 for-each for (tipo nombreasignar:nombredelvector)
        for (String nombresalariosmayor : nombresalariosmayores) {
            System.out.println("EL nombre de los empelado que superan el promedio es " + nombresalariosmayor);
        }
        ///opcion2 for comun
//        for (int i = 0; i < nombresalariosmayores.length; i++) {
//            System.out.println("EL nombre de los empelado que superan el promedio es " + nombresalariosmayores[i]);
//        }

    }
}
