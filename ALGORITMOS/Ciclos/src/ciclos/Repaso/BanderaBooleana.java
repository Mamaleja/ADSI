/*
ingrese numeros, esl ciclo se cierra cuando ingrese numeros entre 0 y 10
 */
package ciclos.Repaso;

import java.util.Scanner;


public class BanderaBooleana {
    public static void main(String[] args) {
        Scanner TB = new Scanner (System.in);
        
        int numero;
        boolean sw=true;//variable bandera
        
       /* while(!sw){
            System.out.println("ingrese el numero: ");
            numero=TB.nextInt();
            sw=!(numero>=0 && numero<=10);

        }*/
       while (sw){
            System.out.println("ingrese el numero: ");
            numero=TB.nextInt();
            if (numero>=0 && numero<=10){
                sw=false;
            }
       }
    }
}
       
        
