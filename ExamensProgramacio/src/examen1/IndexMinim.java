/*
3- Mètode estàtic que retorni  l’índex on hi ha el valor mínim dels valors de la matriu. 
 */
package examen1;

/**
 *
 * @author batman
 */
public class IndexMinim {
    public int iMin (int array [], int index){
        
        for (int i = 0; i < array.length; i++) {
            if (index==array[i])
                index = i;
        }
        return index;
    }
    
    public static void main(String[] args) {
        ValorMinim ob1 = new ValorMinim();
        IndexMinim ob2 = new IndexMinim();
        int array [] = new int [] {1,2,3,0};
        System.out.println(ob2.iMin(array, ob1.vMinim(array)));
    }
}
