/*
 Programa que tome como dato de entrada un número que corresponde a la longitud del radio 
una esfera y nos calcula y escribe el volumen de 
la esfera que se corresponden con dicho radio.

La fórmula para calcular el volumen de la esfera es
v = (4/3)*PI*r^3
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class ebr8 {
    public static void main(String[] args) {
        double r, v;
        Scanner sc = new Scanner(System.in);
        System.out.println("Intrduzca el radiod e la esfera: ");
        r = sc.nextInt();
        v = (4.0/3)*Math.PI*Math.pow(r, 3);
        System.out.println("El volumen es: " + v);
        
    }
}
