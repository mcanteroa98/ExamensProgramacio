/*
 Ejercicio 6: Programa java que lea un carácter por teclado y compruebe si es un dígito numérico (cifra entre 0 y 9).

Vamos a escribir dos soluciones a este ejercicio. 

La primera consiste en comprobar si el carácter es un dígito mediante el método isDigit de la clase Character.
Este método devuelve true si el carácter que se le pasa como parámetro es una cifra entre 0 y 9:
 */
package EstructuraCondicional;

import java.io.IOException;
import java.util.Scanner;



public class Ex6 { 
    /*
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char n;
        System.out.println("Introduce un num: ");
        n = (char)System.in.read();
        if (Character.isDigit(n)){
            System.out.println("Es un numero");
        }else{
            System.out.println("No es un numero");
        }
    }
}
 */

/* 
La otra solución es directa y consiste en comprobar si el carácter que se ha leído por teclado
es mayor o igual que el carácter 0 y menor o igual que el carácter 9.
*/
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char n;
        System.out.println("Introduce un num: ");
        n = (char)System.in.read();
        if (n>='0' && n<='9'){
            System.out.println("Es un numero");
        }else{
            System.out.println("No es un numero");
        }
    }
}