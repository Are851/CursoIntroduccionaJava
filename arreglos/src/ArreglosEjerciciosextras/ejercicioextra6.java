package ArreglosEjerciciosextras;

    import java.util.ArrayList ;
    import java.util.List ;
    import java.util.Random ;
    import java.util.Scanner ;
public class ejercicioextra6 {
    /// 6.- Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a
    ///medida que el usuario las va ingresando, construya una “sopa de letras para niños” 
///de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden 
///horizontal en una fila que será seleccionada de manera aleatoria. Una vez concluida 
///la ubicación de las palabras, rellene los espacios no utilizados con un número
    ///aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.
///Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes 
///funciones de Java substring(), Length() y Math.random().

      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        List<String> palabras = new ArrayList<>();

        // Leer 5 palabras de mínimo 3 y hasta 5 caracteres
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese la palabra " + i + ": ");
            String palabra = sc.nextLine();

            // Verificar que la palabra tenga entre 3 y 5 caracteres
            if (!verificarLongitudPalabra(palabra)) {
                System.out.println("La palabra debe tener entre 3 y 5 caracteres.");
                i--;
                continue;
            }

            palabras.add(palabra.toUpperCase());
        }

        // Crear la sopa de letras
        char[][] sopa = crearSopaDeLetras(palabras, random);

        // Imprimir la sopa de letras
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean verificarLongitudPalabra(String palabra) {
        return palabra.length() >= 3 && palabra.length() <= 5;
    }

    public static char[][] crearSopaDeLetras(List<String> palabras, Random random) {
        // Definir el tamaño de la sopa de letras
        int tamano = 20;
        // Crear una matriz vacía con el tamaño de la sopa de letras
        char[][] sopa = new char[tamano][tamano];
        for (char[] fila : sopa) {
            for (int i = 0; i < fila.length; i++) {
                fila[i] = (char) (random.nextInt(10) + '0');
            }
        }

        // Elegir una fila aleatoria para colocar las palabras
        int fila = random.nextInt(tamano);
        int columnaInicial = random.nextInt(tamano - palabras.size() + 1);

        // Colocar las palabras en la fila seleccionada
        for (String palabra : palabras) {
            char[] caracteres = palabra.toCharArray();
 for (int i = 0; i < caracteres.length; i++) {
                sopa[fila][columnaInicial + i] = caracteres[i];
            }
            columnaInicial += caracteres.length + 1;
        }

        return sopa;
    }
}