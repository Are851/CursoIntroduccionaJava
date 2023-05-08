
package Main;

import Servicios.ArreglosService;

public class Main2 {
    public static void main(String[] args) {
        ArreglosService sv = new ArreglosService();
        
        double[] a1 = new double[50];
        double[] a2 = new double[20];
        
        sv.inicializarA(a1);
        sv.mostrar(a1);
        sv.ordenar(a1);
        System.out.println("Arreglo 1 ordenado");
        sv.mostrar(a1);
        sv.inicializarB(a1, a2);
        System.out.println("Arreglo 1");
        sv.mostrar(a1);
        System.out.println("Arreglo 2");
        sv.mostrar(a2);
        
        //Arrays.equals(a1, a2);
        
    }
   
}
