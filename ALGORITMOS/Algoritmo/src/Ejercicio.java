
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ejercicio {
    public static void main(String[] args) {
        int n1, suma, n2;
        n1=0;
        n2=0;
        suma=0;
          //System.out.println("el resultadoo es el valor de:  "+suma);  
          //JOptionPane.showMessageDialog(null,"el resultado de la suma es: "+suma);
        // System.out.println("porfavor ingrese dos numeros");
         Scanner leer= new Scanner(System.in);
          n1=leer.nextInt();
          n2=leer.nextInt();
          suma=n1+n2;
          System.out.println("la suma es:  " +suma);
          
    }
}

