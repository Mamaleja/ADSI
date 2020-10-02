
package Vectores;
/*vector estructura    de datos unidimensional
    almacena datos del mismo tipo*/

public class DeclaracionVectores {

   
    public static void main(String[] args) {
      //declarar vector
      int numero1[];
      
      //crear tamaño al vector
         numero1= new int [4];
      
         //declarar vector y tamaño en la misma linea
         int numero2[]= new int [4];
      
       //llenar el vector
       numero2[0]=1;
       numero2[1]=58;
       numero2[2]=60;
       numero2[3]=87;
       
       //imprima el vector
        System.out.println(" el vector en la posicion 1: "+numero2[1]);
       
       // recorrer el vector
        System.out.println("*******************");
        System.out.println("Recorrido del vector");
        for (int i = 0; i < 4; i++) {
            System.out.println(numero2[i]); 
        }
         //declarar otro vector y llenarlo en la misma linea
         
         int[] numero3={20,80,50,60};
         //recorridos del vector3
         System.out.println("*******************");
        System.out.println("Recorrido del vector numero 3");
        // length:  tamaño del vector
        for (int i = 0; i < numero3.length; i++) {
            System.out.println(numero3[i]);
        }
        //en otro vector .crear un vector que contenga los numeros del 1 al 100
          System.out.println("*******************");
        System.out.println("vector numeros del 1 al 100");
        //declaracion y creacion del vector tamaño 100
        int[] numero4=new int[100];
        for (int i = 0; i < numero4.length; i++) {
            numero4[i]=i+1;
            System.out.println(numero4[i]);
        }
        //sumar y promediar el vector numero 4
        
          System.out.println("*******************");
           System.out.println("suma y promedio del vector 4");
           double suma=0,promedio;
           for (int i = 0; i <numero4.length; i++) {
               numero4[i]=i+1;
               suma=suma+numero4[i];//calculo de la suma
           }
           promedio=suma/numero4.length;//promedo de la suma
           
           System.out.println(" la suma del vector numero 4 es: "+suma);
           System.out.println("el promedio del vector 4 es: "+promedio);
    }
    
}
