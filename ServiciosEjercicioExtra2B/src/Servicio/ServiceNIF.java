/*
 En NIFService se dispondrá de los siguientes métodos:
Métodos getters y setters para el número de DNI y la letra.
Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le corresponderá. Una vez calculado,
le asigna la letra que le corresponde según
Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en mayúscula; por ejemplo: 00395469-F).

La letra correspondiente al dígito verificador se calculará a traves de un método que funciona de la siguiente manera:
Para calcular la letra se toma el resto de dividir el número 
de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe buscar en un array (vector) de caracteres 
la posición que corresponda al resto de la división para obtener la letra correspondiente. La tabla de caracteres es la siguiente:
 */
package Service;

import Entidad.NIF;
import java.util.Scanner;

public class ServiceNIF {

    Scanner read = new Scanner(System.in);

    public NIF crearNif() {
        NIF newNIF = new NIF();

        String frase;
        long x;

        do {
            System.out.println("Ingresa el DNI: ");
            x = read.nextLong();
         
        } while (x>10000000 || x <= 0);

        newNIF.setDNI(x);
        newNIF.setLetra(calcularNif(newNIF));

        return newNIF;
    }

    public String calcularNif(NIF newNIF) {
        String vecLetra[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        int pos = (int) (newNIF.getDNI() % 23);
        return vecLetra[pos];
    }

    public void mostrar(NIF newNIF) {
        String aux = String.valueOf((int) (newNIF.getDNI()));
        String aux2 = "0";

        if (aux.length() == 8) {
            System.out.println(aux + "-" + newNIF.getLetra());
        } else {
            do {
                aux2 = aux2 + "0";
            } while (aux2.length() != (8 - aux.length()));

            System.out.println((aux2 + aux) + "-" + newNIF.getLetra());

        }

    }
}
