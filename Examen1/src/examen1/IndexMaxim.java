/*
5- Mètode estàtic que retorni  l’índex on hi ha el valor màxim dels valors continguts dins la matriu
 */
package examen1;

/**
 *
 * @author batman
 */
public class IndexMaxim {
    public int iMax (int array [], int n){
        
        for (int i = 0; i < array.length; i++) {
            if (array[i]==n){
                n = i;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        ValorMaxim ob = new ValorMaxim();
        IndexMaxim ob1 = new IndexMaxim();
        int array [] = new int [] {1,7,3,0};
        System.out.println(ob1.iMax(array, ob.vMax(array)));
    }
}
