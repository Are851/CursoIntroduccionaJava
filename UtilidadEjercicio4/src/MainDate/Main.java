
package MainDate;

import servicios.ServiciosDate;
import java.util.Date;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosDate fechaService = new ServiciosDate();
        
        // Obtener fecha de nacimiento del usuario
        Date fechaNacimiento = fechaService.fechaNacimiento();
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        
        // Obtener fecha actual
        Date fechaActual = fechaService.fechaActual();
        System.out.println("Fecha actual: " + fechaActual);
        
        // Calcular diferencia de años entre las dos fechas
        int edad = fechaService.diferencia(fechaActual, fechaNacimiento);
        System.out.println("Edad: " + edad);
    }
}
  
    

