
package ejercicios;

import java.util.Scanner;

/**
crear un vector de n posiciones ingresar numeros enteros
* sume los elementos que se encuentran en las posicions pares 
 */

public class Ejercicio4 {
    public static void main(String[] args) {
         Scanner tb =new Scanner (System.in);
         double acum=0;
         int n;
         
         System.out.println("ingrese la longitud del vector: ");
         n=tb.nextInt();
         
        // declarar el vector
        int numero[]= new int[n];
        
        // ingresarle los valores al vector
        for (int i = 0; i < numero.length; i++) {
            System.out.println("ingrese los numero en la posicion: "+i);
            numero[i]=tb.nextInt();
        }
            //suma de las posiciones positivas
            
            for (int i = 0; i < numero.length; i++) {
                if(i % 2==0 &&  i!=0){
                     acum=acum+numero[i];  
                }
            }
            System.out.println("la suma de las posiciones es: "+acum);
        }
    }

