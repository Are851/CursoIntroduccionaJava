/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class CuentaBancariaServicio {
    
    
    //DATAZO... crear el objeto en forma global
    //que toma la forma del constructor de la clase ENTIDAD
    //se arman todo los metodos con esos datos y en el MAIN se 
    //crea un objeto llamando a la clase SERVICIO
    
    CuentaBancaria cuenta00 = new CuentaBancaria();
    
    //Método para crear cuenta pidiéndole los datos al usuario.
    //metodo vacio para crear cuenta
   
    public void crearCuenta(){
        
        Scanner leer = new Scanner(System.in);
       
        

        System.out.println("Ingrese su numero de documento");
        cuenta00.setDniCliente(leer.nextLong());
        
        int auxiliar = (int) (int) (Math.random() + Math.random() * 10);
        
        
        cuenta00.setNumeroCuenta(auxiliar);
        
        System.out.println("Saldo Actual");
        cuenta00.setSaldoActual(leer.nextDouble());
       
    }
    
    /*
    Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
    */
    
    public void ingresarSaldo(){
        
        
        
        Scanner leer = new Scanner(System.in);
        
        double ingreso;
        
        System.out.println("Cuanto dinero va a ingresar");
        
        ingreso = leer.nextDouble();
        
        cuenta00.setSaldoActual(cuenta00.getSaldoActual() +  ingreso) ;
        
    }

    /*
    Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
    Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0
    */
    
    
    public void retirarSaldo (){
        
        
       
        
        Scanner leer = new Scanner(System.in);
        
        double retiro;
        
        System.out.println("cuanto dinero va a retirar?");
        retiro = leer.nextDouble();
        
        if (cuenta00.getSaldoActual()<retiro) {
            System.out.println("no tiene saldo suficiente");
            System.out.println("retira la suma total" + cuenta00.getSaldoActual());
            cuenta00.setSaldoActual(0.0);
            System.out.println("Su cuenta tiene " + cuenta00.getSaldoActual());
            
        }
        else
        {
            cuenta00.setSaldoActual(cuenta00.getSaldoActual()-retiro);
            System.out.println("le queda de saldo " + cuenta00.getSaldoActual());
        }
        
        
    }

    
    
    /*
    Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
    */
    
    public void extraccionRapida (){
        Scanner leer = new Scanner(System.in);      
        System.out.println("Esta operacion solo le permite sacar el 20% del saldo");
        System.out.println("Saldo actual " + cuenta00.getSaldoActual());
        
        double porcentaje;
        double retiro;
        
        porcentaje = cuenta00.getSaldoActual()*.2;
        
        System.out.println("maximo saldo a retirar " + porcentaje);
        System.out.println("Cuanto desea retirar");
        retiro = leer.nextDouble();
        
        if (porcentaje<retiro) {
            
            System.out.println("el monto supera el permitido");
            System.out.println("el monto a retirar " + porcentaje);
            cuenta00.setSaldoActual(cuenta00.getSaldoActual()-porcentaje);
        }
        else
        {
            System.out.println("el monto no supera el permitido");
            System.out.println("el monto a retirar " + retiro);
            cuenta00.setSaldoActual(cuenta00.getSaldoActual()-retiro);
        }
    
    }
    
         /*
        Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
        */
    
      public void consultaSaldo(){
          System.out.println("el saldo actual es " + cuenta00.getSaldoActual());
            
        }
    
      /*
      Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
      */
      
      public void consultaDatos (){
          
          System.out.println("el DNI es :" + cuenta00.getDniCliente());
          System.out.println("la cuenta es :" + cuenta00.getNumeroCuenta());
          System.out.println("el saldo es :" + cuenta00.getSaldoActual());
      }
      
      
    }

    

