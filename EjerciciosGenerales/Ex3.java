/*
 * Programa que lee una temperatura expresada en grados centígrados y los pasa a grados kelvin. 0 °C + 273,15 = 273,15 K
 * Repetir el proceso mientras que se responda ‘S’ a la pregunta:
 * Repetir proceso? (S/N)
 */
package EjerciciosGenerales;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char respuesta;
        do{
            System.out.println("Introduce los grados centrigrados que desea convertir");
            double n = 0.0, k;
            n = sc.nextDouble();  
            k = n + 273.15;
            System.out.println(n + "grados centigrados = " + k + " kelvin");
            
            System.out.println("Desea continuar?");
            respuesta = (char)System.in.read();
        }while(respuesta !='N' && respuesta != 'n');
    }
}
