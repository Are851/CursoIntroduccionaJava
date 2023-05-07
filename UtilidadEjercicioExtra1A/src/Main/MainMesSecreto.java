package Main;

import Entidad.MesSecreto;
import Servicio.ServicioMesSecreto;

public class MainMesSecreto {

    public static void main(String[] args) {

    

    MesSecreto ms = new MesSecreto();
    ServicioMesSecreto adivinar=new ServicioMesSecreto();

    adivinar.adivineMes (ms);
}
    }
