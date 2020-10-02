

public class Gestion {
    public static void main(String[] args) {
        //declaracion de objetos
        Computador pc1;
        pc1= new Computador ();
        Computador pc2 = new Computador();
    
        
        System.out.println("marca: " + pc1.getMarca());
        System.out.println("precio: " + pc1.getPrecio());
        System.out.println("ram: " + pc1.getRam());
        System.out.println("fecha: " + pc1.getFecha());
        
        System.out.println("marca: " + pc2.getMarca());
        System.out.println("precio: " + pc2.getPrecio());
        System.out.println("ram: " + pc2.getRam());
        System.out.println("fecha: " + pc2.getFecha());
        
    }
         
}
