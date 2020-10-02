/*
MUESTRA LA TABLA DE MULTIPLICAR
 */
package ciclos.Repaso;

import java.util.Scanner;
  
public class TablaDeMultiplicar {
    public static void main(String[] args) {
         Scanner TB = new Scanner (System.in);
             int numero,mul;
        System.out.println("ingrese el numero: ");
        numero=TB.nextInt();
        
        for(int i=1; i<=10; i++){
            mul=i*numero;
            System.out.println(i + " X "+numero+" = "+mul);
        }
    }
  
   
   
}
