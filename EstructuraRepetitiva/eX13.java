package EstructuraRepetitiva;


import java.io.IOException;
import java.util.Scanner;

/*
Programa Java que convierte millas a kilómetros. El programa pide que se introduzca una cantidad de millas y
calcula y muestra su equivalente en Kilómetros. El proceso se repite hasta que se introduzca un 0 como valor para las millas.
1 Milla equivale a 1.6093 Kilómetros.
El valor de los KM resultantes se debe mostrar con dos decimales.
 */

/**
 *
 * @author bataparato
 */
public class eX13 {
    /*
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double n, km;
        char S, N, r;
        System.out.println("Introduce las millas que quieras pasar a km:");
        n = sc.nextDouble();
        km = n*1.6093;
        System.out.println( n + "millas son " +km+" km");
        System.out.println("Deseas Seguir? (S/N)");
        r = (char)System.in.read();
        S = 'S';
        N = 'N';
       
        while (r==S){
        System.out.println("Introduce las millas que quieras pasar a km:");
        n = sc.nextDouble();
        km = n*1.6093;
        System.out.println( n + "millas son " +km+" km");
        System.out.println("Deseas Seguir? (S/N)");
        r = (char)System.in.read();
        }if (r==N){
            System.out.println("Adeu");
        }else{
            System.out.println("Error");
        }
    }*/
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double n, km;
        char respuesta;
        do {
            System.out.println("Introduce las millas que quieras pasar a km:");
            n = sc.nextDouble();
            km = n*1.6093;
            System.out.println( n + "millas son " +km+" km");
            System.out.println("Desea introducir mas millas? (Y/N)");
            respuesta = (char)System.in.read();
        }while (respuesta == 'Y' || respuesta == 'y');
    }
}
