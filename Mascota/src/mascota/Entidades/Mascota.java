package mascota.Entidades;

public class Mascota {

    public String nombre;
    private String apodo;
    private String tipo;
    private String color;
    private String edad;
    private Boolean cola;
    private String raza;
    private int energia;
    
    public Mascota(){
        energia  = 1000;
        
    }
public Mascota (String nombre, String apodo, String tipo, String color, String edad, Boolean cola, String raza)  { 
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
    }

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
    }
            







