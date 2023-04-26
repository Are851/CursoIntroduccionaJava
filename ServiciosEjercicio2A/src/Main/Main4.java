package MainEjercicio2;

import Entidad.Cafetera2;
import ServiciosEjercicio2.CafeteraServicio3;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {

        Cafetera2 cafetera1 = new Cafetera2(2000, 450);
        CafeteraServicio3 cs = new CafeteraServicio3();
        Scanner leer = new Scanner(System.in);
        int opc, taza, cafe;
        boolean esValido;

        do {
            System.out.println("\n>>>>>>>>>>NESPRESSO<<<<<<<<<<");
            System.out.println(">>>>>>>>>>>>>MENU<<<<<<<<<<<<<<");
            System.out.println("1. LLENAR CAFETERA");
            System.out.println("2. SERVIR TAZA");
            System.out.println("3. VACIAR CAFETERA");
            System.out.println("4. AGREGAR CAFE");
            System.out.println("5. APAGAR");
            System.out.println("================================");
            System.out.print("\nSeleccione una opcion: ");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    cs.llenarCafetera(cafetera1);
                    break;

                case 2:
                    System.out.print("Ingrese los mililitros (ml) de la taza: ");
                    taza = leer.nextInt();
                    cs.servirTaza(cafetera1, taza);
                    break;

                case 3:
                    cs.vaciarCafetera(cafetera1);
                    break;

                case 4:
                    do {
                        System.out.print("Ingrese la cantidad de cafe a agregar (ml):  ");
                        cafe = leer.nextInt();

                        esValido = cs.agregarCafe(cafetera1, cafe);

                    } while (!esValido);
                    break;
                  
                case 5:
                    System.out.println("Apagando...");
                    break;
            }
            System.out.println("\n================================");
            cs.mostrarDatos(cafetera1);

        } while (opc != 5);

    }
}    

