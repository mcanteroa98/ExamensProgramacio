/*
Programa Java para leer la altura de N personas y calcular la altura media.
Calcular cuántas personas tienen una altura superior a la media y cuántas tienen una altura inferior a la media.
 */
package EjerciciosArrays;

/**
 *
 * @author bataparato
 */
public class Ex7 {
    public static void main(String[] args) {
        double [] array = {1.75,1.80,1.60,1.65,1.73};
        double suma = 0, cont = 0, media, alIn = 0, alSu = 0;
        
        for (int i = 0; i<array.length; i++){
            suma += array[i];
            cont++;
        }
        media = suma/cont;
        for (int i = 0; i<array.length; i++){
            if (array[i]< media){
                alIn++;
            }else{
                alSu++;
            }
        }
        System.out.println("La media de altura es " + media);
        System.out.println("Los alumnos con superior media tienen de altura " + alSu);
        System.out.println("Y los de menos media: " + alIn);
    }
}
