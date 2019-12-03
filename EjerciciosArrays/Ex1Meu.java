/*
 * Programa que lea por teclado 10 números enteros y los guarde en un array.
 * A continuación calcula y muestra la media de los valores positivos y la  de los valores negativos.
 */
package EjerciciosArrays;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex1Meu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] my_array = new int[5];
        int n, neg = 0, pos = 0;
        double  mediapos = 0, medianeg = 0;
        
        for (int i=0; i<my_array.length; i++){
            System.out.println("Introduce " + (my_array.length) + " numeros:");
            my_array[i] = sc.nextInt();
            if (my_array[i]<0){
                neg += my_array[i];
            }else{
            pos += my_array[i];
        } 
        }
        
        
        System.out.print("La suma de los positivos son: " + pos + " y la media: " + mediapos);
        System.out.println("");
        System.out.print("La suma de los negativos son: " + neg + " y la media: " + medianeg);
        System.out.println("");
    }
}
