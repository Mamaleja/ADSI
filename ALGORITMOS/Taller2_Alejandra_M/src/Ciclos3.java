
import java.util.Scanner;

/*
Escriba un algoritmo que lea n números reales y muestre el número que es menor
y el número que es mayor
 */


public class Ciclos3 {
    public static void main(String[] args) {
        Scanner TB = new Scanner (System.in);
        
      int numero, mayor = 0, menor = 10000 , cant;
 
        System.out.println("Cantidad de numeros: ");
        cant = TB.nextInt();

        for(int i = 1; i<=cant; i++){
            System.out.println(i+" : ");
            numero = TB.nextInt();

            if(numero>mayor){
                mayor = numero;
            }
            else if(numero<menor){
                menor =numero;
            }
        }

        System.out.println("El numero mayor es: "+mayor);
        System.out.println("El numero menor es: "+menor);
    }
}