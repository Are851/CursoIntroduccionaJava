/*
Imagina que tienes una lista de empleados en una pequeña empresa, y deseas
calcular su salario promedio y saber cuáles empleados tienen un salario
superior al promedio.
Para hacer esto, debes crear un objeto de tipo Empleado, cuyos atributos serán
el nombre y el salario (que representa el salario mensual del empleado). La
empresa cuenta con solamente 6 empleados, por lo que deberás crear los 6
objetos Empleado con sus respectivos salarios.
Una vez creados los empleados, deberás guardarlos en un arreglo de objetos
tipo Empleado. Utilizando ese arreglo, tendrás que realizar las dos tareas que
te piden:
1. Calcular y mostrar el salario promedio de todos los empleados.
2. Retornar otro arreglo con los nombres de los empleados que tienen un
salario mayor al promedio.
Finalmente, debes mostrar todos los empleados con un salario superior al
promedio.
Recuerda que para crear un vector de objetos, la definición es la siguiente:
Objeto nombreVector[] = new Objeto[];
 */
package Entidad;


public class Empleado {
    private double salario;
    private String nombre;

    public Empleado(int salario) {
        this.salario = salario;
    }

    public Empleado() {
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    
    public Empleado(double salario, String nombre) {
        this.salario = salario;
        this.nombre = nombre;
    }

   
    public double getSalario() {
        return salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
