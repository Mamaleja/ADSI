/*
Almacene en un vector, 20 elementos de tipo entero e
imprimir:
a. La suma de los elementos que ocupan posiciones pares
b. El mayor de los elementos que ocupan posiciones
impares
c. La posición del mayor numero par
 */
package Punto5;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Punto5 {
    
public static void main(String[] args) {
        Scanner tb= new Scanner (System.in);
        int [] vector= new int [20];
        int sumPosiPares=0, mayImpar=0 , mayPar=0, posMayPar=0,sumPosiImPares=0; 
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("ingrese el numero: ");
            vector[i]=tb.nextInt();
            //se suma solo las posiciones (indice)  pares si no se sumpa posiciones impares
            if (i%2==0){
                sumPosiPares+=vector[i];
            }else{
                if(vector[i]>sumPosiPares){
                    sumPosiImPares=vector[i];
                }
            }
         //si el numero es par se va guardar y nos va a mostrar a posicion 
            if (vector[i]%2==0 && vector[i]>mayPar){
                mayPar=vector[i];
                posMayPar=i;
            }    
        }
        JOptionPane.showMessageDialog(null, "\nArray ingresado:\n"+Arrays.toString(vector));
        JOptionPane.showMessageDialog(null, "Suma de los elementos que ocupan posiciones pares:  "+sumPosiPares+"  \nArray ingresado:  "+Arrays.toString(vector));
        JOptionPane.showMessageDialog(null, "El mayor de los numeros que ocupan posiciones impares:  "+sumPosiImPares+"  \nArray ingresado:  "+Arrays.toString(vector));
        JOptionPane.showMessageDialog(null, "El mayor numero par:  "+mayPar+"\nEsta en la posicion: "+posMayPar+"  \nArray ingresado:  "+Arrays.toString(vector));
    
    }
}
