/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Random;


public class Meses {
    private String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo",
    "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre",
    "Diciembre"};

Random rand = new Random();
private String mesSecreto = meses[rand.nextInt(12)];

    public Meses() {
    }

    public String[] getMeses() {
        return meses;
    }

    public Random getRand() {
        return rand;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

   
  
    
   


   

}
