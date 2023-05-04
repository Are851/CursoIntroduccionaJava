
package Main;

import Entidad.ParDeNumeros;
import utilidadejercicio2.ServiciosPardeNumeros;


public class MainParDeNumeros {
    public static void main(String[] args) {
    ParDeNumeros par=new ParDeNumeros();
    ServiciosPardeNumeros number=new ServiciosPardeNumeros();
    
    number.mostrarValores(par);
    System.out.println(number.devolverMayor(par));
    System.out.println(number.calcularPotencia(par));
    System.out.println(number.calcularRaiz(par));
    
    
    
    
    
    }
}
