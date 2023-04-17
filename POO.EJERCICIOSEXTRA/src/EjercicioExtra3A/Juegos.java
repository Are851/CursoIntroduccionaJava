///Crea una clase "Juego" que tenga un método "iniciar_juego" que
///permita a dos jugadores jugar un juego de adivinanza de números. 
///El primer jugador elige un número y el segundo jugador intenta adivinarlo.
///El segundo jugador tiene un número limitado de intentos y recibe una pista
///de "más alto" o "más bajo" después de cada intento. El juego termina cuando
///el segundo jugador adivina el número o se queda sin intentos. 
///Registra el número de intentos necesarios para adivinar el número
/// y el número de veces que cada jugador ha ganado.
package EjercicioExtra3A;

import java.util.Scanner;

public class Juegos {
   private int numeroAdivinar;
    private int numeroIntentos;
    private final  int numeroJugador1;
    private int numeroJugador2;
    private int numGanadasJugador1;
    private int numGanadasJugador2;

    public Juegos() {
        this.numeroAdivinar = 0;
        this.numeroIntentos = 5;
        this.numeroJugador1 = 0;
        this.numeroJugador2 = 0;
        this.numGanadasJugador1 = 0;
        this.numGanadasJugador2 = 0;
    }

    public Juegos(int numeroJugador1) {
        this.numeroJugador1 = numeroJugador1;
    }

    public int getNumGanadasJugador1() {
        return numGanadasJugador1;
    }

    public int getNumeroAdivinar() {
        return numeroAdivinar;
    }

    public void setNumGanadasJugador1(int numGanadasJugador1) {
        this.numGanadasJugador1 = numGanadasJugador1;
    }

    public void setNumGanadasJugador2(int numGanadasJugador2) {
        this.numGanadasJugador2 = numGanadasJugador2;
    }

    public void setNumeroAdivinar(int numeroAdivinar) {
        this.numeroAdivinar = numeroAdivinar;
    }

    public void setNumeroIntentos(int numeroIntentos) {
        this.numeroIntentos = numeroIntentos;
    }

    public void setNumeroJugador2(int numeroJugador2) {
        this.numeroJugador2 = numeroJugador2;
    }

    
    
    public void iniciarJuego() {
        Scanner sc = new Scanner(System.in);
       int opcion = 0;
        do {
            System.out.println("-------ADIVINANZA DE NUMEROS-------");
            System.out.println("1. Nuevo Juego");
            System.out.println("2. Ver estadisticas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Jugador 1, por favor ingrese el numero a adivinar: ");
                    this.numeroAdivinar = sc.nextInt();
                    System.out.println("Jugador 2, tiene " + this.numeroIntentos + " intentos para adivinar el numero.");
                    for (int i = 1; i <= this.numeroIntentos; i++) {
                        System.out.print("Intento #" + i + ": ");
                        this.numeroJugador2 = sc.nextInt();
                        if (this.numeroJugador2 == this.numeroAdivinar) {
                            System.out.println("¡Felicidades! Adivinaste el numero en " + i + " intentos.");
                            this.numGanadasJugador2++;
                            break;
                        } else if (this.numeroJugador2 < this.numeroAdivinar) {
                            System.out.println("El numero es más alto. Intenta de nuevo.");
                        } else {
                            System.out.println("El numero es más bajo. Intenta de nuevo.");
                        }
                        if (i == this.numeroIntentos) {
                            System.out.println("¡Lo siento! Se te acabaron los intentos.");
                            this.numGanadasJugador1++;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Estadisticas de los juegos:");
                    System.out.println("Jugador 1 ganó " + this.numGanadasJugador1 + " veces.");
                    System.out.println("Jugador 2 ganó " + this.numGanadasJugador2 + " veces.");
                    break;
                case 3:
                    System.out.println("Gracias por jugar.");
                    break;
                default:
                    System.out.println("Opción inválida. Seleccione de nuevo.");
                    break;
            }
                  } while (opcion != 3);
        sc.close();
                 }
      }
   
