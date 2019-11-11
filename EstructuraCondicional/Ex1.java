/*
 1. Programa Java que lea un número entero por teclado y calcule si es par o impar.

Podemos saber si un número es par si el resto de dividir el número entre 2 es igual a cero. En caso contrario el número es impar

El operador Java que calcula el resto de la división entre dos números enteros o no es el operador %

El programa que calcula si un número entero es par o impar es el siguiente:
 */
package EstructuraCondicional;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex1 {
        
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un num : ");
        n = sc.nextInt();
        if (n%2==0) {
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }
}
