/*
En este main le asignamos valores fijos
 */
package Main;

import Entidad.Raices;
import Servicio.Servicio;

/**
 *
 * @author flavia
 */
public class Main1 {
    public static void main(String[] args){
         Raices service1 = new Raices(1, -5, 6);
         Servicio service= new Servicio();
         
        service.calcular();
        service.calcular1();
    } }
