
import java.util.Scanner;

/*
. Leer cantidad indeterminada de números enteros positivos e imprima el promedio
de todos los números. El algoritmo termina cuando se ingrese un numero múltiplo
de 6
 */


public class Ciclos2 {
    public static void main(String[] args) {
       Scanner TB = new Scanner (System.in); 
       int acum=0, cont=0, num, promedio;
        boolean bandera=true;
       
             while (bandera=true){
                 System.out.println("ingrese un numero");
                 num=TB.nextInt();
                 acum=acum+num;
                 cont=cont+1;
                  if(num % 6==0){
                      promedio=acum/cont;
                      bandera=false;
                      System.out.println("el promedio es : "+promedio);         
                  }
             }
                 
    }
 
}
