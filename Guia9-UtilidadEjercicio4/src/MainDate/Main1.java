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

import Servicios.FechaService;

public class Main1 {
 public static void main(String[] args) {
        FechaService f1 = new FechaService();
///opcion 1 llamamos al metodo mandando parametros
        System.out.println(f1.fechaActual());
        System.out.println(f1.diferencia(f1.fechaActual(), f1.fechaNacimiento()));
        

        
        
    }   
}
