/*
Programa Java que lea un número entero N y muestre la tabla de multiplicar de ese número. Por ejemplo, si se lee el valor 7 se mostrará por pantalla:
Tabla del 7
--------------
7 * 1  =  7
7 * 2  = 14
7 * 3  = 21
7 * 4  = 28
7 * 5  = 35
7 * 6  = 42
7 * 7  = 49
7 * 8  = 56
7 * 9  = 63
7 * 10 = 70
 */
package EjerciciosGenerales;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, y=1, r;
        System.out.println("Escibe un numero para obtener la tabla de multiplicar: ");
        n = sc.nextInt();
        while (y<=10){
            r = n * y;
            System.out.println(n + " * " + y + " = " + r);
            y++;
        }
    }
}
