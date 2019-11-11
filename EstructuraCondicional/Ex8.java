/*
 * Programa que lee tres números distintos
 * y nos dice cuál de ellos es el mayor
 */
package EstructuraCondicional;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex8 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce un num. ");
        a = sc.nextInt();
        System.out.println("Otro num");
        b = sc.nextInt();
        System.out.println("Otro num");
        c = sc.nextInt();
        if (a>b && a>c){
            System.out.println("El numero mes gran es " + a);
        }if (b>a && b>c){
            System.out.println("El numero mes gran es " + b);
        }if (c>a && c>b){
            System.out.println("El numero mes gran es " + c);
        }else{
            System.out.println("Hi ha dos o mes numeros repetits.");
        }
    }
}
