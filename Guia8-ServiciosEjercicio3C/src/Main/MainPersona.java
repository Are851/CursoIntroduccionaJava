package Main;

import Entidad.Persona;
import Service.ServicePersona;

public class MainPersona {

    public static void main(String[] args) {
        ServicePersona personaService = new ServicePersona();
        
//       Opcion 1
        int vecPeso[] = new int[4];
        boolean vecEdad[] = new boolean[4];
        Persona vecPersonas[] = new Persona[4];
        
        for (int i = 0; i < 4; i++) {
            vecPersonas[i]= personaService.crearPersona();
            vecPeso[i] = personaService.calcularIMC(vecPersonas[i]);
            vecEdad[i] = personaService.esMayorDeEdad(vecPersonas[i]);
        }
        
//        #Opcion 2        
//        Persona persona2 = personaService.crearPersona();
//        Persona persona3 = personaService.crearPersona();
//        Persona persona4 = personaService.crearPersona();
//        Persona persona1 = personaService.crearPersona();
//    
//        int vecPeso[] = {personaService.calcularIMC(persona1),personaService.calcularIMC(persona2),personaService.calcularIMC(persona3),personaService.calcularIMC(persona4)};
//        boolean vecEdad[] = {personaService.esMayorDeEdad(persona1),personaService.esMayorDeEdad(persona2),personaService.esMayorDeEdad(persona3),personaService.esMayorDeEdad(persona4)};


        personaService.calcularPeso(vecPeso);
        personaService.calcularEdad(vecEdad);

    }

}
