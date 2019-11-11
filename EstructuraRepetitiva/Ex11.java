/*
Programa que lea dos números enteros positivos N y M y muestre los múltiplos de N que hay desde 1 hasta M. Por ejemplo si N = 4 y M = 500
el programa mostrará los múltiplos de 4 desde 1 hasta 500. El valor de N deberá ser menor que el valor de M.
Si no se introducen valores válidos para N o M se mostrará el mensaje correspondiente y se vuelven a pedir. 
 */
package EstructuraRepetitiva;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex11 {
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce N:");
        n = sc.nextInt();
        System.out.println("Introduce M:");
        m = sc.nextInt();
        if (n<0 || m<0){
            System.out.println("Error");
        }else{
            for (int i = 1; i <= m; i++){
                if (i%n == 0){
                    System.out.println(i);
                }
            }
        }
    }
    
}
