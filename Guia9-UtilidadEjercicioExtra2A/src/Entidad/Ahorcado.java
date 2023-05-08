package Entidad;

public class Ahorcado {
    public char[] palabra;
    private boolean[] encontradas;
    private int cantidadMaximaJugadas;
    private int intentos;

    public void crearJuego(String palabra, int cantidadMaximaJugadas) {
        this.palabra = palabra.toCharArray();
        this.cantidadMaximaJugadas = cantidadMaximaJugadas;
        this.encontradas = new boolean[palabra.length()];
        this.intentos = cantidadMaximaJugadas;
    }

    public int longitud() {
        return palabra.length;
    }

    public boolean buscar(char letra) {
        boolean encontrada = false;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i] == letra) {
                encontrada = true;
                encontradas[i] = true;
            }
        }
        if (!encontrada) {
            intentos--;
        }
        return encontrada;
    }

    public boolean encontradas(char letra) {
        boolean encontrada = false;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i] == letra && !encontradas[i]) {
                encontrada = true;
                encontradas[i] = true;
            }
        }
        if (!encontrada) {
            intentos--;
        }
        return encontrada;
    }

    public int intentos() {
        return intentos;
    }

    public int getLetrasEncontradas() {
        int letrasEncontradas = 0;
        for (int i = 0; i < encontradas.length; i++) {
            if (encontradas[i]) {
                letrasEncontradas++;
            }
        }
        return letrasEncontradas;
    }

    public String mostrarPalabra() {
        StringBuilder palabraMostrada = new StringBuilder();
        for (int i = 0; i < palabra.length; i++) {
            if (encontradas[i]) {
                palabraMostrada.append(palabra[i]).append(" ");
            } else {
                palabraMostrada.append("* ");
            }
        }
        return palabraMostrada.toString();
    }
}