/* EJERCICIO 3 GUIA 8
Realizar una clase llamada Persona en el paquete de entidades que tengan 
los siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, 
‘O’ para otro), peso y altura. Si desea añadir algún otro atributo, puede 
hacerlo. Agregar constructores, getters y setters.
 */
package Entidades;

public class Persona {
    /*
    atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, 
    ‘O’ para otro), peso y altura. Si desea añadir algún otro atributo, puede 
    hacerlo.
    */
    private String nombre;
    private String nacionalidad;
    private int edad;
    private String sexo;
    private float peso;
    private float altura;
    private String colorPelo;
    private String colorOjos;
    
    //constructores
    public Persona() {}   

    public Persona(String nombre, String nacionalidad, int edad, String sexo, 
            float peso, float altura, String colorPelo, String colorOjos) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.colorPelo = colorPelo;
        this.colorOjos = colorOjos;
    }

    //getters y setters
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getNacionalidad() {return nacionalidad;}
    public void setNacionalidad(String nacionalidad) {this.nacionalidad = nacionalidad;}

    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}

    public String getSexo() {return sexo;}
    public void setSexo(String sexo) {this.sexo = sexo;}

    public float getPeso() {return peso;}
    public void setPeso(float peso) {this.peso = peso;}

    public float getAltura() {return altura;}
    public void setAltura(float altura) {this.altura = altura;}

    public String getColorPelo() {return colorPelo;}
    public void setColorPelo(String colorPelo) {this.colorPelo = colorPelo;}

    public String getColorOjos() {return colorOjos;}
    public void setColorOjos(String colorOjos) {this.colorOjos = colorOjos;}   

    
}

