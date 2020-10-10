/*Calcule el promedio de las calificaciones de las materias del
trimestre, utilizando un arreglo para almacenar todas las
calificaciones y el promedio guárdelo en la siguiente posición
después de la última calificación.
 */

package punto1;
import javax.swing.JOptionPane;

public class Punto1 {
    public static void main(String[] args) {
        /*DOS VARIABLES UN INT PARA CALCULAR QUE TAN GRANDRE EN NUESTRO VECTOR
        Y LA OTRA VAR PARA ALMACENAR EL PROMEDIO
        */
        int longitud_array = 0;
        float promedio = 0;
        
        //le solicitamos al usuario cuantas notas desea ingresar (tamaño)
        longitud_array = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas notas desea ingresar?: "));
        float[] array_notas = new float[longitud_array+1];
        
        /*longitud_array+1 lo declaramos de esta manera ya que necesitamos
        una posicion para  almacenar nuestro promedio y luego en nuetro primer
        for le solicitamos al  
        usuario que ingrese las notas */
        for(int i = 0; i<longitud_array; i++){
            array_notas[i] = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota: "));
            promedio += array_notas[i];
            /* las notas se guardan en array_notas[i] y luego procedemos a guardar nuestro promedio
            promedio=promedio+array_notas[i] 
            */
        }
        array_notas[longitud_array] = promedio / longitud_array;
        //en la variable array_notas vamos a guardar nuestro promedio 
        JOptionPane.showMessageDialog(null,"El promedio de las notas es: "+array_notas[longitud_array]);
    }
}

