/*
 * Programa Java que determina si dos números son amigos.
 * Dos números son amigos si la suma de los divisores propios del primero
 * es igual al segundo y viceversa.
 Los divisores propios de un número incluyen la unidad pero no el propio número.

Un ejemplo de números amigos son los números 220 y 284.
Los divisores propios de 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110.
La suma de los divisores propios de 220 da como resultado 284
Los divisores propios de 284 son 1, 2, 4, 71 y 142.

Otras parejas de números amigos son:
 1184,   1210
 2620,   2924
 5020,   5564
 6232,   6368
10744, 10856
12285, 14595
17296, 18416 
 */
package EjerciciosGenerales;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, suma=0;
        System.out.println("Introduce el valor de n1: ");
        n1 = sc.nextInt();
        System.out.println("Introduce el valor de n2:");
        n2 = sc.nextInt();
        for (int i=1; i<n1; i++){
            if (n1%i==0){
                suma += i;
            }
        }
        if (suma==n2){
            suma = 0;
            for (int i=1;i<n2;i++){
                if (n2%i==0){
                    suma += i;
                }
            }
            if (suma == n1){
                System.out.println("Son amigos");
            }else{
                System.out.println("No son amigos");
            }
        }else{
            System.out.println("No son amigos");
        }
    }
}
