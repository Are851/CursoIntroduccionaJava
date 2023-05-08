package Main;

import Entidad.Raices;
import Servicio.Servicio;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Servicio service = new Servicio();

        System.out.println("Ingrese la cantidad de ecuaciones" );
        int n=scanner.nextInt();///cantidad de ecuaciones que se van a ingresar
        Raices ecuaciones []= new Raices[n];
        
        // Solicitar los valores de las n ecuaciones y crear los objetos Raices correspondientes
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese los coeficientes de la ecuación " + (i + 1));
            System.out.print("a = ");
            double a = scanner.nextDouble();

            System.out.print("b = ");
            double b = scanner.nextDouble();

            System.out.print("c = ");
            double c = scanner.nextDouble();
            
            ecuaciones [i]= new Raices(a, b, c);
        }

        // Calcular y mostrar las soluciones para cada ecuación
        for (int i = 0; i < n; i++) {
            System.out.println("Soluciones para la ecuación " + (i+1) + " es "); 
            service.calcular(ecuaciones[i]);
            System.out.println("La cantidad de ecuaciones con raices y sin raiz" + (i+1) + " es "); 
            service.calcular1(ecuaciones[i]);


            
        }
    }
}



