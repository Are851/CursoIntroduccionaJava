package EjercicioExtra4;

public class MainCuenta {
     public static void main(String[] args) {
        // Creamos una nueva cuenta con un saldo inicial de 1000 y titular "Juan"
        Cuenta cuenta = new Cuenta("Juan", 1000);

        // Imprimimos el saldo inicial
        System.out.println("Saldo inicial: " + cuenta.getSaldo());

        // Retiramos 500 de la cuenta
        cuenta.retirarDinero(500);

        // Imprimimos el saldo después del retiro
        System.out.println("Saldo después del retiro: " + cuenta.getSaldo());

        // Intentamos retirar 800 de la cuenta
        cuenta.retirarDinero(800);

        // Imprimimos el saldo después del segundo retiro
        System.out.println("Saldo después del segundo retiro: " + cuenta.getSaldo());
    }
}

