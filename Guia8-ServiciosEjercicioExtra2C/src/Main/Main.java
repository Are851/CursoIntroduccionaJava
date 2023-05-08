
package Main;

import Entidad.NIF;
import Servicios.NIFServicio;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
    
    NIFServicio nifs= new NIFServicio();
    NIF nif= new NIF();
    nifs.crearNif(nif);
    nifs.mostrarNIF(nif);
    
}
}