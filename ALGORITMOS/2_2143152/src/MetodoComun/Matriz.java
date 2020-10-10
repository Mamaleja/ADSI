
package MetodoComun;

public class Matriz {
    public void print(int[][] matriz){
        String str = "\t";
        for(int i=0;i< matriz.length;i++){
            for(int j=0;j< matriz.length;j++) str += matriz[i][j] + "\t";
            System.out.println(str);
            str = "\t";
        }
    }
}

