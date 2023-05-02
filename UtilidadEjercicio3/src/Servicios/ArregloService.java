
package Servicios;

import java.util.Random;
import Entidad.ArregloNumeros;
import java.util.Arrays;


/**
 */
class  ArregloService {
    Random random = new Random();
///Llamamos a l Instancia dentro del metodo.
    public void inicializar(ArregloNumeros arreglo) {
        double[] numeros = new double[50];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextDouble();
        }
        arreglo.setNumeros(numeros);
    }

    public void mostrar(ArregloNumeros arreglo) {
        System.out.println(Arrays.toString(arreglo.getNumeros()));
    }

    public void ordenar(ArregloNumeros arreglo) {
        double[] numeros = arreglo.getNumeros();
        Arrays.sort(numeros);
    }

    public void inicializarB(ArregloNumeros arregloA, ArregloNumeros arregloB) {
        double[] numerosA = arregloA.getNumeros();
        double[] numerosB = new double[20];
        for (int i = 0; i < 10; i++) {
            numerosB[i] = numerosA[i];
        }
        for (int i = 10; i < numerosB.length; i++) {
            numerosB[i] = 0.5;
        }
        arregloB.setNumeros(numerosB);
    }    
}
