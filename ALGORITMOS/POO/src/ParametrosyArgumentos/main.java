
package ParametrosyArgumentos;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner tb= new Scanner(System.in);
        parametrosyargumentos objeto= new parametrosyargumentos();
        int n1,n2;
        System.out.println("Ingresar el primer numero: ");
        n1= tb.nextInt();
        
        System.out.println("Ingresar el segundo numero: ");
        n2= tb.nextInt();
        
        //invocar numeros
        objeto.sumar(n1, n2);
        objeto.restar(n1, n2);
        objeto.multiplicar(n1, n2);
        objeto.division(n1, n2);
        objeto.montrarResultados(); 
        
    }
}
