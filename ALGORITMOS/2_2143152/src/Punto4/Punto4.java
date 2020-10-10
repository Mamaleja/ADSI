/*
Crear una matriz de 5 x 5, ordenarla por filas de menor a
mayor. Mostrar la matriz.
 */
package Punto4;

import MetodoComun.Burbuja;
import javax.swing.JOptionPane;

public class Punto4 {

    public static void main(String[] args) {
        Burbuja bubble= new  Burbuja();
        /*importamos y declaramos como obj una clase que es donde tenemos nuestro 
        arreglo de burbuja para ordenar la matriz*/
        
        /*declaramos nuestra matriz*/
        int[][] matriz = new int[5][5];
        
        /* en el primer for vamos a llenar nuestra matriz
        solicitandole a usuario que ingrese los numeros*/

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
            }
        }
        //vamos a imprimir nuestra matriz 
        System.out.println("\nImprimiendo la matriz inicial de 5 x 5 ");
        String str = "\t";
        for(int i=0;i< matriz.length;i++){
            for(int j=0;j< matriz.length;j++) str += matriz[i][j] + "\t";
            System.out.println(str);
            str = "\t";
        }
          // Ordenar las filas, de menor a mayor importando una clase 
        for(int i = 0; i<matriz.length; i++){
            matriz[i] = bubble.sort(matriz[i]);
        }
        
        
        System.out.println("\nImprimiendo la matriz organizada de 5 x 5 ");
        for(int i=0;i< matriz.length;i++){
            for(int j=0;j< matriz.length;j++) str += matriz[i][j] + "\t";
            System.out.println(str);
            str = "\t";
        }
    }
}
    

