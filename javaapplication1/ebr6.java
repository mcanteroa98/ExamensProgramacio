/*
Ejercicio 6. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class ebr6 {
    public static void main(String[] args) {
        int kmh, ms;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ponga los Km/h que desea pasar a m/s: ");
        kmh = sc.nextInt();
        ms = kmh * 1000/3600;
        System.out.println(ms + "m/s");
        
    }
}
