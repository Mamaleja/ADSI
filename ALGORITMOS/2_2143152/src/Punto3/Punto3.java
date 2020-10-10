/*Almacenar los elementos de una matriz de 4 x 4 (números
enteros positivos). Imprimir la fila que contiene el número
menor y la columna que tenga el número mayor.
 */

package punto3;
import javax.swing.*;
import java.util.Arrays;

public class Punto3 {
    public static void main(String[] args) {
    /*Creamos variables auxiliares, las encargadas de manejar el menor y el mayor 
    numero. Ademas, la variable encargada
    de guardar el indice de la columna que contiene el mayor numero*/
    int mayor = 0, menor = 1000000000, colmayor = 0;

    /*creamos dos arrays para guardar la fila y la columna entera que 
    contengan el numero menor y el numero mayor respectivamente*/
    int[] filamenor = new int[4], columnamayor = new int[4];

    //Matriz 4x4 para guardar los numeros del usuario
    int[][] matriz = new int[4][4];

    //Ciclos for para guardar los datos en la matriz
    for(int i = 0; i<matriz.length; i++){
        for(int j = 0; j<matriz.length;j++){
            matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la columna"+(j+1)+
                    " y la fila "+(i+1)));

            /*Comprobamos si el numero ingresado en la matriz es mayor que la variable 
              que contiene el numero mayor en caso de ser verdad, se guarda ese
                numero en la variable mayor*/
            if(matriz[i][j]>mayor){
                mayor = matriz[i][j];
                colmayor = j;
            }
            /*Comprobamos si el numero ingresado en la matriz es menor que la variable que contiene el numero menor,
            en caso de ser verdad, se guarda ese numero en la variable menor. Ademas, con las filas tenemos la
             facilidad de guardar una fila entera sin necesidad de algun ciclo.*/
            if(matriz[i][j]<menor){
                menor = matriz[i][j];
                filamenor = matriz[i];
            }
        }
    }

    /*Rellenamos el vector de columnamayor, la k recorre las filas y colmayor es la columa que tiene el numero mayor,
     colmayor siempre debe ser igual, ya que vamos a guardar los datos de la misma columna, pero la fila va cambiando*/
    for(int k = 0; k<4; k++) columnamayor[k] = matriz[k][colmayor];

    /*Imprimimos la matriz bonita, el "\t" simboliza un tab del teclado, deja el espacio, lo que hacemos es concatenar
    los numeros de la matriz, con espacios para que quede mas organizada y se vea mas bonita. Esta parte del codigo no
   cambia nada del programa si lo quitamos, solo es para imprimir la matriz y que se vea mas elegante.*/
    System.out.println("Imprimiendo la matriz completa: ");
    String str = "\t";
    for(int i=0;i<4;i++){
        for(int j=0;j<4;j++) str += matriz[i][j] + "\t";
        System.out.println(str);
        str = "\t";
    }

    //Imprimimos la columna con el numero mayor y la fila con el numero menor
    System.out.println("\nLa fila que tiene el menor numero es la fila: \n"+ (Arrays.toString(filamenor)) +
            "\nEl menor numero es: "+menor+"\n");
    System.out.println("La columna que tiene el mayor numero es la columna: \n"+ (Arrays.toString(columnamayor)) +
            "\nEl mayor numero es: "+mayor);
    }
}
