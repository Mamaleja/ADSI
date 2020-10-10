/*Crear un vector de 10 números ingresados por el usuario, leer un
valor y lo inserte en el lugar que le corresponda, de tal manera
que el arreglo conserve su ordenamiento e imprima el vector.
 */

package punto2;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class Punto2 {
    public static void main(String[] args) {
    int[] arrnums = new int[11];
    /*declaramos nuestro vector en 11 
    posiciones ya que en la ultima posicion guardaremos nuestro vector numero adicional*/
    
    for(int i = 0; i<10; i++){
        arrnums[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
    }/*solicitamos que ingresen los numeros (los primeros 10) y luego solicitamos uno mas*/
    
    arrnums[10] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero adicional: "));
    Arrays.sort(arrnums); //importamos una libreria de java para mostras nuestro vector en orden 
     JOptionPane.showMessageDialog(null, Arrays.toString(arrnums));
     //y lo impromimos
    }
}