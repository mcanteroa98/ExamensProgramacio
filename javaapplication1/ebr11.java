/*
 Programa que lea un número entero N de 5 cifras y muestre sus cifras igual que en el ejemplo.
Por ejemplo para un número N = 12345   La salida debe ser:
1
12
123
1234
12345
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class ebr11 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un num: ");
        N = sc.nextInt();
        System.out.println(N/10000);
        System.out.println(N/1000);
        System.out.println(N/100);
        System.out.println(N/10);
        System.out.println(N); 
    }
}
