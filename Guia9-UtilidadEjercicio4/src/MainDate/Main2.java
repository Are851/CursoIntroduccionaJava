/*
VamosausarlaclaseDatequeyaexisteenJava.Crearemoslaclase FechaService,
enpaqueteServicios,quetengalossiguientesmétodos: 
a)MétodofechaNacimientoquepreguntealusuariodía,mesyañode sunacimiento.Luego
lospaseporparámetroaunnuevoobjetoDate. 
ElmétododeberetornarelobjetoDate.Ejemplofecha:Datefecha= newDate(anio,mes,dia);
b)MétodofechaActualquecreeunobjetofechaconeldíaactual.Para estousaremosel
constructorvacíodelaclaseDate.Ejemplo: Date fechaActual =newDate(); 
ElmétododeberetornarelobjetoDate.
c)Métododiferenciaquerecibalasdosfechasporparámetroyretorna ladiferencia
deañosentreunayotra(edaddelusuario).
 */
package MainDate;

import Servicios.ServiciosDate;
import java.util.Date;

public class Main2
{


    public static void main(String[] args) {
        ServiciosDate fechaService = new ServiciosDate();
        
        // Obtener fecha de nacimiento del usuario
        Date fechaNacimiento = fechaService.fechaNacimiento();
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        
        // Obtener fecha actual
        Date fechaActual = fechaService.fechaActual();
        System.out.println("Fecha actual: " + fechaActual);
        
        // Calcular diferencia de años entre las dos fechas
        System.out.println("Edad: " + fechaService.diferencia(fechaActual, fechaNacimiento));
        ///opcion 2 llamamos al metodo sin enviar parametros
    }
}
  
    

