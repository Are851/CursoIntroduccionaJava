package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {

    private Ahorcado juego;

    public void crearJuego(String palabra, int cantidadMaximaJugadas) {
        juego = new Ahorcado();
        juego.crearJuego(palabra, cantidadMaximaJugadas);
    }

    public int longitud() {
        return juego.longitud();
    }

    public boolean buscar(char letra) {
        return juego.buscar(letra);
    }

    public boolean encontradas(char letra) {
        return juego.encontradas(letra);
    }

    public int intentos() {
        return juego.intentos();
    }

    public void juego(String palabra) {
        Scanner sc = new Scanner(System.in);

        while (intentos() > 0 && (juego.longitud() != juego.getLetrasEncontradas())) {
            System.out.println("Ingrese una letra:");
            char letra = sc.next().charAt(0);

            if (buscar(letra)) {
                encontradas(letra);
                System.out.println("La letra está en la palabra");
            } else {
                System.out.println("La letra no está en la palabra");
            }
            System.out.println("Letras encontradas: " + juego.getLetrasEncontradas() + " / " + juego.longitud());
            System.out.println("Intentos restantes: " + intentos());

        }
    }
}
