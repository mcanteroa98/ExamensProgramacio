/*
 Programa Java para convertir un número entero a números romanos.
El programa pide un número entre 1 y 3999 y calcula su equivalente en números romanos. Se utiliza un método llamado convertirANumerosRomanos que recibe el número N
a convertir de tipo int y devuelve un String con el equivalente en números romanos.Para convertirlo se obtiene por separado cada cifra del número y se muestran
las combinaciones de letras del número romano equivalentes a cada cifra del número original. Este método no utiliza arrays de modo que este programa se puede resolver
sin haber estudiado aún los arrays.
 */
package EjerciciosArrays;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, miles, centenas, decenas, unidades, numero = 0;
        do{
        System.out.print("Introduce el numero decimal que quieres pasar a romano: ");
        n = sc.nextInt();
        }while(n<4000 && n>0);
        
      miles = numero / 1000;
      centenas = numero / 100 % 10;
      decenas = numero / 10 % 10;
      unidades = numero % 10;
    }
}
