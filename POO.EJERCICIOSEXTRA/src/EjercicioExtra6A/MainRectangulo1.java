package EjercicioExtra6A;

public class MainRectangulo1 {
 public static void main(String[] args) {
     
        Rectangulo1 Rectangulo = new Rectangulo1(4,5);
        
        
        Rectangulo.calcular_area();
        
        System.out.println("El área del rectángulo es: " + Rectangulo.calcular_area());
    }
}