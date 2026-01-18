package Logica;
import java.util.Scanner;

public class EjercicioCalificaciones {
    private void IngresarCalificaciones(){
        Scanner input = new Scanner(System.in);
        double[] notasF = new double[5];
        int e = 0;
        System.out.println("---------------------------------------");
        System.out.println("Ingrese Las 5 Calificaciones Finales");
        for (int i = 0; i < notasF.length; i++) {
            System.out.print("Ingrese Nota["+i+"]: ");
            notasF[i] = input.hasNextDouble() ? input.nextDouble() : (e = 1) ;
            if(notasF[i] < 0 || notasF[i] > 10){
                System.out.println("Error: La Nota Debe Estar Entre 0 y 10");
                i--;
            }else{
                if(e == 1) {
                    e = 0;
                    System.out.println("Error: Valor Invalido, Ingrese Un Numero");
                    i--;
                    input.next();
                }
            }
        }
        System.out.println("Notas Ingresadas Correctamente");
        System.out.println("---------------------------------------");

    }
    public void main(String[] args) {
        System.out.println("---------------------------------------");
        System.out.println("Bienvenido Al Sistema De Calificaciones");
        IngresarCalificaciones();

    }



}
