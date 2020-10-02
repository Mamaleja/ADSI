
package ejercicios;

import java.util.Scanner;

/**
ingrese las edades de N personas
 */
public class Numero2 {
      Scanner tb =new Scanner (System.in);
        private Scanner teclado;
        private int[] edad;
        
        public void cargar(){
            teclado= new Scanner(System.in);
            int n;
            System.out.println("ingrese el numero de personas: ");
            n=teclado.nextInt();
            edad=new int[n];
            for (int i = 0; i < edad.length; i++) {
                System.out.println("ingrese edad: ");
                edad[i]=teclado.nextInt(); 
           }
      }
        public void imprimir(){
            for (int i = 0; i < edad.length; i++) {
                System.out.println(edad[i]);
            }
        }
        public static void main(String[] args) {
        Numero2 tv=new Numero2();
        tv.cargar();
        tv.imprimir();
    }
   }

