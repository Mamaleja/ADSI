
import java.util.Scanner;

/*
Ingresa números del 1 al 100, hasta encontrar algún número mayor que 10
 */


public class Ciclos4 {
    public static void main(String[] args) {
        Scanner TB = new Scanner (System.in);
        
        int num = 0;
        
       System.out.println("Ingrese un numero: ");
       num = TB.nextInt();

        while(num>0 && num<=10){
            System.out.println("Ingrese un numero: ");
            num = TB.nextInt();
        }
        System.out.println("El numero es mayor que 10");
    }
}



