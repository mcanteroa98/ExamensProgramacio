/*
Programa que pida que se introduzcan dos números enteros A y B por teclado y muestre los números pares que hay entre A y B.
A debe ser menor que B. Si no es así se mostrará un mensaje indicándolo y se vuelven a introducir.
 */
package EstructuraRepetitiva;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex10 {
    public static void main(String[] args) {
        int n, i, major, menor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        n = sc.nextInt();
        System.out.println("Introduce otro numero:");
        i = sc.nextInt();
        if (n<i){
            major = i;
            menor = n;
        }else{
            major = n;
            menor = i;
        }while(menor!=major){
            System.out.println(menor%2==0);
            menor++;
        }
    }
}
