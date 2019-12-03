/*
 * Programa que crea un array de 20 elementos
 * llamado Pares y guarde los 20 primeros
 * números pares.
 * Mostrar por pantalla el contenido
 * del array creado
 */
package EjerciciosArrays;

/**
 *
 * @author bataparato
 */
public class Ex4 {
    public static void main(String[] args) {
        System.out.println("Los numeros 20 primeros numeros pares son: ");
        int i, cont = 2;
        int [] par = new int[20];
        for ( i = 0; i < par.length; i++){
            par[i] = cont;
            cont+=2;
        }
        for ( i = 0; i < par.length; i++){
            System.out.print(par[i] + " ");
        }
    }
}
