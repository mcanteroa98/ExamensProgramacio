/*
Escribe un programa Java que pida por teclado el valor de un número N y muestre por pantalla
todos los números desde 1 hasta N.
 */
package EstructuraRepetitiva;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex7 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        n = sc.nextInt();
        for (int i=1; i<=n; i++){
            System.out.println(i);
        }
    }
}
