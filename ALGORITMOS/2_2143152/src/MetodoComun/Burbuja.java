
package MetodoComun;

public class Burbuja {
    
    public int[] sort(int[] array){
        int aux = 0;
        for(int k = 0; k<array.length; k++){
            for(int x = 0; x< array.length-k-1; x++){
                if(array[x+1]<array[x]){
                    aux = array[x+1];
                    array[x+1] = array[x];
                    array[x] = aux;
                }
            }
        }
        return array;
    }
}
