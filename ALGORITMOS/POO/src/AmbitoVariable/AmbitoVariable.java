
package AmbitoVariable;


public class AmbitoVariable {
    //variables globales
    static int variableStatica;//variable estatica no requiere instanciar
    int variableGlobal;
    
    //metodo vacio sin parametros 
    public void metodo1(){
        //variable local
        int variableLocal=10;
        System.out.println(variableLocal);
    }
    public void metodo2(){
        System.out.println(variableStatica);
        System.out.println(variableGlobal);
    }
    public static void main(String[] args) {
        AmbitoVariable Obj= new AmbitoVariable();
        Obj.variableGlobal=9;
        
        
                
    }
}
