/*
 En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
Metodo esMayorDeEdad(): el método crear persona, le pide los valores de los atributos al usuario y después se le asignan
a sus respectivos atributos para llenar el objeto Persona. Además, comprueba que el sexo introducido sea correcto, es decir,
H, M o O. Si no es correcto se deberá mostrar un mensaje


Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). Si esta fórmula 
da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y la función devuelve 
un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona está en su peso ideal
y la función devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene 
sobrepeso, y la función devuelve un 1.

A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto, 
deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para cada 
objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays), para después 
calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, 
y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. Para esto, podemos crear unos métodos
adicionales.
 */
package Service;

import Entidad.Persona;
import java.util.Scanner;

public class ServicePersona {

    Scanner read = new Scanner(System.in);

    //modala persona
    public Persona crearPersona() {
        Persona x = new Persona();
        String sex;

        System.out.println("Ingrese el nombre: ");
        x.setNombre(read.next());
        System.out.println("Ingrese la edad: ");
        x.setEdad(read.nextInt());
        System.out.println("Ingrese el sexo: ");
        sex = read.next();

        while (!sex.equalsIgnoreCase("H") && !sex.equalsIgnoreCase("O") && !sex.equalsIgnoreCase("M")) {
            System.out.println("La opcion ingresada es incorrecta. Ingrese otra: ");
            sex = read.next();
        }
        x.setSexo(sex);

        System.out.println("Ingrese el peso: ");
        x.setPeso(read.nextDouble());
        System.out.println("Ingrese la altura: ");
        x.setAltura(read.nextDouble());

        return x;
    }

    public boolean esMayorDeEdad(Persona persona1) {
        if (persona1.getEdad() >= 18) {
            return true;
        }
        return false;
    }

    public int calcularIMC(Persona persona1) {
        int imc = (int) (persona1.getPeso()/ Math.pow(persona1.getAltura(),2));
        
        if (imc<20) {
            return -1;
        }else if(imc >= 20 && imc <= 25){
            return 0;
        }else{
            return 1;
        }
    }
    
    public void calcularPeso(int vecPeso[]){
        int contPesoIdeal = 0, contBajoPeso = 0, contSobrePeso = 0;
        
        for (int i = 0; i < 4; i++) {
            if (vecPeso[i] == -1) {
                contBajoPeso++;
            } else if(vecPeso[i] == 0){
                contPesoIdeal++;
            }else{
                contSobrePeso++;
            }
        }
        
        System.out.println("Peso ideal: " + (contPesoIdeal *100)/4 + "%");
        System.out.println("Sobre peso: " + (contSobrePeso *100)/4 + "%");
        System.out.println("Bajo peso:  " + (contBajoPeso  *100)/4 + "%");
    }
    
    public void calcularEdad(boolean vecEdad[]){
        int mayorEdad = 0, menorEdad = 0;
        
        for (int i = 0; i < 4 ; i++) {
            if (vecEdad[i] == true ) {
                mayorEdad++;
            }else{
                menorEdad++;
            }
            
        }
        
        System.out.println("Mayores: " + (mayorEdad*100)/4 + "%");
        System.out.println("Menores: " + (menorEdad*100)/4 + "%");
    }
    
}
