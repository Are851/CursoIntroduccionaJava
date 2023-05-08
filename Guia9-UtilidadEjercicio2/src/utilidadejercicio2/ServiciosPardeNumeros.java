package utilidadejercicio2;

import Entidad.ParDeNumeros;

public class ServiciosPardeNumeros {

    public void mostrarValores(ParDeNumeros par) {
        System.out.println("Numero 1 es :" + par.getNum1());
        System.out.println("Numero 2 es :" + par.getNum2());
    }

    public double devolverMayor(ParDeNumeros par) {
        if (par.getNum1() > par.getNum2()) {
            return par.getNum1();
        } else {
            return par.getNum2();
        }
    }
//opcion 1
    public double calcularPotencia(ParDeNumeros par) {
        double num1 = Math.round(par.getNum1());
        double num2 = Math.round(par.getNum2());

        if (par.getNum1() > par.getNum2()) {
            return Math.pow(num1, num2);
        } else {
            return Math.pow(num2, num1);
        }
    }
//opcion2

//    public void calcularPotencia1(ParDeNumeros par) {
//        switch (Double.compare(par.getNum1(), par.getNum2())){
/////Compara getnum1 y getNum2 y si es el getnum1 es mayor da 1, si el getNum2 
/////es mayor da -1, y si son iguales 0.
//                case 1:
//                System.out.println("El" + par.getNum1() + "es mayor");
//                break;
//            case -1:
//                System.out.println("El" + par.getNum2() + "es mayor");
//                break;
//            case 0:
//                System.out.println("Los numeros son iguales");
//                break;
//
//        }
//
//    }

    public double calcularRaiz(ParDeNumeros par) {
        double num;
        if (par.getNum1() > par.getNum2()) {
            num = Math.abs(par.getNum2());
            return Math.sqrt(num);
        } else {
            num = Math.abs(par.getNum1());
            return Math.sqrt(num);
        }
    }
}
