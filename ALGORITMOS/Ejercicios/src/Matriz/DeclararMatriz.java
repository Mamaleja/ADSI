
package Matriz;

import java.util.Scanner;

public class DeclararMatriz {
    public static void main(String[] args) {
         Scanner tb =new Scanner (System.in);
         //crear una matriz de 3 x 2
         
         int [] [] matriz= new int [3][2];
         
         // llenar matriz
         
         matriz[0][0]=6;
         matriz[0][1]=12;
         
         matriz[1][0]=16;
         matriz[1][1]=20;
         
         matriz[2][0]=50;
         matriz[2][1]=30;
         
         //System.out.println(matriz [1][1]);
         
         //crear matriz y llenarla en la misma fila
         
         int [][] matriz1= {{20,50},{30,12},{60,80}};
         double suma = 0;
         // tamaño de la fila
         System.out.println("tamaño de la fila: ");
         System.out.println(matriz1.length);
         
         System.out.println("***************");
         
         //tamaño de la columna       
         System.out.println("tamaño de la columna: ");
         System.out.println(matriz1[0].length);
         
         //recorrer la matriz
         //este primer siclo controla la fila
         for (int i = 0; i < matriz1.length; i++) { 
              System.out.println("");
             for (int j = 0; j < matriz1[i].length; j++) //columnas 
             {
                 System.out.print(matriz[i][j] +  "  ");  
                 suma=suma+matriz1[i][j];
             }     
             System.out.println("");
             System.out.println("la suma  de la matriz es:  "+suma);
        }
            
            System.out.println("");
            System.out.println("");
            //listar la primera fila
            
            System.out.println("listar la primera fila: ");
                for (int i = 0; i < matriz1[0].length; i++) {
                    System.out.println(matriz1[0][i]);
        }
                System.out.println("");
              //como listar  la primera columna 
              System.out.println("listar la primera columna: ");
                for (int i = 0; i < matriz1.length; i++) {
                    System.out.println(matriz1[i][0]);
        }
                
                /*1. listar el resto de filas 
                  2. listar el resto de columnas 
                  3. sumar la primera fila
                  4. sumar la primera columna
                -------------------------------
                1.llenar una matriz de 4x4
                2.listar diagonal 
                3. sumar diagonal
                */
                
    }
}
