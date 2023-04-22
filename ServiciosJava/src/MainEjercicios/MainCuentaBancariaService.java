///Ejercicio1 de Servicios
package Main;

import Service.CuentaBancariaService;
import Entidades.CuentaBancaria;

public class MainCuentaBancariaService{
    public static void main(String[] args) {
        CuentaBancariaService cuentaService = new CuentaBancariaService();

        // Crear cuenta
        CuentaBancaria cuenta = cuentaService.crearCuenta();

        // Realizar operaciones
        cuentaService.ingresar(cuenta);
        cuentaService.retirar(cuenta);
        cuentaService.extraccionRapida(cuenta);
        cuentaService.consultarSaldo(cuenta);
        cuentaService.consultarDatos(cuenta);
    }
}
