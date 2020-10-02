
import java.util.Scanner;


public class Repasito {
  
    public static void main(String[] args) {
        
        Scanner tb =new Scanner (System.in);
        //declaracion de variables
        int num1=6;
        int num2=12;
        
        //hacemos la comprobacion 
        if (num1>=num2){
            //if anidado
            if (num1==num2){
                System.out.println("los numeros: "+num1+ " y "+num2+ " son iguales");
            }else {
                System.out.println("el numero: "+num1+ " es mayor que el numero: "+num2);
            }
        }else {
            System.out.println("el numero: "+num2+ " es mayor que el numero: "+num1);
        }
    }
}
