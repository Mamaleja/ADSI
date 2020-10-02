
package ejercicios;

import java.util.Scanner;

/**
ingrese las edades de 5 personas utilizando metodos
 */
public class Numero1 {
    Scanner tb =new Scanner (System.in);
        private Scanner teclado;
        private int[] edad;
        
        public void cargar (){
            teclado= new Scanner(System.in);
            edad=new int[5];
            for (int i = 0; i < 5; i++) {
                System.out.println("ingrese edad: ");
                edad[i]=teclado.nextInt();
            }
        }
     public void imprimir (){
         for (int i = 0; i < 5; i++) {
             System.out.println(edad[i]);
         }
     }
     public static void main(String[] args) {
        Numero1 pv=new Numero1();
        pv.cargar();
        pv.imprimir();
    }
}
