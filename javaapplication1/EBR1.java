/*
Programa Java que lea dos números enteros por teclado y los muestre por pantalla.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class EBR1 {

    public static void main(String[] args) {
        int n1, n2;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduze el num: ");
        n1 = sc.nextInt();
        
        System.out.println("Introduze el segundo num: ");
        n2 = sc.nextInt();
        
        System.out.println("Los numeros son: " + n1 +" "+ n2);
        
    }
}
