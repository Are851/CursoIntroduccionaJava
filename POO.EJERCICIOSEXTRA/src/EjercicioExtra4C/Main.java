
package EjercicioExtra4C;

import EjercicioExtra2B.Puntos;
import java.util.Scanner;

        
public class Main {
        public static void main(String[] args) {
        
        
        
        Scanner leer = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Titular: ");
        String titular = sc.nextLine();
        System.out.println("Ingrese Saldo: ");
        double cantidad = sc.nextDouble();
        
        Cuenta Cuentas= Cuenta();
        Cuentas.retirarDinero ();           
        
        Cuenta.retirarDinero();


    
}  
}  


