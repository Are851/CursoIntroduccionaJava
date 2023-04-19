
package EjercicioExtra4C;

public class Cuenta {
        private final String titular;
    private double saldo;


    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    Cuenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void retirarDinero(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("No tienes suficiente saldo para realizar esta operación.");
        } else {
            saldo -= cantidad;
            System.out.println("Has retirado " + cantidad + " euros. Tu nuevo saldo es " + saldo + " euros.");
        }
    }

    void retirarDinero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

