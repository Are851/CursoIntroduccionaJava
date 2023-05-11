/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos, 
un vector con la palabra a buscar, 
la cantidad de letras encontradas y la cantidad jugadas máximas que puede realizar el usuario.
*/
package Entidad;

public class Ahorcado {
     private char palabra[];
     private int letrasEncontradas;
     private int jagadasMaximas;

     public Ahorcado() {
     }

     public Ahorcado(char[] palabra, int letrasEncontradas, int jagadasMaximas) {
          this.palabra = palabra;
          this.letrasEncontradas = letrasEncontradas;
          this.jagadasMaximas = jagadasMaximas;
     }

     public char[] getPalabra() {
          return palabra;
     }

     public int getLetrasEncontradas() {
          return letrasEncontradas;
     }

     public int getJagadasMaximas() {
          return jagadasMaximas;
     }

     public void setPalabra(char[] palabra) {
          this.palabra = palabra;
     }

     public void setLetrasEncontradas(int letrasEncontradas) {
          this.letrasEncontradas = letrasEncontradas;
     }

     public void setJagadasMaximas(int jagadasMaximas) {
          this.jagadasMaximas = jagadasMaximas;
     }

    

  
     
     
}
