
package Matriz;
/* crear un vector de 5 posiciones y llevar sus elementos a un 3 vector*/

public class Ejercicio1 {
    public static void main(String[] args) {
        int [] v1 = {25,60,80,100,23};
        int [] v2 = {20,10,50,40,75};
        int [] v3= new int [v1.length+v2.length];
        
        //almacenar el v1 en el  nuevo vector
        
        for (int i = 0; i < v1.length; i++) {
            v3[i]=v1[i];
        }
        
        //como almacenar el v2 en el resto de espacio del v3
        for (int i =v2.length; i < v3.length; i++) {
            v3[i]=v2[i-v2.length];
        }//como imprimir el vector
        for (int i = 0; i < v3.length; i++) {  
             System.out.println(v3[i]);
        }
    }
}
