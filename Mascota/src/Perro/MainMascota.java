
package Perro;

public class MainMascota {

    public static void main(String[] args) {
        
     Mascota miMascota = new Mascota();
        
    Mascota m1 = new Mascota ("Fernando Chiquito", "chiquito", "Perro");

    m1.setNombre   ("PepeChiquito");

    m1.pasear(100);
    
        System.out.println(m1.toString());

   
    miMascota.Mascotacarga();
    System.out.println(miMascota.toString());
}
    }

   



    
