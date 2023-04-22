/* Ejercicio 1 de Servicios
*/ 
package MainEjercicios;

import Entidades.CuentaBancaria;
import serviciosjava.CuentaBancariaServicio;

public class MainCuentaBancariaServicio1 {
    public static void main(String[] args) {
        CuentaBancariaServicio cuentaBancariaServicio = new CuentaBancariaServicio();
        
        // Crear cuenta
        CuentaBancaria cuenta = cuentaBancariaServicio.crearCuenta();
        
        // Ingresar dinero
        cuentaBancariaServicio.ingresar(cuenta, 500);
        
        // Retirar dinero
        cuentaBancariaServicio.retirar(cuenta, 200);
        
        // Realizar extracción rápida
        cuentaBancariaServicio.extraccionRapida(cuenta);
        
        // Consultar saldo
        cuentaBancariaServicio.consultarSaldo(cuenta);
        
        // Consultar datos
        cuentaBancariaServicio.consultarDatos(cuenta);
    }
}
 
}
