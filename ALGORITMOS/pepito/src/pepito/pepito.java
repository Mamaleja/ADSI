
package pepito;

import java.util.Scanner;

public class pepito {

    
    
    public static void main(String[] args) {
        //aqui declaramos el scaner para recibir cosas por teclado
        Scanner sc= new Scanner(System.in);
        //aqui declaramos las variables
        int resp2;
        
        //aqui mostramos un mensaje en pantalla (escriba)
        // atajo (sout) y tabulador
        System.out.println("MM");
        
        
        System.out.println(" 1 SI ---  2 NO");
        /*aqui leemos lo que nos ingresa por el teclado y lo guardamos en la
         variable ya declarada arriba*/
        resp2= sc.nextInt();
             
        /*Este es el condicion SI-SINO en codigo JAVA recuerda 
        dentro de los parentesis va la condicion a cumplirse 
        y en las llaves {} va lo que se hara si se cumple*/
               if(resp2==1){
                   System.out.println("NN");
               } else{
                   System.out.println("XX");
               }
        
        
        
        
        
    }
   
}
