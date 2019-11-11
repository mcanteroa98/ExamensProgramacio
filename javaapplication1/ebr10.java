/*
Programa Java que lea un número entero de 3 cifras y muestre por separado las cifras del número.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class ebr10 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero que quieras separar: ");
        N = sc.nextInt();
        System.out.println("Primera cifra de " + N + " -> " + (N/100));
        System.out.println("Cifra central de " + N + " -> " + (N/10)%10);
        System.out.println("Última cifra  de " + N + " -> " + (N%10));
    }
    
}
