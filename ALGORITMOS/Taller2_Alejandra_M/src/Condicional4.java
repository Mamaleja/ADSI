
import java.util.Scanner;

/*
  Una frutería ofrece las manzanas con descuento según la siguiente tabla:
numero de kilos comprados/%Descuentos
0-2      0%
2.01-5   10%
5.01-10  15%
10.01   20%
 */


public class Condicional4 {
    public static void main(String[] args) {
        Scanner TB = new Scanner (System.in);
        
        double desc=0, kComp, precFinal = 0, vKilo, desTotal = 0;
      
                
        System.out.println("Ingrese la cantidad de kilos de manzanas que desea llevar: ");
        kComp = TB.nextDouble();
        System.out.println("Ingrese el valor del kilo: ");
        vKilo = TB.nextDouble();

        if(kComp>=0 && kComp<=2){
            desc = 0;
           precFinal=vKilo*kComp;
           desTotal= precFinal-(precFinal*desc);    
        }
        else if(kComp>=2.01 && kComp<=5){
            desc = 0.10;
            precFinal=vKilo*kComp;
             desTotal= precFinal-(precFinal*desc);              
        }
        else if(kComp>=5.01 && kComp<=10){
            desc = 0.15;
            precFinal=vKilo*kComp-(desc*vKilo);
        }
        else if(kComp>=10.01){
            desc = 0.20;
             precFinal=vKilo*kComp-(desc*vKilo);
        }

        System.out.println("El total de su compra es: "+desTotal+ "con un descuentos del: "+desc);
    }
}
