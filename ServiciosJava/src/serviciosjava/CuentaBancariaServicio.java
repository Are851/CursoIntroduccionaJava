/*
 Realizar una clase llamada CuentaBancaria en el paquete Entidades con los 
siguientes atributos: numeroCuenta(entero), dniCliente(entero largo), 
saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crearcuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le 
sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le 
restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a 
retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. 
Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 */
///cargamos los datos del constructor con parametros
///Ejercicio1 de Servicios

package serviciosjava;
import Entidades.CuentaBancaria;

import java.util.Scanner;

public class CuentaBancariaServicio {

    Scanner scanner = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {
        ///Se cargan los datos en el constructor con parametros
        ///se inicializa para darle datos
        System.out.println("Ingrese el número de cuenta:");
        int numeroCuenta = scanner.nextInt();
        System.out.println("Ingrese el DNI del cliente:");
        long dniCliente = scanner.nextLong();
        System.out.println("Ingrese el saldo inicial:");
        double saldoActual = scanner.nextDouble();
        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }

    public void ingresar(CuentaBancaria cuenta, double cantidad) {
        double saldoActual = cuenta.getSaldoActual();
        cuenta.setSaldoActual(saldoActual + cantidad);
        System.out.println("Se ha ingresado " + cantidad + " a la cuenta " + cuenta.getNumeroCuenta());
    }

    public void retirar(CuentaBancaria cuenta, double cantidad) {
        double saldoActual = cuenta.getSaldoActual();
        if (cantidad > saldoActual) {
            cantidad = saldoActual;
        }
        cuenta.setSaldoActual(saldoActual - cantidad);
        System.out.println("Se ha retirado " + cantidad + " de la cuenta " + cuenta.getNumeroCuenta());
    }

    public void extraccionRapida(CuentaBancaria cuenta) {
        double saldoActual = cuenta.getSaldoActual();
        double cantidad = saldoActual * 0.2;
        cuenta.setSaldoActual(saldoActual - cantidad);
        System.out.println("Se ha realizado una extracción rápida de " + cantidad + " de la cuenta " + cuenta.getNumeroCuenta());
    }

    public void consultarSaldo(CuentaBancaria cuenta) {
        System.out.println("El saldo actual de la cuenta " + cuenta.getNumeroCuenta() + " es " + cuenta.getSaldoActual());
    }

    public void consultarDatos(CuentaBancaria cuenta) {
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("DNI del cliente: " + cuenta.getDniCliente());
        System.out.println("Saldo actual: " + cuenta.getSaldoActual());
    }
}

    
    

    
  
     


    
   
