//Crear una clase Rectángulo que modele rectángulos por medio 
///de un atributo privado base y un atributo privado altura. 
///La clase incluirá un método para crear el rectángulo con los datos
///del Rectángulo dados por el usuario. También incluirá un método
///para calcular la superficie del rectángulo y un método para calcular 
///el perímetro del rectángulo. Por último, tendremos un método que 
///dibujará el rectángulo mediante asteriscos usando la base y la altura. 
///Se deberán además definir los métodos getters, setters y 
///constructores correspondientes.
//Superficie = base * altura / Perímetro = (base + altura) * 2.
package Ejercicio4RectanguloConGetySet;
 import java.util.Scanner;

public class Rectangulo {

 private double base;
 private double altura;
    
    // Constructor con todos los atributos pasados por parámetro
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    // Constructor sin los atributos pasados por parámetro
    public Rectangulo() {
        this.base = 0.0;
        this.altura = 0.0;
    }
    
    // Métodos getters y setters
    public double getBase() {
        return base;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    // Método para crear el rectángulo con los datos dados por el usuario
    public void crearRectangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base del rectángulo: ");
        this.base = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        this.altura = scanner.nextDouble();
    }
    
    // Método para calcular la superficie del rectángulo
    public double calcularSuperficie() {
        return base * altura;
    }
    
    // Método para calcular el perímetro del rectángulo
    public double calcularPerímetro() {
        return (base + altura) * 2;
    }
    
    // Método para dibujar el rectángulo con asteriscos
    public void dibujarRectangulo() {
        for(int i=0;i<altura;i++) {
            for(int j=0;j<base;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}   

