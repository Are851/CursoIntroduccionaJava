/*Programa Nespresso.Desarrollen una clase Cafetera en el paquete Entidadescon
los atributos capacidadMáxima (la cantidad máxima de café que puede contener
la cafetera)y cantidadActual(la cantidad actual de café que hayen la cafetera).
Agregar constructor vacío y con parámetros así como setters y getters.
Crear clase CafeteraServicio en el paquete Servicios con los siguiente: 
a)Método llenar Cafetera():hace que la cantidad actual sea igual a la
capacidadmáxima.
b)Método servirTaza(int):se pide el tamaño de una taza vacía,el método recibe
el tamaño de la taza y simulala acción de servir la taza con la capacidad
indicada.Si la cantidad actual de café “no alcanza” para llenar la taza,
se sirve lo que quede. El método le informará al usuario si se llenó o no la 
taza,y de no haberse llenado en cuanto quedó la taza. 
c)Método vaciar Cafetera():pone la cantidad de café actual en cero. 
d)Método agregar Cafe(int):se le pide al usuario una cantidad de café, el 
método lo recibe y se añade a la cafetera la cantidad de café indicada.
package serviciosejercicio2;*/

package EntidadesEjercicio2;

public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }


    
    
}
