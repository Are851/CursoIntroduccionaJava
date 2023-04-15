
package mascota;

import mascota.Entidades.Mascota;
import java.util.Scanner;

public class Mascotaapp {

    public static void main(String[] args) {
        
    Scanner leer= new Scanner(System.in);
        
    Mascota m1 = new Mascota ("Fernando Chiquito", "chiquito", "Perro");
        
    m1.setNombre  "PepeChiquito";

    m1.pasear(100);
    
        System.out.println(m1.toString());
        
    }

    }



    
