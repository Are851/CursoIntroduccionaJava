package Servicios;
import Entidad.NIF;
import java.util.Scanner;

public class Servicios {
    NIF nif =new NIF();
    Scanner scanner = new Scanner(System.in);


public void crearNif(){
    System.out.println("Ingrese el DNI con 8 cifras ");
    int dni = scanner.nextInt();
    int posicióndni = dni % 23;
    String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
    nif.setLetra(letras.charAt(posicióndni));   
}
public void mostrar(){
    System.out.println(nif.getDni()+nif.getLetra());
    }
}