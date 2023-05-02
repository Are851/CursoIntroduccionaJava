
package Main;

import Entidad.ParDeNumeros;
import utilidadejercicio2.UtilidadEjercicio2;


public class MainParDeNumeros {
    public static void main(String[] args) {
    ParDeNumeros par=new ParDeNumeros();
    UtilidadEjercicio2 number=new UtilidadEjercicio2();
    
    number.crearPar();
    number.mostrarValores(par);
    System.out.println(number.devolverMayor(par));
    System.out.println(number.calcularPotencia(par));
    System.out.println(number.calcularRaiz(par));
    
    
    
    
    
    }
}
