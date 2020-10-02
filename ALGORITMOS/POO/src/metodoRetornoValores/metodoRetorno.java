
package metodoRetornoValores;


public class metodoRetorno {
    public int  sumar (int numero1, int numero2){
        int suma = numero1+numero2;
        return suma;
        }
    public int restar (int numero1, int numero2){
        int resta= numero1-numero2;
        return resta;
          }
 public int multiplicacion(int numero1, int numero2){
        int multiplicacion= numero1*numero2;
        return multiplicacion;
          }
    public int duvicion (int numero1, int numero2){
        int division=numero1/numero2;
        return division;
        }
    public void montrarResultado(int suma, int resta, int multiplicacion, int division){
        System.out.println("la suma es: "+suma);
        System.out.println("la resta es: "+resta);
        System.out.println("la multiplicacion es: "+multiplicacion);
        System.out.println("la division es: "+division);
    }
    }