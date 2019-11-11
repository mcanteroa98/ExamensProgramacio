/*
Ejercicio 4:
Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit.
La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:
F = 32 + ( 9 * C / 5)
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class ebr4 {
    public static void main(String[] args) {
        int gc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los grados en celsius para pasarlos a Fahrenheit: ");
        gc = sc.nextInt();
        System.out.println((32 + ( 9 * gc / 5)) + " Fahrenheit");
    }
}
