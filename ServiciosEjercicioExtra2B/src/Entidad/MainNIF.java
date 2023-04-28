package Main;
import Entidad.NIF;
import Service.ServiceNIF;

public class MainNIF {

    public static void main(String[] args) {
        ServiceNIF nifService = new ServiceNIF();
       
        NIF nif = nifService.crearNif();
        
        nifService.mostrar(nif);
        
    }
    
}
