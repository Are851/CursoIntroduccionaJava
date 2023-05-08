
package EjercicioExtra3B;

import java.util.Scanner;
import java.util.Random;

public class Juego {
    private int numeroAdivinar;
    private int intentosJugador1;
    private int intentosJugador2;
    private int victoriasJugador1;
    private int victoriasJugador2;

    public Juego() {
        this.numeroAdivinar = 0;
        this.intentosJugador1 = 0;
        this.intentosJugador2 = 0;
        this.victoriasJugador1 = 0;
        this.victoriasJugador2 = 0;
    }

    public void iniciarJuego() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenidos al juego de adivinanza de números!");
        System.out.println("Jugador 1, elige un número para que el jugador 2 adivine:");
        Random rand = new Random();
        numeroAdivinar =rand.nextInt((10) + 1);

        int intentos = 0;
        while (intentos < 5) {
            System.out.println("Jugador 2, intenta adivinar el número:");
            int intento = scanner.nextInt();
            intentos++;

            if (intento == numeroAdivinar) {
                System.out.println("¡Felicidades, has adivinado el número en " + intentos + " intentos!");
                intentosJugador2 += intentos;
                victoriasJugador2++;
                return;
            } else if (intento < numeroAdivinar) {
                System.out.println("El número es más alto.");
            } else {
                System.out.println("El número es más bajo.");
            }
        }

        System.out.println("¡Lo siento, has agotado tus intentos!");
        intentosJugador2 += intentos;
        victoriasJugador1++;
    }

    private int generarNumeroAleatorio() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    public int getIntentosJugador1() {
        return intentosJugador1;
    }

    public void setIntentosJugador1(int intentosJugador1) {
        this.intentosJugador1 = intentosJugador1;
    }

    public int getIntentosJugador2() {
        return intentosJugador2;
    }

    public void setIntentosJugador2(int intentosJugador2) {
        this.intentosJugador2 = intentosJugador2;
    }

    public int getVictoriasJugador1() {
        return victoriasJugador1;
    }

    public void setVictoriasJugador1(int victoriasJugador1) {
        this.victoriasJugador1 = victoriasJugador1;
    }

    public int getVictoriasJugador2() {
        return victoriasJugador2;
    }

    public void setVictoriasJugador2(int victoriasJugador2) {
        this.victoriasJugador2 = victoriasJugador2;
    }
      }

