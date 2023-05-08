
package EjercicioExtra4B;


public class Main {
    public static void main(String[] args) {
        
        Cuenta c1 = new Cuenta("Amalia Java", 20000); //Asignamos los atributos por este modo
        Cuenta c2 = new Cuenta();
        
        c2.setTitular("Pepito Cuevas"); //y con los set 
        c2.setSaldo(15000);
        //Ahora usamos el metodo reirar_dinero para ambos casos...
        c1.retirar_dinero();
        c2.retirar_dinero();
    }
    
}    

