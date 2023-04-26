package ServiciosEjercicio2;
/*
Crear clase CafeteraServicio en
el paquete Servicios con los siguiente:
a) Método llenarCafetera(): hace que la cantidad actual sea igual a la
capacidad máxima.
b) Método servirTaza(int): se pide el tamaño de una taza vacía, el
método recibe el tamaño de la taza y simula la acción de servir la
taza con la capacidad indicada. Si la cantidad actual de café “no
alcanza” para llenar la taza, se sirve lo que quede. El método le
informará al usuario si se llenó o no la taza, y de no haberse llenado
en cuanto quedó la taza.
c) Método vaciarCafetera(): pone la cantidad de café actual en cero.
d) Método agregarCafe(int): se le pide al usuario una cantidad de café,
el método lo recibe y se añade a la cafetera la cantidad de café
indicada.
 */
import Entidad.Cafetera2;

public class CafeteraServicio3 {
    public void llenarCafetera(Cafetera2 caf) {

        caf.setCapadidadActual((int) caf.getCapacidadMaxima());
        System.out.println("Cafetera llena");
    }

    public void servirTaza(Cafetera2 caf, int taza) {

        if (caf.getCapadidadActual() >= taza) {
            System.out.println("Se lleno la taza");
            caf.setCapadidadActual((int) (caf.getCapadidadActual() - taza));

        } else {
            System.out.println("La capacidad actual de cafe no alcanza para llenar la taza");
            System.out.println("La taza quedo con " + (taza - caf.getCapadidadActual()) + "ml");
            caf.setCapadidadActual(0);
        }
    }

    public void vaciarCafetera(Cafetera2 caf) {

        caf.setCapadidadActual(0);
        System.out.println("Cafetera vacia");
    }

    public boolean agregarCafe(Cafetera2 caf, int cafe) {

        if ((caf.getCapadidadActual() + cafe) <= caf.getCapacidadMaxima()) {
            caf.setCapadidadActual((int) (caf.getCapadidadActual() + cafe));
            return true;

        } else {
            System.out.println("Supera la capidad maxima");
            return false;
        }

    }

    public void mostrarDatos(Cafetera2 caf) {

        System.out.println("--------------------------------");
        System.out.println("Capacidad actual: " + caf.getCapadidadActual() + "ml");
        System.out.println("Capacidad maxima: " + caf.getCapacidadMaxima() + "ml");
        System.out.println("--------------------------------");
    }

}   

