/*
4- Mètode estàtic que retorni el valor màxim dels valors continguts dins la matriu.
 */
package examen1;

/**
 *
 * @author batman
 */
public class ValorMaxim {
    public int vMax (int array[]){
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
}
