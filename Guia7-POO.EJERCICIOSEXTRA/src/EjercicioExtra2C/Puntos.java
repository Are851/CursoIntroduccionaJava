////Definir una clase llamada/// Puntos que contendrá las coordenadas de dos 
///puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
///Generar un objeto puntos usando un método crearPuntos() que le pide 
///al usuario los dos números y los ingresa en los atributos del objeto. 
///Después, a través de otro método calcular y devolver la distancia que 
///existe entre los dos puntos que existen en la clase Puntos. 
///En un solo codigo.
package EjercicioExtra2C;
import java.util.Scanner;

public class Puntos {

    public  double GetY1;
    public  double GetY2;
    private  double x1, y1, x2, y2;

    public  void crearPuntos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la coordenada x del primer punto: ");
        x1 = sc.nextDouble();
        System.out.println("Ingrese la coordenada y del primer punto: ");
        y1 = sc.nextDouble();
        System.out.println("Ingrese la coordenada x del segundo punto: ");
        x2 = sc.nextDouble();
        System.out.println("Ingrese la coordenada y del segundo punto: ");
        y2 = sc.nextDouble();
        sc.close();
    }
        public  double calcularDistancia() {
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return distancia;
    }

    
}
