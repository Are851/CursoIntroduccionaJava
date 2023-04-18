
package Ejercicio4ARectangulo;

import java.util.Scanner;


public class Entidad {
    private double base;
    private double altura;

    public Entidad(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Entidad() {
    }

    

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public Entidad(double altura) {
        this.altura = altura;
    }
    public void areaRectangulo() {

        System.out.println("el area es: " + (base * altura));

    }

    public void perimetroRectangulo() {

        System.out.println("el perimetro es: " + ((base + altura) * 2));
    }

    public void dibujoRectangulo() {

        for (int i = 0; i < (int) altura; i++) {
            for (int j = 0; j < (int) base; j++) {

                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }

    }

}

