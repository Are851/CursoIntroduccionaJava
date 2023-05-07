/*Programa Nespresso.Desarrollen una clase Cafetera en el paquete Entidadescon
los atributos capacidadMáxima (la cantidad máxima de café que puede contener
la cafetera)y cantidadActual(la cantidad actual de café que hayen la cafetera).
Agregar constructor vacío y con parámetros así como setters y getters.
Crear clase CafeteraServicio en el paquete Servicios con los siguiente: 
a)Método llenarCafetera():hace que la cantidad actual sea igual a la
capacidadmáxima.
b)Método servirTaza(int):se pide el tamaño de una taza vacía,el método recibe
el tamaño de la taza y simulala acción de servir la taza con la capacidad
indicada.Si la cantidad actual de café “no alcanza” para llenar la taza,
se sirve lo que quede. El método le informará al usuario si se llenó o no la 
taza,y de no haberse llenado en cuanto quedó la taza. 
c)Método vaciarCafetera():pone la cantidad de café actual en cero. 
d)Método agregarCafe(int):se le pide al usuario una cantidad de café, el 
método lorecibe y se añade a la cafetera la cantidad de café indicada.*/
package ServiciosEjercicio2;

import Entidad.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {

    private Cafetera cafe;
    Scanner read = new Scanner(System.in);
    int cantidad = 0;

    public void llenarCafetera() {
        cafe.setCapacidadMaxima(read.nextInt());
        cafe.setCantidadActual(cafe.getCapacidadMaxima());
    }

    public void servirTaza(int tamanoTaza) {
        System.out.println("Ingrese tamaño de taza: ");
        tamanoTaza = (read.nextInt());
        if (tamanoTaza <= cafe.getCapacidadMaxima()) {
            cafe.setCantidadActual(cafe.getCantidadActual() - tamanoTaza);
        } else {
            System.out.println("No se ha llenado la taza. Se carga a la taza " + cafe.getCantidadActual() + " unidades de cafe en la taza.");
            cafe.setCantidadActual(0);
        }
    }

    public void vaciarCafetera() {
        cafe.setCantidadActual(0);
    }

    public void agregarCafe() {
        int cafeagregado = 0;
        cafe.setCantidadActual(cafe.getCantidadActual() + cafeagregado);
    }
}
