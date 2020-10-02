
import java.util.Scanner;

/*
Ingrese un numero diga si es o no par
 */


public class Condicional5 {
    public static void main(String[] args) {
        Scanner TB = new Scanner (System.in);
        
          double num;

        System.out.println("Ingrese Un Numero: ");
        num = TB.nextDouble();

        if(num%2!=0){
            System.out.println("El numero que ingreso es impar");
        }
        else{
            System.out.println("El numero que ingreso es par");
        }
    }
}

    

