/*
2- Mètode estàtic que retorni el valor mínim dels valors continguts dins la matriu.
 */
package examen1;

/**
 *
 * @author batman
 */
public class ValorMinim {
    public int vMinim(int array[]){
        int min = 99999999;
        for (int i = 0; i < array.length; i++) {
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        ValorMinim ob1 = new ValorMinim();
        int array [] = new int [] {9,2,3,4};
        System.out.println(ob1.vMinim(array));
    }
}
