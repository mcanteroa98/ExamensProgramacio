/*
 Programa que lea números enteros por teclado y para cada número introducido indique si es positivo o negativo y si es par o impar.
Se deben realizar tres versiones del programa:
1.    En la primera versión se utilizará un bucle while. La lectura de números finalizará cuando se introduzca un cero.
2.    En la segunda versión se utilizará un bucle do .. while. La lectura de números en esta versión también finaliza cuando se introduzca un cero.
3.    En la tercera versión también se utilizará un bucle do .. while pero en este caso la lectura de números finaliza cuando se responda ‘N’ ó ‘n’ 
      a la pregunta “Desea introducir más números? (S/N):” 
 */
package EstructuraRepetitiva;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex12 {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        i = sc.nextInt();
        while (i!=0){
        if (i<0){
            if (i%2==0){
                System.out.println("Es negativo");
                System.out.println("Es par");
            }else{
                System.out.println("Es negativo");
                System.out.println("Es impar");
            }
        }else if(i>0){
            if (i%2==0){
                System.out.println("Es positivo");
                System.out.println("Es par");
            }else{
                System.out.println("Es positivo");
                System.out.println("Es impar");
            }
            }System.out.println("Introduce un numero (0 para acabar)");
             i = sc.nextInt();
        }
    }
}
