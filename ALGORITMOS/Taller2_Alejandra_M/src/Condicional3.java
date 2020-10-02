
import java.util.Scanner;

/*En una empresa cada empleado debe teclear un código identificador de 3 cifras en
la entrada. Diseñe un algoritmo que muestre por pantalla la categoría del
empleado teniendo en cuenta que:
• Si el código es divisible por 2, por 3 y por 5, la categoría del empleado es
“director general”.
• Si el código es divisible por 3 y por 5 pero no por 2, la categoría del
empleado es “Directivo”.
• Si el código es divisible por 2, pero no por 3 ni por 5, la categoría del
empleado es “Personal”.
• Si el código no es divisible por 2, ni por 3 ni por 5, la categoría del
empleado es “Seguridad”. 
 */
//150--DIRECTOR GENERAL,137--SEGURIDAD 662--PERSONAL DIRECTIVO--135

public class Condicional3 {
    public static void main(String[] args) {
        Scanner TB = new Scanner (System.in);
     int codigo;
        String categoria;

        System.out.println("Ingrese Su Codigo: ");
        codigo = TB.nextInt();

        if(codigo%2==0 && codigo%3==0 && codigo%5==0){
            categoria = "DIRECTOR GENERAL";
        }
        else if(codigo%3==0 && codigo%5==0 && codigo%2!=0){
            categoria = "DIRECTIVO";
        }
        else if(codigo%3!=0 && codigo%5!=0 && codigo%2==0){
            categoria = "PERSONAL";
        }
        else{
            categoria = "SEGURIDAD";
        }

        System.out.println("Su cargo en la empresa es: " + categoria);
        
    }
}

 

