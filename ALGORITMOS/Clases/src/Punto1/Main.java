
package Punto1;

import java.util.Scanner;


public class Main {
         public static void main(String[] args) {

            Scanner tb= new Scanner(System.in);
            Punto1 obj= new Punto1 ();
            String Nombre;
            int edadMay;
            
             System.out.println("ingrese nombre : ");
                 Nombre=tb.next();
             System.out.println("ingrese edad: ");  
                edadMay=tb.nextInt();
            
                if (edadMay>18){
                    obj.mostrarResultado(Nombre, edadMay);
                    System.out.println("la persona es mayor de edad");
                    
                }else{obj.mostrarResultado(Nombre, edadMay);
                    
                }

             
    }
}
