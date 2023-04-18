package EjercicioExtra6B;

import java.util.Scanner;


public class Rectangulo {
    private  double lado1;
    private  double lado2;

    public Rectangulo() {
    }

    
    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double calcularArea() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese Lado1: ");
        this.lado1 = sc.nextInt();
        System.out.print("Ingrese Lado2: ");
        this.lado2 = sc.nextInt();
        return lado1 * lado2;
    }
}

