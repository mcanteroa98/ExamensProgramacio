/*
 * Leer 10 números enteros y guardarlos
 * en un array. Calcular la media de los
 * que estén en las posiciones pares.
 * package EjerciciosArrays;
 */
package EjerciciosArrays;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex2Meu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArray = new int[5];
        double suma = 0;
        int par = 0;
        
        for (int i = 0;i<myArray.length; i++){
            System.out.print("Introduce "+(i+1)+" num: ");
            myArray[i] = sc.nextInt();
            
            if (myArray[i]%2==0){
                suma += myArray[i];
                par++;
            }
        }
        System.out.println("");
       System.out.print("La media de los pares es: " + (suma/par));
        System.out.println("");
    }
}
