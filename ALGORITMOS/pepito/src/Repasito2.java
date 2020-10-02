
import javax.swing.JOptionPane;


public class Repasito2 {
    
    
    public static void main(String[] args) {
       /* String nombre="Alejandra";
        
        System.out.println("Bienvenida: "+nombre);
    }*/
       String nombre=JOptionPane.showInputDialog("Introduce tu nombre");
           JOptionPane.showInputDialog("Bienvenido: "+nombre);
    }
}