
import java.util.Scanner;

/*
 En una llantera se ha establecido una promoción de la siguiente manera: Si se
compran menos de cinco llantas el precio es de $300 cada una, de $250 si se
compran de cinco a 10 y de $200 si se compran más de 10. Obtener la el valor a
pagar por llanta y la que tiene que pagar por el total de la compra
 */


public class Condicional2 {
    public static void main(String[] args) {
        Scanner TB = new Scanner (System.in);
        double valorLLanta = 0, totalPagar = 0,cantllanta;
        
        System.out.println("ingrese la cantidad de llantas que desea comprar");
        cantllanta=TB.nextDouble();
        
        if(cantllanta<=5){
            totalPagar=cantllanta*300;
            valorLLanta=300;
        } else if(cantllanta>5){
            totalPagar=cantllanta*250;
            valorLLanta=250;
        }else if(cantllanta >5 && cantllanta<=10){
            totalPagar=cantllanta*200;
            valorLLanta=200;
        }
         System.out.println("el valor a pagar por llanta es: "+valorLLanta);
         System.out.println("el total de su compra es: "+totalPagar);
    }
   
}
