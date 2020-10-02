
package punto2;

import java.util.Scanner;


public class Area {
    public static void main(String[] args) {
         Scanner tb= new Scanner(System.in);
        Triangulo obj = new Triangulo ();
           
            double base, altura;
            
            System.out.println(" ingrese la base del triangulo: ");
            base=tb.nextDouble();
            System.out.println("ingrese la altura del triangulo: ");
            altura=tb.nextDouble();
       
           double area=obj.area(altura, base);
           obj.resultado(area);
    }
}
