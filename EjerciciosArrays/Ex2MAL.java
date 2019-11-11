/**
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
public class Ex2MAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, par = 0, suma = 0;
        int[] numeros = new int[3];
        
        System.out.println("Introduce 10 num:");
        for (i=0; i<10; i++){
            System.out.print("numero "+i+" = ");
            numeros[i]=sc.nextInt();
        }
        for (i = 0; i < 10; i++){
            if (i % 2 == 0){
                suma += i;
                par++;
            }
        }
        System.out.println("La suma de los numeros pares = " + suma);
        System.out.println("La media de los numeros pares = " + par);
    }
}
