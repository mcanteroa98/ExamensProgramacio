/*
Programa que pida que se introduzca por teclado el valor de un número entero N y muestre los números desde N hasta 1 ambos incluidos.
Se debe resolver este ejercicio de tres formas distintas: utilizando la estructura repetitiva while,
utilizando la estructura repetitiva do .. while y utilizando la estructura repetitiva for.
 */
package EstructuraRepetitiva;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Introduce un numero");
        n = sc.nextInt();
        do{
            System.out.println(n);
            n--;
        }while(n!=0);
    }
}
