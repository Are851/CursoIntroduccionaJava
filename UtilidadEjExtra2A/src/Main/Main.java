/*

 */
package Main;
import Servicio.AhorcadoService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AhorcadoService juego = new AhorcadoService();

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una palabra:");
        String palabra = sc.next();

        System.out.println("Ingrese la cantidad máxima de jugadas:");
        int cantidadMaximaJugadas = sc.nextInt();

        juego.crearJuego(palabra, cantidadMaximaJugadas);
        juego.juego(palabra);

    }
        
    }

