/*
 Programa que pida por teclado la fecha de nacimiento de una persona (dia, mes, año) y calcule su número de la suerte.
El número de la suerte se calcula sumando el día, mes y año de la fecha de nacimiento y a continuación sumando las cifras obtenidas en la suma.
Por ejemplo:
Si la fecha de nacimiento es 12/07/1980 
Calculamos el número de la suerte así: 12+7+1980 = 1999  1+9+9+9 = 28
Número de la suerte: 28
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class EBR13 {
    
    public static void main(String[] args) {
        int año, mes, dia, res, suma, a, b, c, d;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce el año: ");
        año = sc.nextInt();
        System.out.printf("Introduce el mes: ");
        mes = sc.nextInt();
        System.out.printf("Introduce el dia: ");
        dia = sc.nextInt();
        
        suma = año + mes + dia;
        a = suma/1000;
        b = suma/100%10;
        c = suma/10%10;
        d = suma%10;
        
        res = a+b+c+d;
        
        System.out.println("Tu numero de la suerte es: " + res);
        
    }
}
