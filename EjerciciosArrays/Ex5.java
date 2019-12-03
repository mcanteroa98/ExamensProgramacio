/*
Programa Java que guarda en un array 10 números enteros que se leen por teclado.
A continuación se recorre el array y calcula cuántos números son positivos, cuántos negativos y cuántos ceros. 
 */
package EjerciciosArrays;

/**
 *
 * @author bataparato
 */
public class Ex5 {
    public static void main(String[] args) {
        int pos = 0, neg = 0, zeros = 0;
        int [] array = {13,24,6,0,-1,-56,0,-45,9,0,};
        for (int i = 0; i<array.length; i++){
            if (array[i]==0){
                zeros++;
            }else if (array[i]<0){
                neg++;
            }else{
                pos++;
            }
        }
        System.out.println("Hay " +pos+" numeros positivos");
        System.out.println(neg+ " numeros negativos");
        System.out.println("y " + zeros + " zeros");
    }
}
