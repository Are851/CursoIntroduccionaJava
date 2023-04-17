package EjercicioExtra5;

public class MainEmpleado {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Juan", 35, 3000);
        Empleado emp2 = new Empleado("María", 25, 2000);

        emp1.calcular_aumento();
        emp2.calcular_aumento();

        System.out.println("Nombre: " + emp1.getNombre() + " Salario: " + emp1.getSalario());
        System.out.println("Nombre: " + emp2.getNombre() + " Salario: " + emp2.getSalario());
    }
}

