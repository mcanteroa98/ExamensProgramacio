/*
Programa java que lea dos caracteres por teclado y compruebe si los dos son letras minúsculas
 */
package EstructuraCondicional;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex5 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in); 
        char car1, car2;
        System.out.println("Introduce un caracter: ");
        car1 = (char)System.in.read();
        System.in.read();
        System.out.println("Introduce el segundo: ");
        car2 = (char)System.in.read();
        if (car1>='a' && car1<='z'){
            if (car2>='a' && car2<'z') {
                System.out.println("Les dues lletres son minuscules");
        } System.out.println("La primera lletra es minuscula");
        }else{if (car2>='a' && car2<'z') {
            System.out.println("La segona lletra es minuscula");
        }else {
            System.out.println("Les dues lletres no son minuscules");
            }
        }
    }
}
   
