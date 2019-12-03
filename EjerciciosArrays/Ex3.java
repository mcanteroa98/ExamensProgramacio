/*
3. Programa que lee por teclado la nota de los alumnos de una clase y calcula la nota media del grupo.
También muestra los alumnos con notas superiores a la media. El número de alumnos se lee por teclado.
Este programa utiliza un array de elementos de tipo double que contendrá las notas de los alumnos. 
El tamaño del array será el número de alumnos de la clase, por lo tanto primero se pedirá por teclado el número de alumnos y a continuación se creará el array.
Se realizan 3 recorridos sobre el array, el primero para asignar a cada elemento las notas introducidas por teclado,
el segundo para sumarlas y calcular la media y el tercero para mostrar los alumnos con notas superiores a la media.
 */
package EjerciciosArrays;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alumnos;
        double media = 0, suma = 0;
        do{
        System.out.print("Cuantos alumnos hay en clase? ");
        alumnos = sc.nextInt();
        System.out.println("");
        }while(alumnos<0);
        
        double[] notasAl = new double[alumnos];
        
        for (int i = 0; i<notasAl.length; i++){
            System.out.print("Introduce la nota del alumno "+ (i+1)+ ": ");
            notasAl[i] = sc.nextInt();
            System.out.println("");
            suma += notasAl[i];
            media = suma/alumnos;

        }
        System.out.print("La suma de las notas es: " + suma);
        System.out.println("");
        System.out.print("La media de las notas es: " + media);
        System.out.println("");
        
            for (int i = 0; i<notasAl.length; i++){
            if (notasAl[i]>media){
            System.out.print("Alumno numero" + (i+1)+ " nota superior a la media con un: " + notasAl[i]);
            System.out.println("");
        }
        }
    }
} 

/*            
if (notasAl[i]>media){
System.out.print("Alumno numero" + (i+1)+ " nota superiot a la media con un: " + notasAl[i]);
System.out.println("");
}
*/
