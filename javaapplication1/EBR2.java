/*
2.      Programa Java que lea un nombre y muestre por pantalla:
“Buenos dias nombre_introducido”
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class EBR2 {
    
    public static void main(String[] args) {
        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        
        nombre = sc.nextLine();
        System.out.println("Hola " + nombre);
        
        
    }
}
