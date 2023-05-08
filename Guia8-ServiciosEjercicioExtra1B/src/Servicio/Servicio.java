/**Vamos a realizar una clase llamada Raices, donde representaremos los valores
* de una ecuación de 2º grado. Tendremos los 3 coeficientes como atributos, 
* llamémosles a, b y c. Hay que insertar estos 3 valores para construir el 
* objeto a través de un método constructor. Luego, en RaicesServicio las 
* operaciones que se podrán realizar son las siguientes:
Método getDiscriminante(): devuelve el valor del discriminante (double). 
* El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones,
* para que esto ocurra, el discriminante debe ser mayor o igual que 0.
Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución,
* para que esto ocurra, el discriminante debe ser igual que 0.
Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 
* posibles soluciones.
Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única 
* raíz. Es en el caso en que se tenga una única solución posible.
Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), 
* y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación 
* con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan 
* nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el 
* signo delante de -b  **/
package Servicio;

import Entidad.Raices;
public class Servicio {
    double discriminante;

    public Servicio(double discriminante) {
        this.discriminante = discriminante;
    }

    public Servicio() {
        
    }


    public double getDiscriminante() {
        return discriminante;
    }

    public void setDiscriminante(double discriminante) {
        this.discriminante = discriminante;
    }
    
   Raices raiz=new Raices ();
   ///opción 1 hacer el cuadrado de B
   public double  getDiscriminante(Raices raiz) {
        return  (Math.pow(raiz.getB(), 2)-4*raiz.getA()*raiz.getC());
        /// se puede declarar la variante en discriminante en raices juntocon su constructor
        ///(b^2)-4*a*c la formula del discriminante
   } 
   ///opcion 2 para hacer cuadrado de B
//    public double getDiscriminante() {
//        return (b * b) - (4 * a * c);
//    }
    
    public boolean tieneRaices(Raices raiz) {
        double discriminante = getDiscriminante(raiz);
        return discriminante >= 0;
    }

    public boolean tieneRaiz(Raices raiz) {
        double discriminante = getDiscriminante(raiz);
        return discriminante == 0;
    }

    public void obtenerRaices(Raices raiz) {
        if (tieneRaices(raiz)) {      ///sqrt raiz de un numero
            double x1 = (-raiz.getB() + Math.sqrt(getDiscriminante())) / (2 * raiz.getA());
            double x2 = (-raiz.getB() - Math.sqrt(getDiscriminante())) / (2 * raiz.getA());
//Fórmula ecuación 2o grado: (-b± discriminante/(2*a) habiamos hecho que el discriminante es (b^2)-4*a*c
/// (-b±/(2*a) se elimina √((b^2)-(4*a*c)) porque el discriminante es >= 0
//* signo delante de -b  **/
            System.out.println("Las posibles soluciones son x1 = " + x1 + " y x2 = " + x2);
        } else {
            System.out.println("No hay solución real.");
        }
    }

    public void obtenerRaiz(Raices raiz) {
        if (tieneRaiz(raiz)) {
            double x = -raiz.getB() / (2 * raiz.getA());
//Fórmula ecuación 2o grado: (-b/(2*a) 
/// (-b±/(2*a) se elimina √((b^2)-(4*a*c)) porque el discriminante es =0
//* signo delante de -b  **/
            System.out.println("La única solución es x = " + x);
        } else {
            System.out.println("No hay una única solución.");
        }
    }

    public void calcular(Raices raiz) {
        if (tieneRaices(raiz)) {
            obtenerRaices(raiz);
        } else if (tieneRaiz(raiz)) {
            obtenerRaiz(raiz);
        } else {
            System.out.println("No hay solución real.");
        }}
    int contarraices=0;
    int contarraiz=0;
    int sinraiz=0;
    
    public void calcular1(Raices raiz) {
        if (tieneRaices(raiz)) {
             contarraices++;
        } else if (tieneRaiz(raiz)) {
             contarraiz++;
        } else {
            sinraiz++;
        }
     System.out.println("Tienen 2 raices: " + contarraices);
     System.out.println("Tiene 1 raiz: " + contarraiz);
     System.out.println("No tiene raiz: " + sinraiz++);

    }
}

