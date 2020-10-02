
import java.util.Scanner;

/*
En una tienda de descuento se efectúa una promoción en la cual se hace un
descuento sobre el valor de la compra total según el color de la bolita que el
cliente saque al pagar en la caja. Si la bolita es de color blanco no se le hará
descuento alguno, si es verde se le hará un 10% de descuento, si es amarilla un
25%, si es azul un 50% y si es roja un 100%. Determinar la cantidad final que el
cliente deberá pagar por su compra se sabe que solo hay bolitas de los colores
mencionados.
 */
public class Condicional1 {

    public static void main(String[] args) {
        Scanner BT = new Scanner(System.in);
        int Blanco =1, verde =2, Amarillo = 3, Azul = 4, Rojo = 5;
        double totalPagar, totalDescuento;
        int bolita;
        System.out.println("ingrese el total de la compra: ");
        totalPagar = BT.nextDouble();
        System.out.println("Ingrese el color de una Bolita: ");
        System.out.println("Blanco=1----verde=2");
        System.out.println("Amarillo=3----Azul=4");
        System.out.println("Rojo=5");
        bolita = BT.nextInt();

        if (bolita == Blanco) {
            System.out.println("usted no tiene ningun descuento" + totalPagar);
        } else if (bolita == verde) {
            totalDescuento = totalPagar - (totalPagar * 0.10);
            System.out.println("tienes un descuento del 10 porciento: " + totalDescuento);
        } else if (bolita == Amarillo) {
            totalDescuento = totalPagar - (totalPagar * 0.25);
            System.out.println("tienes un descuento del 20 porciento: " + totalDescuento);
        } else if (bolita == Azul) {
            totalDescuento = totalPagar - (totalPagar * 0.50);
            System.out.println("tienes un descuento del 50 porciento: " + totalDescuento);
        }
        else if(bolita==Rojo){
            totalDescuento = totalPagar - (totalPagar *100);
            System.out.println("tienes un descuento del 100 porciento: " + totalDescuento);
        }
    }

}
