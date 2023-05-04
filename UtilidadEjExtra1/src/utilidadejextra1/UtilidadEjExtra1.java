/*
CreUna clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año,en minúsculas.A continuación, declara una 
variable mes Secreto de tipo String,y hazla igual a un elemento del 
array(porejemplo,mesSecreto=mes[9]. El programa debe pedir al usuario
que adivine el mes secreto.Si el usuario acierta mostrar un mensaje,y si no 
lo hace,pedir que vuelva a intentar adivinar el mes secreto.
Un ejemplo de ejecución del programa podría ser este: Adivine el mes secreto.
Introduzca el nombre del mes en minúsculas: febrero No ha acertado.
Intente adivinarlo introduciendo otro mes: agosto ¡Haacertado!
 */
package utilidadejextra1;

import java.util.Random;

import java.util.Scanner;

public class UtilidadEjExtra1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo",
            "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre",
            "Diciembre"};
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(12);
        String mesSecreto = meses[numeroAleatorio];
        // Mostrar el menú de opciones.
        System.out.println("Tienes que adivinar el mes secreto");
        System.out.println("--------------------------------");
        System.out.println("1. Enero");
        System.out.println("2. Febrero");
        System.out.println("3. Marzo");
        System.out.println("4. Abril");
        System.out.println("5. Mayo");
        System.out.println("6. Junio");
        System.out.println("7. Julio");
        System.out.println("8. Agosto");
        System.out.println("9. Septiembre");
        System.out.println("10. Octubre");
        System.out.println("11. Noviembre");
        System.out.println("12. DIciembre");

        // Leer la opción ingresada por el usuario.
        int opcion = sc.nextInt();

        // Procesar la opción ingresada por el usuario.
        if (c == 'a' || c == 'e'|| c == 'i'|| c == 'o' || c == 'u'|| 
                c == 'A'|| c == 'E'|| c == 'I' || c == 'O'|| c == 'U'){
            cont++;
            }

        while (opcion != 0) {
            switch (opcion) {
                case 1:
                    miServicio.llenarCafetera();
                    System.out.println("La cafetera ha sido llenada");
                    break;
                case 2:
                    System.out.println("Ingrese el tamaño de la taza en unidades de café:");
                    int tamañoTaza = sc.nextInt();
                    miServicio.servirTaza(tamañoTaza);
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad de café que desea agregar:");
                    int cantidadCafe = sc.nextInt();
                    miServicio.agregarCafe(cantidadCafe);
                    System.out.println("Se han agregado " + cantidadCafe + " unidades de café a la cafetera");
                    break;
                case 4:
                    miServicio.vaciarCafetera();
                    System.out.println("La cafetera ha sido vaciada");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
            System.out.println("Adivina mes secreto");
            switch String  
            
        
    

mesadivinar = ""
             

    }

}
