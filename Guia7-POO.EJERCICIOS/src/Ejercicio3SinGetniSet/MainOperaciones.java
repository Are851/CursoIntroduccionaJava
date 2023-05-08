package Ejercicio3SinGetniSet;
public class MainOperaciones {
   public void main(String[] args) {
    Operacion operacion = new Operacion();
    operacion.crearOperacion();
    System.out.println("La suma es: " + operacion.sumar());
    System.out.println("La resta es: " + operacion.restar());
    System.out.println("La multiplicación es: " + operacion.multiplicar());
    System.out.println("La división es: " + operacion.dividir());
} 
}
