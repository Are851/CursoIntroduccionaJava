/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.Meses;
import Servicio.ServicioMeses;

public class MainMeses {
    public static void main(String[] args) {
        Meses ms=new Meses();
        ServicioMeses sm=new ServicioMeses();
        sm.adivinarMesSecreto(ms);
    }
    
}
