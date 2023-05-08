
package EjercicioExtra4C;

import java.util.Scanner;

        
public class Main {
        public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Titular: ");
        String titular = sc.nextLine();
        System.out.println("Ingrese Saldo: ");
        double cantidad = sc.nextDouble();
        
        Cuenta Cuentas= new Cuenta();
        Cuentas.retirarDinero ();           
        
        Cuentas.retirarDinero();


    
}  

   
}  


