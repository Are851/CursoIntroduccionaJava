
package Ejercicio4ERectangulo;

import java.util.Scanner;


public class Main {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la base del rectángulo: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = sc.nextDouble();

        Rectangulo rectangulo = new Rectangulo(base, altura);
        rectangulo.dibujarRectangulo();
        
    }
}

