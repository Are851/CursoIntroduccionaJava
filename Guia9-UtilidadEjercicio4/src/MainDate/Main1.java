
package MainDate;

import Servicios.FechaService;
import java.util.Date;

public class Main1 {
 public static void main(String[] args) {
        FechaService f1 = new FechaService();
        Date fechaNac = f1.fechaNacimiento();
        System.out.println(f1.fechaActual());
        System.out.println(f1.diferencia(f1.fechaActual(), fechaNac));
    }   
}
