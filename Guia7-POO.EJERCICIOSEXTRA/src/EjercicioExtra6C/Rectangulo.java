/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra6C;

/**
 *
 * @author flavia
 */
public class Rectangulo {
     
    //atributos
    
    private double lado1;
    private double lado2;
    
    //constructores

    public Rectangulo() {
    }

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //Metodos Get and Set
    
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
    //Metodo calcular_area
    
    public void calcular_area() {
        
        System.out.println("El area del rectangulo es de: " +(this.lado1*this.lado2));
        
    }
    
}   

