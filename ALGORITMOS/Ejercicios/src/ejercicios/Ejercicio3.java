
package ejercicios;
/* pasar el contenido de otro vector entero a otro vector*/

import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
         Scanner tb =new Scanner (System.in);
         
         int vectorViejo[]={30,90,70};
         
 /* declarar al otro vector  donde van a quedar los elementos del vector anterior
 con el tamaño viejo*/
        int  vectorNuevo[]= new int[vectorViejo.length];
        
         // pasar el vector viejo al nuevo
         for (int i = 0; i < vectorViejo.length; i++) {
            vectorNuevo[i]=vectorViejo[i];
        }
         // imprir el vector nuevo
         System.out.println("*********");
         System.out.println(" se lista el vector nuevo");
         for (int i = 0; i < vectorNuevo.length; i++) {
             System.out.println(vectorNuevo[i]);
        }
    } 
}
