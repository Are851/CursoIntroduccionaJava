///Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
///Luego, crea un método "retirar_dinero" que permita retirar una cantidad 
///de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea 
///negativo después de realizar una transacción de retiro.
package EjercicioExtra4;

public class Cuenta {
    private final String titular;
    private double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double retirarDinero(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("No tienes suficiente saldo para realizar esta operación.");
        } else {
            saldo -= cantidad;
            System.out.println("Has retirado " + cantidad + " euros. Tu nuevo saldo es " + saldo + " euros.");
        }
        double retirarDinero = 0;
        return retirarDinero;
    }
}

