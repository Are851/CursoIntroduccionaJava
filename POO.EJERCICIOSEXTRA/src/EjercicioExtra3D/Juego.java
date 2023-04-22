
package EjercicioExtra3D;
///En este Ejercicio usamos SET para modficar los atributos
import java.util.Scanner;

public class Juego {
  private int j1;
    private int j2;
    private String nom1;
    private String nom2;
    private int Int;
    private boolean ju2 = false;
    private boolean ju1 = !ju2;

    public Juego() {
    }

    public Juego(int j1, int Int, String nom1, String nom2) {
        this.j1 = j1;
        this.Int = Int;
        this.nom1=nom1;
        this.nom2=nom2;
    }
/**
 * 
 * @param j1 
 */
    public void setJ1(int j1) {
        this.j1 = j1;
    }
/**
 * 
 * @param j2 
 */
    public void setJ2(int j2) {
        this.j2 = j2;
    }
/**
 * 
 * @param nom1 
 */
    public void setNom1(String nom1) {
        this.nom1 = nom1;
    }
/**
 * 
 * @param nom2 
 */
    public void setNom2(String nom2) {
        this.nom2 = nom2;
    }
    
/**
 * 
 * @param Int 
 */
    public void setInt(int Int) {
        this.Int = Int;
    }
    
/**
 * 
 * @param ju2 
 */
    private void setJu2(boolean ju2) {
        this.ju2 = ju2;
    }
/**
 * 
 * @param ju1 
 */
    private void setJu1(boolean ju1) {
        this.ju1 = !ju2;
    }
/**
 * 
 * @return 
 */
    public int getJ1() {
        return j1;
    }
/**
 * 
 * @return 
 */
    public int getJ2() {
        return j2;
    }
/**
 * 
 * @return 
 */
    public String getNom1() {
        return nom1;
    }
/**
 * 
 * @return 
 */
    public String getNom2() {
        return nom2;
    }
/**
 * 
 * @return 
 */
    public int getInt() {
        return Int;
    }
    
/**
 * 
 * @return 
 */
    public boolean isJu2() {
        return ju2;
    }
/**
 * 
 * @return 
 */
    public boolean isJu1() {
        return ju1;
    }
    
   public void inicioJuegoJ1() {
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese su nombre jugador 1");
       setNom1(leer.next());
       System.out.print(nom1+" :\nIngrese un numero para adivinar: ");
       setJ1(leer.nextInt());
       System.out.print("\nIngrese la cantidad de intentos que tendra el jugador 2: ");
       setInt(leer.nextInt());
       System.out.println("\nEl jugador 2 tendra que adivinar el numero "+j1+" en "+Int+" intentos\n\n entregue el mando al jugador 2\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");   
   }
   
   public void inicioJuegoJ2(){
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese su nombre jugador 2:");
       setNom2(leer.next());
       int contador=1;
       while(contador<=Int && ju2==false){
           System.out.println(nom2+" :\nTiene usted "+Int+" intentos para adivinar el numero que ingreso el jugador 1");
           System.out.print("Intento "+contador+":\n");
           setJ2(leer.nextInt());
           contador++;
           if (j2<j1) {
               System.out.println("\n"+nom2+"Usted eligio un numero que esta por debajo del objetivo");
           }else if(j2>j1) {
               System.out.println("\n"+nom2+"Usted eligio un unmero que esta por encima del objetivo");
           }else {
               System.out.println("\nFelicitaciones!!"+nom2+", has ganado en "+(contador-1)+" intentos");
               setJu2(true);
           }
           
        }
       String ganador;
       String perdedor;
       if(ju2==true){
           ganador=nom2;
           perdedor=nom1;
       }else{
           ganador=nom1;
           perdedor=nom2;
       }
       System.out.println("Fin del juego, estos son los resultados:\nGanador: "+ganador+"\nPerdedor: "+perdedor);
    }
}
    

