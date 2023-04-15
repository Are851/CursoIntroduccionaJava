package Ejercicio3OPeraciones;

import java.util.Scanner;
///Atributos
public class Operacion {
    private double numero1;
    private double numero2;
///COnstructor1
    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
///Constructor2
    public Operacion() {
        this.numero1 = 0;
        this.numero2 = 0;
    }
///Metodo1 con Get
    public double getNumero1() {
        return numero1;
    }
///Metodo2 con Set
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }
///Metodo3 con Get
    public double getNumero2() {
        return numero2;
    }
///Metodo4 con Set
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
///Metodo5
    public void crearOperacion() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        this.numero1 = sc.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        this.numero2 = sc.nextDouble();
    }

    public double sumar() {
        return numero1 + numero2;
    }
///Metodo6
    public double restar() {
        return numero1 - numero2;
    }
///Metodo7
    public double multiplicar() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("No se puede multiplicar por cero");
            return 0;
        } else {
            return numero1 * numero2;
        }
    }
///Metodo8
    public double dividir() {
        if (numero2 == 0) {
            System.out.println("No se puede dividir por cero");
            return 0;
        } else {
            return numero1 / numero2;
        }
    }
}    
