package Servicios;


import java.util.Scanner;
import Entidad.NIF;

public class NIFServicio {
    Scanner sc = new Scanner(System.in);
    NIF nif = new NIF();
    /*
     * Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le 
     * corresponderá. Una vez calculado, le asigna la letra que le corresponde según
     */
    public void crearNif(NIF nif) {
        System.out.print("Ingrese el DNI del usuario :");
        long tmpDNI = sc.nextLong();
        nif.setDNI(tmpDNI);
        // calculo la letra como DNI / 23 
        int tmp =  (int) (tmpDNI % 23);
        System.out.println("El valor del resto es: " + tmp);
        char letra = nif.vector[tmp];
        System.out.println("Le corresponde la : " + letra);
        nif.setLetra(letra);
    }
    
    // Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en 
    // mayúscula; por ejemplo: 00395469-F).
    public void mostrarNIF(NIF nif){
        String stmp = Long.toString(nif.getDNI())+"-"+nif.getLetra();
        System.out.println("NIF : " + stmp);
    }
}