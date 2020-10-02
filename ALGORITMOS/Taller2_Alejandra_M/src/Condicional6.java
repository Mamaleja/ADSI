
import java.util.Scanner;

/*
Diga si un numero ingresado por el usuario es divisible por 3
 */


public class Condicional6 {
    public static void main(String[] args) {
        Scanner TB= new Scanner (System.in);
        
          double num;

        System.out.println("Ingrese Un Numero: ");
        num = TB.nextDouble();

        if(num%3!=0){
            System.out.println("El numero no es divisible por 3");
        } else{
            System.out.println("El numero es divisible por 3");
        }
    }
}

    
