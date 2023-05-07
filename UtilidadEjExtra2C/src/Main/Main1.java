/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.Ahorcado;
import Servicio.AhorcadoService;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        AhorcadoService servicio = new AhorcadoService();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la palabra a adivinar:");
        String palabra = sc.nextLine();
        System.out.println("Ingrese la cantidad máxima de jugadas:");
        int cantidadMaximaJugadas = sc.nextInt();

        servicio.crearJuego(palabra, cantidadMaximaJugadas);

        servicio.juego();
    
}}
