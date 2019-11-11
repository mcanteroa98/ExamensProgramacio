/*
Ejercicio 7: Programa que lea dos números por teclado y muestre el resultado de la división 
del primer número por el segundo. Se debe comprobar que el divisor no puede ser cero.
 */
package EstructuraCondicional;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dividendo, divisor, div;
        System.out.println("Introduce dividendo: ");
        dividendo = sc.nextDouble();
        System.out.println("Introduce divisor: ");
        divisor = sc.nextDouble();
        div = dividendo/divisor;
       
        if (div == 0){
            System.out.println("No se puede dividir por 0.");
        }else{
            System.out.println(dividendo + " / " + divisor + " = " + dividendo/divisor);  
        }
    }
}
