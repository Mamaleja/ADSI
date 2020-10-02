/*
se ingresa n numeros
averigua la suma de los multiplos de 2, cuntos numeros se ingresaron multiplos de 5 y 7
promesiar todos los numeros
 */
package ciclos.Repaso;

import java.util.Scanner;


public class Multiplos {
    public static void main(String[] args) {
        
     Scanner TB = new Scanner (System.in);
     int i,n,numero, contador=0;
     double acunMultiplo=0,promedio, acunTotal=0;
     
        System.out.println("ingrese N numeros: ");
        n=TB.nextInt();
        for (i=1; i<=n; i++){
            System.out.println("ingrese el numero:");
            numero=TB.nextInt();
            acunTotal=acunTotal+numero;
            if(numero%2==0){
                acunMultiplo=acunMultiplo+numero;
            }
            if (numero%5==0 && numero%7==0){
                contador=contador+1;
            }
            promedio=acunTotal/n;
            System.out.println("la suma multiplos de 2 es:"+acunMultiplo);
            System.out.println("total multiplos de 5 y 7 son:"+contador);
            System.out.println("el promedio de todos los numeros es: "+promedio);
        }
        
}
  }