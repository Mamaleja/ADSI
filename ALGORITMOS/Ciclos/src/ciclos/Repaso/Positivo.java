/*
ingrese 10 numeros, diga si cada numero ingresado es positivo o negativo,
cuente promedio y sume los negativos y los positivos 
 */
package ciclos.Repaso;

import java.util.Scanner;


public class Positivo {
       public static void main(String[] args) {
        
     Scanner TB = new Scanner (System.in);
     int numero = 0,contPosi=0, contNega=0;
     double acunposi=0,acunNega=0,promPosi, promeNega;
     
        for (int i = 1; i <= 10; i++){
           if(numero>0){
                contPosi=contPosi+1;
               acunposi=acunposi+numero;
                System.out.println("es positivo");
            }else{
                contNega=contNega+1;
                acunNega=acunNega+numero;
                System.out.println("es negativo");
            }
        }
        promPosi=acunposi/contPosi;
        promeNega=acunNega/contNega;
           System.out.println("numero de positivos: "+contPosi);
           System.out.println("numero de negativos: "+contNega);
           System.out.println("la suma de los positivos: "+acunposi);
           System.out.println("la suma de los negativo: "+acunNega);
           System.out.println("la suma del promedio de los positivos es: "+promPosi);
           System.out.println("la suma del promedio de los negativos es: "+promeNega);
}
}