/*
6- Mètode estàtic que retorni true si la matriu està ordenada de forma ascendent i false en cas contrari.
 */
package examen1;

/**
 *
 * @author batman
 */
public class OrdreAscendentDescendent {
    public static boolean ordre (int array []){
        int k = array[0];
        int des = 1;
        int asc = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i]==k-1){
                k = array[i];
                des++;
            }
            if (array[i]==k+1){
                k = array[i];
                asc++;
            }
            
        }
        if (asc==array.length || des==array.length){
            if (asc==array.length){
                return true;
            }
            if (des==array.length){
                return false;
             }
        }
        else{
        System.out.println("No esta ordenado");
        }
        return false;
    }
    
    public static void main(String[] args) {
        OrdreAscendentDescendent ob = new OrdreAscendentDescendent();
        int array [] = new int [] {4,5,2,1};
        System.out.println(ob.ordre(array));
    }
}
