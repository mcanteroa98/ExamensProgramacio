/*
 * Programa que lea una serie de números por teclado hasta que
 * se lea un número negativo. El programa indicará cuántos números
 * acabados en 2 se han leído.
 */
package EjerciciosGenerales;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, contador=0;
        do{
            System.out.println("Introduce un numero: ");
            n = sc.nextInt();
            if (n%10==2){
                contador++;
            }
        }while(n>=0);
        System.out.println("Se han introducido " + contador + " números acabados en 2");
    }
}
