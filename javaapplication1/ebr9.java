/*
 Ejercicio 9:
Programa Java que calcule el área de un triángulo en función de las longitudes de sus lados (a, b, c), según la siguiente fórmula:  
Area = RaizCuadrada(p*(p-a)*(p-b)*(p-c))
donde p =  (a+b+c)/2
Para calcular la raíz cuadrada se utiliza el método Math.sqrt() 
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class ebr9 {
    public static void main(String[] args) {
        double a, b , c, p, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las longitudes de los 3 lados: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        
        p = (a+b+c)/2;
        area = Math.sqrt(p)*(p-a)*(p-b)*(p-c);
        System.out.println("El area del triangulo es de: " + area);
    }
}
