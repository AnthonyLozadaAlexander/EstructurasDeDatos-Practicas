package Logica;
import java.util.Scanner;

public class EjercicioCalificaciones {
    private double[] IngresarCalificaciones(double[] notasF){
        Scanner input = new Scanner(System.in);
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
        System.out.println("-----Notas Ingresadas Correctamente----");
        System.out.println("---------------------------------------");
        return notasF;
    }

    private double calcularPromedioCurso(double[] notasF){
        double suma = 0;
        for (int i = 0; i < notasF.length; i++) {
            suma = suma + notasF[i];
        }
        double promedio = suma / notasF.length;
        return promedio;
    }
    public void main(String[] args) {
        double[] notasF = new double[5];
        System.out.println("---------------------------------------");
        System.out.println("Bienvenido Al Sistema De Calificaciones");
        IngresarCalificaciones(notasF);
        System.out.println("---------------------------------------");
        double promedio = calcularPromedioCurso(notasF);
        System.out.println("El Promedio Del Curso Es: " + String.format("%.2f", promedio));
        if(promedio >= 7){
            System.out.println("El Promedio Del Curso Es Bueno");
        }else{
            System.out.println("El Promedio Del Curso Es Malo, Necesitan Mejorar");
        }
        System.out.println("---------------------------------------");

    }



}
