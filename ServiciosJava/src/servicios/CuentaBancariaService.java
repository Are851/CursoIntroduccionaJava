/*
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar 
la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario 
no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.

 */
///Ejercicio1 de Servicios

package Service;

import java.util.Scanner;
import Entidades.CuentaBancaria;

public class CuentaBancariaService {

    Scanner read = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {
        CuentaBancaria cuenta = new CuentaBancaria();

        System.out.println("Numero de cuenta/cliente: ");
        cuenta.setNumeroCuenta(read.nextInt());

        System.out.println("Ingrese el DNi: ");
        cuenta.setDniCliente(read.nextLong());

        System.out.println("Ingrese el saldo actual: ");
        cuenta.setSaldoActual(read.nextDouble());

        return cuenta;
    }

        public void ingresar(CuentaBancaria cuenta) {
        System.out.println("Ingrese el monto a ingresar/importar/meter/poner: ");
        cuenta.setSaldoActual(cuenta.getSaldoActual() + read.nextDouble());
    }

    public void retirar(CuentaBancaria cuenta) {
        System.out.println("Ingrese el monto a retirar/descontar/desconocer: ");
        double saldoFinal = read.nextDouble();

        if (saldoFinal > cuenta.getSaldoActual()) {
            System.out.println("Solo puedes retirar: " + cuenta.getSaldoActual());
        } else {
            System.out.println("El saldo de tu cuenta es: " + (cuenta.getSaldoActual() - saldoFinal));
            cuenta.setSaldoActual(cuenta.getSaldoActual() - saldoFinal);
        }

    }

       public void extraccionRapida(CuentaBancaria cuenta) {
        System.out.println("****************************************************");
        System.out.println("* Solo puedes sacar hasta 20% del saldo en cuenta  *");
        System.out.println("****************************************************");

        System.out.println("Ingrese el monto a retirar: ");
        double saldo20 = read.nextDouble();

        if (saldo20 > (cuenta.getSaldoActual() / 5)) {
            System.out.println("No puedes retirar esa cantidad en extraccion rapida");
        } else {
            System.out.println("El saldo de tu cuenta queda en: " + (cuenta.getSaldoActual() - saldo20));
            cuenta.setSaldoActual(cuenta.getSaldoActual() - saldo20);
        }
    }
       

    public void consultarSaldo(CuentaBancaria cuenta) {
        System.out.println("****************************************************");
        System.out.println("* Tu sualdo actual esssssssssssssssssssssssssssss  *");
        System.out.println("****************************************************");

        System.out.println(cuenta.getSaldoActual());
    }

    public void consultarDatos(CuentaBancaria cuenta) {
        System.out.println("************************************************************");
        System.out.println("* Los datos de la cuenta bancaria esta son.. espera......  *");
        System.out.println("************************************************************");
        System.out.println(cuenta.toString());
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("DNI del cliente: " + cuenta.getDniCliente());
        System.out.println("Saldo actual: " + cuenta.getSaldoActual());
    }
    }

  
    
