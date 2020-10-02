/*
ingrese N de nombres y edad de personas 
diga cual es mayor y a quien pertenece
 */
package ciclos.Repaso;

import java.util.Scanner;


public class EdadMayor {
    public static void main(String[] args) {
         Scanner TB = new Scanner (System.in);
         int n,edad, auxEdadMayor=0;
         String nombre, auxNombre="";
         
         System.out.println("ingrese el numero de individuos: ");
         n=TB.nextInt();
         for (int i = 1; i <= n; i++){
             System.out.println("ingrese nombre: ");
             nombre=TB.next();
             System.out.println("ingrese la edad: ");
             edad=TB.nextInt();
             
             if (edad>auxEdadMayor){
                 auxEdadMayor=edad;
                 auxNombre=nombre;
             }
         }
         System.out.println("Datos persona mayor");
         System.out.println("Nombre: " + auxNombre +"Edad: " +auxEdadMayor);
    }
}
