/*
3.      Escribe un programa Java que lee un número entero por teclado y obtiene y muestra por pantalla el doble y el triple de ese número
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class EBR3 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un num entero: ");
        n = sc.nextInt();
        
        System.out.println("El doble de este num es: " + (n*2) );
        System.out.println("Y el triple: " +(n*3));
    }
}
