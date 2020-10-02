
package metodoRetornoValores;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
         Scanner tb= new Scanner(System.in);
         metodoRetorno objeto = new metodoRetorno();
         int n1,n2;
       
         System.out.println("ingrese el primer numero: ");
         n1=tb.nextInt();
         
         System.out.println("ingrese el segundo numero: ");
         n2=tb.nextInt();
         
        /* creando variables que almacenen los contenidos   
        int sum=objeto.sumar(n1, n2);
         int res=objeto.restar(n1, n2);
         int mul=objeto.multiplicacion(n1, n2);
         int div=objeto.duvicion(n1, n2);
         objeto.montrarResultado(sum, res, mul, div); */
        
        //segunda forma no requiere de mostrar resultado
        
        System.out.println("la suma es: "+objeto.sumar(n1, n2));
        System.out.println("la resta es : "+objeto.restar(n1, n2));
        System.out.println("la division es: "+objeto.duvicion(n1, n2));
        System.out.println("la multiplicacion es: "+objeto.multiplicacion(n1, n2));
        
    }
}
