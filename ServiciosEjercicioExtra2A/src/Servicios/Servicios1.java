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
        System.out.println(String.format("%08d", nif.getDni()) + "-" 
                + nif.getLetra());
//El método nif.getDni() devuelve un valor entero (int), que luego es formateado
//como una cadena de caracteres con String.format().
//
//Específicamente, se está utilizando la cadena de formato "%08d", que indica
//que se debe formatear un valor entero (d de decimal) con 8 dígitos, rellenando
//con ceros (0) a la izquierda si el número no tiene 8 dígitos.
//
//Entonces, el valor devuelto por nif.getDni() se está formateando como una 
//cadena de 8 caracteres con ceros a la izquierda si es necesario, para que 
//siempre tenga una longitud de 8 caracteres. Luego, se concatena un guion ("-") 
//y la letra correspondiente del NIF (nif.getLetra()), para obtener la cadena 
//        final que representa el NIF en el formato deseado.
    }   
}
