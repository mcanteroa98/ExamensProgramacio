/*

Programa para intercambiar el valor de dos variables. Los valores iniciales se leen por teclado.

Por ejemplo, suponiendo que las variables se llaman A y B, si A contiene 3 y B contiene 5, después del intercambio A contendrá 5 y B 3. 

En este ejemplo, para intercambiar el valor entre dos variables utilizaremos una avariable auxiliar donde guardar el valor de una de ellas.
Después veremos la forma de hacerlo sin usar una variable auxiliar para el intercambio.  
 */
package EjerciciosGenerales;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, aux;
        
        System.out.println("Introduce el valor de X");
        x = sc.nextInt();
        System.out.println("Introduce el valor de Y ");
        y = sc.nextInt();
        
        aux = x; //aux = 2
        x = y; //x = 2
        y = aux; //y = 
        /*
        Programa que intercambie dos variables sin auxiliar
        y = y + x;
        x = y - x;
        y = y - x;
        */
        
        System.out.println("X = " +x);
        System.out.println("Y = " +y);
    }
}
