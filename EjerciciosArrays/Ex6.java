/*
Programa Java que llene un array con 10 números enteros que se leen por teclado.
A continuación calcula y muestra la media de los valores positivos y la de los valores negativos del array.
 */
package EjerciciosArrays;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = new int[5];
        int neg = 0, pos = 0, sumapos = 0, sumaneg = 0;
        
        for (int i = 0; i<array.length; i++){
            System.out.print("numero: ");
            array[i] = sc.nextInt();
            if (array[i]<0){
                sumaneg += array[i];
                neg++;
            }else{
                sumapos += array[i];
                pos++;
            }
        }
        System.out.println("La media de los positivos es: " + (sumapos/pos));
        System.out.println("La media de los negativos es: " + (sumaneg/neg));
    }
}
