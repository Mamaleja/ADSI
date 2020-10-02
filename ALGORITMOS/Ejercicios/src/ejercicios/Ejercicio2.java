
package ejercicios;
/* la longitud del vector la determina el usuario
    y que permita ingresar numeros
    multiplos de 3 y la suma de todos
    */
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
         Scanner tb =new Scanner (System.in);
         int n;
         double acumsuma=0;
         System.out.println("ingresar la longitud del vector: ");
                n=tb.nextInt();
                // crear el vector
            int numero[]= new int[n];
            
            for (int i = 0; i < numero.length; i++) {
                System.out.println("ingresar el numero: ");
                numero[i]=tb.nextInt();
        }
            System.out.println("************");
            System.out.println("lista de los numeros");
            
            for (int i = 0; i < numero.length; i++) {
                System.out.println(numero[i]);
        }
            
            System.out.println("****************");
            System.out.println("lista de los numeros multiplos de 3 ");
            //listar los multiplos de 3
            for (int i = 0; i < numero.length; i++) {
                if (numero[i]%3==0){
                    System.out.println(numero[i]);
                }
        }
             System.out.println("************");
            System.out.println("suma de los numeros mayores de 10");
            
            for (int i = 0; i < numero.length; i++) {
                    if(numero[i]>10){
                        acumsuma=acumsuma+numero[i];
                    }
                }
            System.out.println(acumsuma);
    }
}
