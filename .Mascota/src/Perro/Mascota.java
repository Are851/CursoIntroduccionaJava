package Perro;

import java.util.Scanner;
///Obejto
public class Mascota {
///Atributos
    public String nombre;
    private String apodo;
    private String tipo;
    private String color;
    private String edad;
    private Boolean cola;
    private String raza;
    private int energia;
 ///Constructor   
    public Mascota(){
        energia  = 1000;
        
    }
///COnstructor con carga datos
public Mascota (String nombre, String apodo, String tipo, String color, String edad, Boolean cola, String raza)  { 
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
    }
///Construcotr con carga datos
public Mascota(String nombre, String apodo, String tipo) {
    this.nombre = nombre;
    this.apodo = apodo;
    this.tipo = tipo;
    this.energia = 1000;
}
/// Carga del set y getter
    public void setNombre (String nombre){
        if (nombre.length() >0){
            this.nombre= nombre;
        }
                }

    public String getApodo() {
        return apodo;
    }

    public Boolean getCola() {
        return cola;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }
    public int pasear(int restarenergia){
        energia-=restarenergia;
        return energia;
       } 

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", energia=" + energia + '}';
    }  
///metodo
   public void Mascotacarga() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese edad: ");
        this.edad = sc.next();
        System.out.print("Ingrese tipo de perro: ");
        this.tipo = sc.next();
        System.out.print("Ingrese el color del perro: ");
        this.color = sc.next();
        System.out.println("Edad: "+this.edad+"tipo perro"+ this.tipo+"color del perro:"+this.color);
       
    }
   
     }
            







