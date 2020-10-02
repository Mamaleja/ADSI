/*

 */
package ModificadorPrivado;

public class Privado {
    private void mostrar(){
        System.out.println("modificador privado");
    }
      public static void main(String[] args) {
            Privado Obj = new Privado();
            Obj.mostrar();
      }
      
}
