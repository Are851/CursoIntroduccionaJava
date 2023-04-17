////Definir una clase llamada/// Puntos que contendrá las coordenadas de dos 
///puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
///Generar un objeto puntos usando un método crearPuntos() que le pide 
///al usuario los dos números y los ingresa en los atributos del objeto. 
///Después, a través de otro método calcular y devolver la distancia que 
///existe entre los dos puntos que existen en la clase Puntos. 
// Sin Getter y Setter
package EjercicioExtra2A;

import java.util.Scanner;


public class MainPuntos {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la coordenada x del primer punto: ");
        double x1 = sc.nextDouble();
        System.out.println("Ingrese la coordenada y del primer punto: ");
        double y1 = sc.nextDouble();
        System.out.println("Ingrese la coordenada x del segundo punto: ");
        double x2 = sc.nextDouble();
        System.out.println("Ingrese la coordenada y del segundo punto: ");
        double y2 = sc.nextDouble();
        sc.close();

        Puntos puntos = new Puntos(x1, y1, x2, y2);
        double distancia = puntos.calcularDistancia();

        System.out.println("La distancia entre los puntos (" + x1 + ", " + y1 + ") y (" + x2 + ", " + y2 + ") es: " + distancia);
    } 
}
