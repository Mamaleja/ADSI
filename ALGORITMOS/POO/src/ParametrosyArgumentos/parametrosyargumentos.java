
package ParametrosyArgumentos;

public class parametrosyargumentos {
    //variables globales
    int suma,resta,multiplicacion,division;
    //metodos para sumar de dos
    public void sumar (int numero1, int numero2){
        suma=numero1+numero2;
    }
    //metodos para resta de dos
         public void restar(int numero1, int numero2){
        resta=numero1-numero2;    
    }
         //metodos para multiplicacion de dos
        public void multiplicar (int numero1, int numero2){
        multiplicacion=numero1*numero2; 
    }
        //metodos para divicion de dos
      public void division (int numero1, int numero2){
          division=numero1/numero2;
      }  
      public void montrarResultados (){
          System.out.println("la suma es: "+suma);
          System.out.println("la resta es: "+resta);
          System.out.println("la mulriplicacion es: "+multiplicacion);
          System.out.println("la divicion es: "+ division);
      }
}   
