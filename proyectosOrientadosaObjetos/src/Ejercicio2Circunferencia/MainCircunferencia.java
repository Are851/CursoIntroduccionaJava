
package Ejercicio2Circunferencia;

 import java.util.Scanner;
public class MainCircunferencia {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Crear un objeto de la clase Circunferencia
        Circunferencia circ = new Circunferencia(0.0);
        
        // Pedir al usuario que ingrese el valor del radio
        circ.crearCircunferencia();
        
        // Calcular y mostrar el área y el perímetro de la circunferencia
        System.out.println("Área de la circunferencia: " + circ.area());
        System.out.println("Perímetro de la circunferencia: " + circ.perimetro());
        
        // Modificar el valor del radio y volver a mostrar el área y el perímetro de la circunferencia
        System.out.print("Ingrese un nuevo valor para el radio: ");
        double nuevoRadio = sc.nextDouble();
        circ.setRadio(nuevoRadio);
        System.out.println("Área de la circunferencia: " + circ.area());
        System.out.println("Perímetro de la circunferencia: " + circ.perimetro());
        
        sc.close();
    }
}

