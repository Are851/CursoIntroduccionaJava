package Servicios;
import Entidad.NIF;
import java.util.Scanner;

public class Servicios {
    NIF nif =new NIF();
    Scanner scanner = new Scanner(System.in);




public char crearNif(NIF nif){
    System.out.println("Ingrese el DNI con 8 cifras ");
    nif.setDni(scanner.nextInt());
    int posicióndni = nif.getDni() % 23;
    String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
    return letras.charAt(posicióndni); 
    
public void mostrar(NIF nif)){
    System.out.println(nif.getDni()+crearNif(nif));
    }
}