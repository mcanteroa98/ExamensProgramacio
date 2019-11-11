/*
Ejercicio 5. Programa que lee por teclado el valor del radio de una circunferencia y calcula y muestra por pantalla la longitud y el área de la circunferencia. 

Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class ebr5 {
    public static void main(String[] args) {
        double r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ponga el radio de la circunferencia: ");
        r = sc.nextDouble();
        System.out.println("La longitud es: " + (2 * Math.PI * r));
        System.out.println("Y la Area es: " + (Math.PI * Math.pow(r,2)));
    }
    
}
