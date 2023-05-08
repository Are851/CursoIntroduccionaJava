package Servicios;

import java.util.Date;
import java.util.Scanner;

public class FechaService {

    Scanner read = new Scanner(System.in);

    public Date fechaNacimiento() {
        int dia, mes, anio;
        System.out.println("Ingrese a su fecha de nacimiento dd/mm/aaaa");
        dia = read.nextInt();
        mes = read.nextInt();
        anio = read.nextInt();
        Date fecha = new Date(anio-1900, mes - 1, dia);
        // restamos 1900 al año porque Date comienza en 1900
        //restamos el mes -1 porque enero es 0
        

        return fecha;
    }

    public Date fechaActual() {
        Date fechaActual = new Date();
        return fechaActual;
    }

    public long diferencia(Date fechaActual, Date fechaNac) {
        long difTiempo = fechaActual().getYear() - fechaNac.getYear();
        if (fechaNac.getMonth() >= fechaActual.getMonth()  || 
                (fechaNac.getMonth() != fechaActual.getMonth()) 
                &&(fechaNac.getDay() >= fechaActual.getDay())) {
        {
            difTiempo--;
        }
    }
    return difTiempo ;
}
}
