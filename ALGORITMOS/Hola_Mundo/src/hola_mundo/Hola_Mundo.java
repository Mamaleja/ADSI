/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola_mundo;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Hola_Mundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Scanner sc= new Scanner(System.in);
  int resp1;
        System.out.println("M");
        System.out.println(" 1 SI ----  2 NO");
        resp1=sc.nextInt();
     /*la variable la hacemos = a lo que acaba de recibir por teclado 
     o mejordicho el Scaner(sc) y siguiente a esto buscamos el metodo para 
        que lea el TIPO de variable que declaramos nextInt()*/
        
      if(resp1==1){
          System.out.println("O");
      }else  {
          System.out.println("E");
      }
          
          
        }
}
    
    

