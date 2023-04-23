/*Este ejemplo crea una cafetera con capacidad máxima de 500 unidades de café
y cantidad actual de 250 unidades de café. Luego, utiliza la instancia de 
CafeteraServicio para realizar algunas operaciones, como llenar la cafetera, 
servir una taza de 100 unidades de café, agregar 200 unidades de café y vaciar
la cafetera. Los resultados de cada operación se imprimirán en la consola.
Le cargamos los datos en el main por codigo y no ejecutandolo*/
package Main;

import Entidades.Cafetera;
import Servicios.CafeteraServicio1;

public class Main {
    public static void main(String[] args) {
        // Crear una cafetera con capacidad máxima de 500 unidades de café y cantidad actual de 250 unidades de café.
        Cafetera miCafetera = new Cafetera(500, 250);

        // Crear una instancia de CafeteraServicio con la cafetera creada anteriormente.
        CafeteraServicio1 miServicio = new CafeteraServicio1(miCafetera);

        // Llenar la cafetera.
        miServicio.llenarCafetera();

        // Servir una taza de 100 unidades de café.
        miServicio.servirTaza(100);

        // Agregar 200 unidades de café a la cafetera.
        miServicio.agregarCafe(200);

        // Vaciar la cafetera.
        miServicio.vaciarCafetera();
    }
}

