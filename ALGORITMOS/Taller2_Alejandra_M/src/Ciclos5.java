
import java.util.Scanner;

/*
 Diseñe un algoritmo que lea los nombres y las notas de n estudiantes y muestre:
a) La cantidad de estudiantes ganaron.
b) El porcentaje de estudiantes que perdieron.
c) El nombre del estudiante con la nota más alta.
d) La nota más alta.
e) La nota más baja.
f) La nota promedio de los estudiantes que ganaron.
g) ¿Cuántos estudiantes obtuvieron la nota más alta?
h) ¿Cuáles estudiantes obtuvieron la nota más alta, nota más alta 5?
 */


public class Ciclos5 {
    public static void main(String[] args) {
        Scanner TB = new Scanner (System.in);
        String nombreAux, nombreAlto = "", cond;
        int cantEstudiantes = 0, cantEstudPerdidos = 0,cantEstudGanados = 0, cantEstudNalta = 0;
        double notaBaja = 5.0,  notaAlta = 0, notaProm, sumaGanados = 0, notaAux;
        double porcPerdieron;
        
        System.out.println("¿Desea ingresar una nueva nota? (S/N): ");
        cond = TB.next();

        while ((cond.toLowerCase()).equals("s")){
            System.out.println("Ingrese el nombre del estudiante");
            nombreAux = TB.next();
            System.out.println("Ingrese la nota del estudiante");
            notaAux = TB.nextDouble();

            // 
            if(notaAux>=3.0){
                cantEstudGanados++;
                sumaGanados = sumaGanados + notaAux;
            }
            else if(notaAux<3.0){
                cantEstudPerdidos++;
            }
            //
            if(notaAux<=notaBaja){
                notaBaja = notaAux;
            }
            if(notaAux>notaAlta) {
                notaAlta = notaAux;
                cantEstudNalta=1;
                nombreAlto =  nombreAux;
            }
            else if(notaAux==notaAlta){
                nombreAlto = nombreAlto+","+nombreAux;
                cantEstudNalta++;
            }
            System.out.println("¿Desea ingresar una nueva nota? (S/N): ");
            cond = TB.next();
        }

        cantEstudiantes = cantEstudGanados + cantEstudPerdidos;
        porcPerdieron = (cantEstudPerdidos*100)/cantEstudiantes;
       	notaProm = sumaGanados/cantEstudGanados;

        System.out.println("Cantidad de estudiantes que ganaron: "+cantEstudGanados);
        System.out.println("Porcentaje de estudiantes que perdieron: "+porcPerdieron+"%");
        System.out.println("Nota mas baja: "+notaBaja);
        System.out.println("Nota mas alta: "+notaAlta);
        System.out.println("Promedio de los estudiantes que ganaron: "+notaProm);
        System.out.println("Cantidad de estudiantes que tuvieron la nota mas alta: "+cantEstudNalta);
        System.out.println("Nombre de los estudiantes con la nota mas alta: ("+notaAlta+")"+nombreAlto);
    }
}
