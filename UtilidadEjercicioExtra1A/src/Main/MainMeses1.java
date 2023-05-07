/*
Este main se usa el bucle hasta que se adivine el mes
 */
package Main;


import Entidad.Meses;
import Servicio.ServicioMeses1;

public class MainMeses1 {
    public static void main(String[] args) {
        Meses ms=new Meses();
        ServicioMeses1 sm=new ServicioMeses1();
        sm.adivinarMesSecreto(ms);
    }
    
}