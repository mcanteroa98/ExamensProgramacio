/*
 * Programa java que lea una variable entera mes y compruebe si el valor corresponde
 * a un mes de 30 días. Se debe comprobar que el valor introducido esté
 * comprendido entre 1 y 12
 */
package EstructuraCondicional;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes;
        System.out.println("Introduzca numero de mes: ");
        mes = sc.nextInt();
        if (mes<=1 || mes>=12){
            System.out.println("Mes incorrecto");
        }else{
            switch(mes){
                case 1: System.out.println("Enero");
                        break;
                case 2: System.out.println("Febrero");
                        break;
                case 3: System.out.println("Marzo");
                        break;
                case 4: System.out.println("Abril");
                        break;
                case 5: System.out.println("Mayo");
                        break;
                case 6: System.out.println("Junio");
                        break;
                case 7: System.out.print("Julio");
                        break;
                case 8: System.out.print("Agosto");
                        break;
                case 9: System.out.print("Septiembre");
                        break;
                case 10: System.out.print("Octubre");
                        break;
                case 11: System.out.print("Noviembre");
                        break;
                case 12: System.out.print("Diciembre");
                        break;
            
            }
        }
    }
}
