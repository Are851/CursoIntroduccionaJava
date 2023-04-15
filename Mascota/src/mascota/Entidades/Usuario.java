
package mascota.Entidades;


public class Usuario {
    public String nombre;
    public String apellido;
    public String dni;
    public String nacimiento;
    public String pais;
    
public Usuario(){
    
}

    public Usuario(String nombre, String apellido, String dni, String nacimiento, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.pais = pais;
    }
        
}
