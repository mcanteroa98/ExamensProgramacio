/*
* Programa java que lea tres números enteros H, M, S que contienen hora, minutos y
 * segundos respectivamente, y comprueba si la hora que indican es una hora válida.
 */
package EstructuraCondicional;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex9 {
    public static void main(String[] args) {
        int h, m ,s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la hora ");
        h = sc.nextInt();
        System.out.println("Escribe los minutos ");
        m = sc.nextInt();
        System.out.println("Escribe los segundos ");
        s = sc.nextInt();
        if (h<=24 && h>=0){
            if (m<=60 && m>=0){
               if (s<=60 && s>=0){
                   System.out.println("Son les: " + h +":"+ + m +":"+ s);
               }else{
                   System.out.println("Els segons no estan be");
               }
            }else{
                   System.out.println("Els minuts no estan be");
            }
        }else{
                   System.out.println("L'horano esta be");
        }
    }
}
