/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

/**
 *
 * @author flavia
 */

import java.util.Arrays;



public class ArreglosService {

    public double[] inicializarA(double a[]) {
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.random() * 10;
        }
        return a;
    }

    public void mostrar(double a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("[" + a[i] + "]\t");
        }
        System.out.println("\n");
    }

    public void ordenar(double a[]) {
        Arrays.sort(a);
        Arrays.sort(a, a.length, 0);
    }

    public double[] inicializarB(double a[], double b[]) {
                for (int i = 0; i < 10; i++) {
            b[i] = a[i];
        }
        Arrays.fill(b, 10, 20,0.5);
    ///arraycopy es equivalente al for 
//        System.arraycopy(a, 0, b, 0, 10);
///System.arraycopy es un método estático en Java que se utiliza para copiar
///elementos de un arreglo a otro arreglo. El método toma como argumentos el 
///arreglo de origen, la posición inicial del arreglo de origen, el arreglo 
///de destino, la posición inicial del arreglo de destino y la cantidad de
///elementos a copiar.
//        Arrays.fill(b, 10, 20, 0.5);

        return b;
    }
}
