

package ejercicios;

import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner tb =new Scanner (System.in);
        //COMO CREAR UN VECTOR PARA ALMACENAR NOMBRES
        String[] nombre= new String[5];
        
        //ingresar los nombres al vector
        
        for (int i = 0; i <nombre.length; i++) {
            System.out.println("ingrese nombre:  ");
            nombre[i]=tb.next();
        }
        //imprimir los nombres
        System.out.println("*****************");
        System.out.println("lista de los nombres del vector");
        
        for (int i = 0; i < nombre.length; i++) {
            System.out.println(nombre[i] +" en la posicion: "+i);
        }
    }
}
