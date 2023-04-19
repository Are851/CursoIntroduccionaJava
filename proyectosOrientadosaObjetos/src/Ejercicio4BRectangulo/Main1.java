    /*Crear una clase RectÃ¡ngulo que modele rectÃ¡ngulos por medio de un atributo privado 
base y un atributo privado altura. La clase incluirÃ¡ un mÃ©todo para crear el rectÃ¡ngulo 
con los datos del RectÃ¡ngulo dados por el usuario. TambiÃ©n incluirÃ¡ un mÃ©todo para calcular 
la superficie del rectÃ¡ngulo y un mÃ©todo para calcular el perÃ­metro del rectÃ¡ngulo. 
Por Ãºltimo, tendremos un mÃ©todo que dibujarÃ¡ el rectÃ¡ngulo mediante asteriscos usando la base y la altura. 
Se deberÃ¡n ademÃ¡s definir los mÃ©todos getters, setters y constructores correspondientes.
Superficie = base * altura / PerÃ­metro = (base + altura) * 2.
package Ejercicio4BRectangulo;
   */

package Rectangulo;

public class Main1 {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        r1.datosRectangulo();
        
        System.out.println("La superficie es: " +r1.superficie()+ " El perimetro es: " +r1.perimetro());
        
        System.out.println("El dibujo de la superfie del Rectangulo creado es: ");
        r1.dibujoRectangulo();
        
        System.out.println("El dibujo del Perimetro del Rectangulo creado es: ");
        r1.dibujarPerimetro();
    }
    
}

}
