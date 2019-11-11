/*
Programa que pida que se introduzcan dos números enteros por teclado y muestre los números desde el menor hasta el mayor de los números introducidos.
Los dos números introducidos deben ser distintos. Si son iguales se mostrará un mensaje indicándolo y se vuelven a introducir.
 */
package EstructuraRepetitiva;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex9 {
    public static void main(String[] args) {
        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        n = sc.nextInt();
        System.out.println("Introduce un numero");
        i = sc.nextInt();
        if (n<0 || i<0){
            System.out.println("Escriu un numero mes gran");
        }else{
        if (n==i){
            System.out.println("Introduce dos numeros diferentes");
        }else if(n<i){
            while (n<i){
                System.out.println(n);
                n++;
            }
        }else{
            do{
                System.out.println(i);
                i++;
            }while(i!=n);
        }
        }
        
    }
}
