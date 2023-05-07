/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

/**
 *
 * @author flavia
 */
public class Servicio1 {
    private char[] palabra;
    private boolean[] encontradas;
    private int intentosMaximos;
    private int intentosActuales;

    public void crearJuego(String palabraStr, int intentosMaximos) {
        palabra = palabraStr.toCharArray();
        encontradas = new boolean[palabra.length];
        this.intentosMaximos = intentosMaximos;
        intentosActuales = intentosMaximos;
    }

    public int longitud() {
        return palabra.length;
    }

    public boolean buscar(char letra) {
        boolean encontrada = false;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i] == letra) {
                encontradas[i] = true;
                encontrada = true;
            }
        }
        if (!encontrada) {
            intentosActuales--;
        }
        return encontrada;
    }

    public void encontradas(char letra) {
          while (juego.intentos() > 0 && juego.encontradas() < juego.longitud()) {
            System.out.println("Ingrese una letra:");
            char letra = sc.next().charAt(0);

            if (juego.buscar(letra)) {
                juego.encontradas(letra);
            } else {
                System.out.println("La letra no está en la palabra");
            }
        }

        if (juego.intentos() == 0) {
            System.out.println("¡Perdiste! La palabra era " + palabra);
        } else {
            System.out.println("¡Ganaste!");
        }
    
        int encontradasCount = 0;
        for (int i = 0; i < palabra.length; i++) {
            if (encontradas[i]) {
                System.out.print(palabra[i] + " ");
                encontradasCount++;
            } else {
                System.out.print("* ");
            }
        }
        System.out.println();
        System.out.println("Letra encontrada: " + letra);
        System.out.println("Letras encontradas: " + encontradasCount);
        System.out.println("Letras faltantes: " + (palabra.length - encontradasCount));
    }

    public int intentos() {
        return intentosActuales;
    }
    }
   

