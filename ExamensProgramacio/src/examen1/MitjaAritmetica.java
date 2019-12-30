/*
1-Mètode estàtic que retorni la mitja aritmètica dels valors continguts dins la matriu.
 */
package examen1;

/**
 *
 * @author batman
 */
public class MitjaAritmetica {

        public int mitjaAr(int array []){
            int mitja;
            int sum = 0;
            int n = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
                n++;
            }
            mitja = sum/n;
            return mitja;
        }
    public static void main(String[] args) {
        MitjaAritmetica ob = new MitjaAritmetica();
        int [] intarray = new int []{10,5,15};
        System.out.println(ob.mitjaAr(intarray));
    }
}
