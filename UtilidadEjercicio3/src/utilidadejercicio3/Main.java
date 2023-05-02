/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidadejercicio3;

import Servicios.ArregloService;
import Entidad.ArregloNumeros;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArregloService servicio = new ArregloService();
        
        ArregloNumeros numeros = new ArregloNumeros();
        servicio.inicializar(numeros);
        System.out.println("Arreglo A:");
        servicio.mostrar(numeros);

        servicio.ordenar(numeros);
        System.out.println("Arreglo A ordenado:");
        servicio.mostrar(numeros);

        ArregloNumeros numerosB = new ArregloNumeros();
        servicio.inicializarB(numeros, numerosB);
        System.out.println("Arreglo B:");
        servicio.mostrar(numerosB);
    }
}

    
    
}
