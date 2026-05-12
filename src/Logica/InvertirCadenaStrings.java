package Logica;

import java.util.Scanner;

public class InvertirCadenaStrings {
    public static void main(String[] args) {
        long start = System.nanoTime();
        Scanner input = new Scanner(System.in);
        String texto = "", invertido = "";
        System.out.println("-------------Bienvenido------------");
        System.out.print("Ingrese El Texto a Invertir: ");
        texto = input.nextLine();
        System.out.println("-----------------------------------");
        invertido = invertirCadena(texto);
        System.out.println("Cadena Original: " + texto);
        System.out.println("Cadena Invertida: " + invertido);
        System.out.println("-----------------------------------");
        long end = System.nanoTime();
        System.out.println("Tiempo Ejecucion Total: " + (end - start) + " nanosegundos");
    }
    public static String invertirCadena(String original){
        char[] arr = original.toCharArray(); // convierte el String en un array de char
        int izq = 0; // puntero izquierda
        int der = arr.length - 1; // puntero derecha
        while(izq < der){
            // intercambios y acercar los punteros al centro
            char temporal = arr[izq];
            arr[izq] = arr[der];
            arr[der] = temporal;
            izq = izq + 1;
            der = der - 1;
        }
        return new String(arr);
    }
}
