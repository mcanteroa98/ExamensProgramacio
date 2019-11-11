/*
Ejercicio 7. Programa lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud de la hipotenusa según el teorema de Pitágoras
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class ebr7 {
    public static void main(String[] args) {
        double c1, c2, h;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la longitud de los catetos de un trniangulo: ");
        c1 = sc.nextInt();
        c2 = sc.nextInt();
        h = Math.sqrt(Math.pow(c1 , 2) + Math.pow(c2 , 2));
        System.out.println("La hipotenusa es: " + h);
        
    }
}
