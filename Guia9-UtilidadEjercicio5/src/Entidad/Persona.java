    /**
     * Implemente la clase Persona en el paquete entidades.Una persona tiene un
     * nombre y una fecha de nacimiento TipoDate),constructorvacío,
     * constructorparametrizado,getyset. CrearunaclasePersonaService, en el
     * paquete servicio,con los siguientes métodos: a)MétodocrearPersona que
     * pida al usuario Nombre y fecha de nacimiento de la persona a
     * crear.Retornar el objeto Persona creado. b)Método calcularEdad que
     * calcule la edad del usuario utilizando el atributo de fecha de nacimiento
     * y la fecha actual. c)Métodomenor Que recibe como parámetro una Persona y
     * una edad. Retorna true si la persona es menor que la edad consultada o
     * false en caso contrario. d)Método mostrar Persona que muestra la
     * información de la persona deseada.
     */
package Entidad;

import java.util.Date;


public class Persona {
    private String nombre;
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    

}   

