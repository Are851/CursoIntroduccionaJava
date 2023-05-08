/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra2D;

import java.util.Scanner;

public class Entidad1 {
      public double x1, y1, x2, y2;

    public Entidad1() {
    }

    public Entidad1(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    
    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getX2() {
        return x2;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX1() {
        return x1;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

      
    public void crearPuntos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la coordenada x del primer punto: ");
        x1 = sc.nextDouble();
        System.out.println("Ingrese la coordenada y del primer punto: ");
        y1 = sc.nextDouble();
        System.out.println("Ingrese la coordenada x del segundo punto: ");
        x2 = sc.nextDouble();
        System.out.println("Ingrese la coordenada y del segundo punto: ");
        y2 = sc.nextDouble();
        sc.close();
    }   
    public void CalcularDistancia(){
      double distancia =  Math.sqrt(Math.pow((this.x2 - this.x1), 2) + Math.pow((this.y2 - this.y1), 2));
         System.out.println("La distancia entre los puntos (" +this.x1 + "- " +this.y1 + ") y (" + this.x2 + "- " + this.y2 + ") es: " + distancia);

            }

  

    
} 

