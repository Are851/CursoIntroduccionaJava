
package EjercicioExtra3B;

import java.util.Scanner;

public class MainJuego {
   public static void main(String[] args) {
        Juego juego = new Juego();

        Scanner scanner = new Scanner(System.in);
        boolean seguirJugando = true;
        while (seguirJugando) {
            juego.iniciarJuego();

            System.out.println("¿Quieres jugar otra vez? (s/n)");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("n")) {
                seguirJugando = false;
            }
        }

        System.out.println("Jugador 1 ha ganado " + juego.getVictoriasJugador1() + " veces.");
                 }
    }