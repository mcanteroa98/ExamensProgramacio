/*
Un número es perfecto si es igual a la suma de todos sus divisores positivos sin incluir el propio número.
Por ejemplo, el número 6 es perfecto. 
El 6 tiene como divisores: 1, 2, 3 y 6 pero el 6 no se cuenta como divisor para comprobar si es perfecto.
Si sumamos 1 + 2 + 3 = 6 
Los siguientes números perfectos después del 6 son 28, 496, 8128, 33550336, 8589869056. 
 */
package BuclesAnidados;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, suma = 0;
    System.out.println("Introduce un numero para saber si es perfecto: ");
    n = sc.nextInt();   
    
        for (int i = 1; i<n; i++){
            if (n%i==0){
              suma += i;
            }
        }
        if (suma == n){
            System.out.println("Perfecto");
        }else{
            System.out.println("No es perfecto");
        }
    }
}
