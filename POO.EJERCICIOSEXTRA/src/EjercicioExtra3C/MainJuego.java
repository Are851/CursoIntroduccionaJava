package Main;

import EjercicioExtra3D.Juego;
import java.util.Scanner;

public class MainJuego {

    public static void main(String[] args) {
        Juego nuevo = new Juego();
        Scanner leer = new Scanner(System.in);
        
        String conf ;
        
        do{
            nuevo.inicioJuegoJ1();
            nuevo.inicioJuegoJ2();

            
            System.out.println("Seguir jugando? S/N");
            conf = leer.next();
                    
        }while(!conf.equalsIgnoreCase("N"));
        
        
        System.out.println("Partida ganadas Axel  : " + nuevo.getNom1());
        System.out.println("Partidas ganadas Brian: " + nuevo.getNom2());
    }
    
}
