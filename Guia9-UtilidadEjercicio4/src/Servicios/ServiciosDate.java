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
package Servicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class ServiciosDate {



    private static final SimpleDateFormat FORMATO_FECHA = new SimpleDateFormat("dd/MM/yyyy");

    public Date fechaNacimiento() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu fecha de nacimiento (dd/mm/yyyy): ");
        String fechaNacimientoStr = scanner.nextLine();
        try {
    ///try es una palabra clave en Java que se utiliza para definir un bloque 
    ///de código que puede generar una excepción. Cuando se produce una 
    ///excepción dentro del bloque try, se captura en uno o más bloques 
    ///catch que se definen inmediatamente después del bloque try.
            return FORMATO_FECHA.parse(fechaNacimientoStr);
        } catch (ParseException e) {
            System.out.println("Formato de fecha incorrecto. Inténtalo de nuevo.");
            return fechaNacimiento();
        }
    }

    public Date fechaActual() {
        return new Date();
    }
///opcion 1 mandamos los parametros desde el main
//    public int diferencia(Date fecha1, Date fecha2) {
//        long difTiempo = fecha1.getTime() - fecha2.getTime();
//        double difAnios = (double) difTiempo / (1000 * 60 * 60 * 24 * 365.25);
//        return (int) Math.floor(Math.abs(difAnios));
    
    //Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia
//de años entre una y otra (edad del usuario).     
    ///Opcion2 llamamos a las fechas por metodos dentrod de diferencia
    
       public long diferencia(){
          long dif = fechaActual().getTime() - fechaNacimiento().getTime();
          
          double aniosDif = (double) dif /(1000*60*60*24*365.25);
          return (int) Math.floor(Math.abs(aniosDif));
                  
       }
}    
