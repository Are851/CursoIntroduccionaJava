
package EjercicioExtra2D;

import EjercicioExtra2B.Puntos;

class puntos1 {
   
    Entidad distancia = new Entidad();
            
    distancia =  Math.sqrt(Math.pow((this.Getx2 - this.Getx1), 2) + Math.pow((this.Gety2 - this.Gety1), 2));
            }

   System.out.println("La distancia entre los puntos (" + puntos.getX1() + ", " + puntos.getY1() + ") y (" + puntos.getX2() + ", " + puntos.getY2() + ") es: " + distancia);
    
}
