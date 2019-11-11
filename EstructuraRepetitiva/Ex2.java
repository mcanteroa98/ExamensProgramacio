 /*
 * Ejercicios básicos java con estructura iterativa o repetitiva
 * Mostrar los números del 1 al 100 utilizando un bucle do while
 */
package EstructuraRepetitiva;

/**
 *
 * @author bataparato
 */
public class Ex2 {
    public static void main(String[] args) {
        int n = 1;
        System.out.println("Numeros del 1 al 100: ");
        do{
            System.out.println(n);
            n++;
        }while(n<=100);   
    }
}

