/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.Ahorcado;
import Servicio.Servicio;
/**
 *
 * @author flavia
 */
public class Main {
    public static void main(String[] args) {
        Ahorcado ah=new Ahorcado();
        Servicio serv=new Servicio();
        serv.crearJuego(ah);
        
    }
}
