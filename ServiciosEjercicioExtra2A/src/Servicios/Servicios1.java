package Servicios;
import Entidad.NIF;
import java.util.Scanner;

public class Servicios1 {
Scanner scanner = new Scanner(System.in);

    public void crearNif(NIF nif) {
        int dni;
        do {
            System.out.println("Ingrese el DNI con 8 cifras: ");
            dni = scanner.nextInt();
        } while (dni < 10000000 || dni > 99999999);
        nif.setDni(dni);
        int posicióndni = dni % 23;
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letra = letras.charAt(posicióndni);
        nif.setLetra(letra);
    }

    public void mostrar(NIF nif) {
        System.out.println(String.format("%08d", nif.getDni()) + "-" + nif.getLetra());
    }   
}
