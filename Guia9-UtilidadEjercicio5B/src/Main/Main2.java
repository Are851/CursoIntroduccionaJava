/*

 */
package Main;

import Entidad.Persona;
import Servicio.PersonaService2;

public class Main2 {
    public static void main(String[] args) {
        PersonaService2 p= new PersonaService2();
        Persona pp= p.crearPersona();
        long edad=p.calcularEdad(pp);
        p.menorQue(pp, p.calcularEdad(pp));
        p.mostrarPersona(pp);
        p.menorQue(pp, edad);
        
    }
  
}
//import Entidad.Persona;
//import Servicio.PersonaService2;
//
//public class Main2 {
//    public static void main(String[] args) {
//        PersonaService2 p = new PersonaService2();
//        Persona persona = p.crearPersona();
//        long edad = p.calcularEdad(persona);
//        System.out.println(edad);
//        p.menorQue(persona, edad);
//        p.mostrarPersona(persona);
//    }
//}