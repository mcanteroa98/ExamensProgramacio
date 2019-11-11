/*
 2. Programa que lea un número entero y muestre si el número es múltiplo de 10.

Podemos comprobar si un número entero es múltiplo de 10 si al dividirlo por 10 es resto de esta división es cero.
 */
package EstructuraCondicional;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero para saber si es multiplo de 10: ");
        n = sc.nextInt();
        if (n%10==0) {
            System.out.println("Es multiplo de 10");
        }else {
            System.out.println("No es multiplo de 10");
        }
    }
}
