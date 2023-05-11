/*

public void  crearJuego(){
        
        System.out.println("Ingrese la palabra");
        String palabra=leer.next();
        System.out.println("Ingrese la cantidad de jugadas maximas");
        a1.setJugadasMaximas(leer.nextInt());
                
        a1.setBusca(palabra.toCharArray());
        
      //  System.out.println(Arrays.toString(a1.getBusca()));
        
        
    }
    
    public int longitud(){
        
//        System.out.println("La longitud es: ");
//        System.out.println(a1.getBusca().length);
        return a1.getBusca().length;
    }
    
    public boolean buscar(char letrax) {
        char[] buscar = a1.getBusca();

        for (int i = 0; i < buscar.length; i++) {
            if (buscar[i] == letrax) {
                return true;
            }
        }
        return false;
    }
 public boolean encontradas(char letraz){
       int cont=a1.getLetrasEncontradas();
        
        char[] buscar = a1.getBusca();

        for (int i = 0; i < buscar.length; i++) {
            if (buscar[i] == letraz) {
               a1.setLetrasEncontradas(a1.getLetrasEncontradas()+1);
                System.out.println("Felicidades encontro una letra :D");
            }
        }
       System.out.println("Te faltan " + (longitud()-a1.getLetrasEncontradas())+" letras");
        if(cont==a1.getLetrasEncontradas()){
            
            return true;
        }else{
            a1.setJugadasMaximas(a1.getJugadasMaximas()-1);
            return false;
        }





Definir los siguientes métodos en 
AhorcadoService:
Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la palabra del usuario, pone la longitud de
la palabra, como la longitud del vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
de la palabra en un índice del vector. Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.

Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.

Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra ingresada es parte de la palabra 
o no. También informará si la letra estaba o no.

Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han sido encontradas y 
cuántas le faltan. Este método además deberá devolver true si la letra estaba y false si la letra no estaba, ya que, cada 
vez que se busque una letra que no esté, se le restará uno a sus oportunidades.

Método intentos(): para mostrar cuántas oportunidades le queda al jugador.

Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará cuando el
usuario descubra toda la palabra o se quede sin intentos. Este método se llamará en el main.

 */
package Service;

import java.util.Scanner;
import Entidad.Ahorcado;

public class ServiceAhorcado {

     Scanner read = new Scanner(System.in);
     Ahorcado palabra = new Ahorcado();

     public void crearJuego() {

          System.out.println("Ingrese la palabra: ");
          String x = read.next();

          palabra.setPalabra(x.toCharArray());

          System.out.println("Ingrese la cantidad de intentos: ");
          palabra.setJagadasMaximas(read.nextInt());

     }

     public int longitud() {
          return palabra.getPalabra().length;
     }

     public boolean buscar(char letra) {
          for (int i = 0; i < palabra.getPalabra().length; i++) {
               if (palabra.getPalabra()[i] == letra) {
                    System.out.println("-----------------------------------------------------------------------------------------------");
                    System.out.println("Mensaje: La letra pertenece a la palabra");
                    System.out.println("-----------------------------------------------------------------------------------------------");
                    return true;
               }
          }
          System.out.println("-----------------------------------------------------------------------------------------------");
          System.out.println("Mensaje: La letra NO pertenece a la palabra");
          System.out.println("-----------------------------------------------------------------------------------------------");

          return false;

     }

     public boolean encontradas(char letra) {
          int cont = 0;

          for (int i = 0; i < palabra.getPalabra().length; i++) {
               if (letra == palabra.getPalabra()[i]) {
                    cont++;
               }
          }

          if (cont >= 1) {
               palabra.setLetrasEncontradas(palabra.getLetrasEncontradas() + cont);

               System.out.println("Número de letras (encontradas, faltantes) : (" + palabra.getLetrasEncontradas() + "," + (palabra.getPalabra().length - palabra.getLetrasEncontradas()) + ")");
               System.out.println("-----------------------------------------------------------------------------------------------");
               return true;
          } else {
               palabra.setJagadasMaximas(palabra.getJagadasMaximas() - 1);

               System.out.println("Número de letras (encontradas, faltantes) : (" + palabra.getLetrasEncontradas() + "," + (palabra.getPalabra().length - palabra.getLetrasEncontradas()) + ")");
               System.out.println("-----------------------------------------------------------------------------------------------");

               return false;
          }

     }

     public int intentos() {
          return palabra.getJagadasMaximas();
     }

     public void juego() {
          char letra;

          crearJuego();
          longitud();
          do {

               System.out.println("Ingrese la letra: ");
               letra = read.next().charAt(0);

               buscar(letra);
               encontradas(letra);

               intentos();
          } while (palabra.getLetrasEncontradas() != palabra.getPalabra().length && intentos() != 0);

     }
}
