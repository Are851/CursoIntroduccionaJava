/*
Realizar una clase llamada Persona en el paquete de entidades que tengan los siguientes atributos: nombre, edad, sexo 
(‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún otro atributo, puede hacerlo. 
Agregar constructores, getters y setters.

 */
package Entidad;

public class Persona {
    //atributos
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;
//(‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro)
    
    //constructor vacio
    public Persona(){
    }
    
    //contructor por refencia/parametro
    public Persona(String nombre, int edad, String sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        
    }

   //set

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    //get

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
    
}
