
package Matriz;


public class Ejercicio2 {
    public static void main(String[] args) {
            int vector[]={20,60,79,90};
            int vecAux[]= new int [vector.length];
            int x=0;// es para la poaicion del vector aux
            
            for (int i = vector.length-1; i >=0; i--) {
            vecAux[x]=vector[i];
                System.out.println(vecAux[x]);
                x++;
        }
    }
}
