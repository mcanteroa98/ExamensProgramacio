/*
Programa que lea dos caracteres y compruebe si son iguales.
 */
package EstructuraCondicional;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex4 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char car1, car2;
        System.out.println("Pon un caracter: ");
        car1 = (char)System.in.read();
        System.in.read(); //saltar el intro que ha quedado en el buffer
        System.out.println("Pon otro: ");
        car2 = (char)System.in.read();
        
        if (car1 == car2){
            System.out.println("Los caracteres son iguales");
        }else{
            System.out.println("Son diferentes");
        }
    }
}

/* 
Una forma alternativa de hacer este programa es creando dos objetos Character a
partir de los caracteres que se han leído y compararlos utilizando el método equals
*/

/*
import java.io.*;
public class condicional1_5 {
    public static void main(String[] args) throws IOException {
        char car1, car2;
        System.out.print("Introduzca primer carácter: ");
        car1 = (char)System.in.read(); //lee un carácter
        System.in.read();  //saltar el intro que ha quedado en el buffer
        System.out.print("Introduzca segundo carácter: ");
        car2 = (char)System.in.read(); //lee el segundo carácter
        Character c1 = new Character(car1);
        Character c2 = new Character(car2);
        if(c1.equals(c2))  //comparamos dos objetos Character mediante el método equals
            System.out.println("Son iguales");   
        else
            System.out.println("No son iguales");
    }  
}
*/
