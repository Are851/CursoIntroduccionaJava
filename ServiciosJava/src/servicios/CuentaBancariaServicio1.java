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
///Sericio de Cuenta Bancaria. 
///Usamos el constructor vacio de Entidad
///Se crea objeto(intanciación)
///Ejercicio1 de Servicios

package servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author flavia
 */
class CuentaBancariaServicio1 {
        Scanner scanner = new Scanner(System.in);
       
        CuentaBancaria cuenta = new CuentaBancaria();

 public CuentaBancaria crearCuenta() {
     ///Se utiliza un contructor vacio y por tal motivo hay que crear un objeto. 
     ///Lo llamamos cuenta al objeto creado
     ///llamamos al Set que creamos en Entidad (atributos)
      ///se inicializa para darle datos

        System.out.println("Ingrese el número de cuenta:");
        cuenta.setNumeroCuenta (scanner.nextLong());
        System.out.println("Ingrese el DNI del cliente:");
        cuenta.setDniCliente(scanner.nextLong());
        System.out.println("Ingrese el saldo inicial:");
        cuenta.setSaldoActual(scanner.nextDouble());
        return cuenta;
    }

 
        public void ingresar(CuentaBancaria cuenta) {
        System.out.println("Ingrese el monto a ingresar/importar/meter/poner: ");
        cuenta.setSaldoActual (cuenta.getSaldoActual() + scanner.nextDouble());
            }
        public void retirar(CuentaBancaria cuenta); {
        System.out.println("Ingrese el monto a retirar: ");
        double saldoFinal = scanner.nextDouble();
        
        if (saldoFinal > cuenta.getSaldoActual()) {
            System.out.println("Solo puedes retirar: " + cuenta.getSaldoActual());
            cuenta.setSaldoActual(0);
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
        double saldo20 = scanner.nextDouble();

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
        cuenta.toString();
    }
     
    
 }
             
   