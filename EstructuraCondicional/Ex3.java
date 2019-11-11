/*
3. Programa que lea un carácter por teclado y compruebe si es una letra mayúscula
 */
package EstructuraCondicional;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex3 {
    public static void main(String[] args) throws IOException {
        
    char car;
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca un carácter: ");
     car = (char)System.in.read();
     
     if (Character.isUpperCase(car)){
         System.out.println("Es mayuscula");
     }else{
         System.out.println("Es minuscula");
     }
    }
}

/* Tambien se podria hacer con:
  if(car>='A' && car <='Z')
           System.out.println("Es una letra mayúscula");   
        else
           System.out.println("No es una letra mayúscula");   
*/