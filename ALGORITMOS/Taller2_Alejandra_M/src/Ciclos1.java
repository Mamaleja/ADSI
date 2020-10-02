
import java.util.Scanner;

/*
Diseñe un algoritmo que lea números enteros hasta que encuentre uno que
cumpla las siguientes condiciones:
a. Múltiplo de 2
b. No múltiplo de 5
c. Mayor que 100
d. Menor que 10.000 
 */


public class Ciclos1 {
    public static void main(String[] args) {
        Scanner TB = new Scanner (System.in);
 int numero=0;
        boolean bandera=false;

        while(!bandera){
            System.out.println("Ingrese un numero: ");
            numero =TB.nextInt();
            
            if (numero%2==0 && numero%5!=0 && numero>100 && numero<10000){
                bandera=true;  
                }
                else{
                System.out.println("Ingrese un numero: ");
               numero = TB.nextInt();
            }

            }
             System.out.println("Encontrado: "+numero);
        }
                //208
}

