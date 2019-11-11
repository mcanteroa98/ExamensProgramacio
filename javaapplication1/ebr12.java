/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class ebr12 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Introduzca valor de N: ");
        N = sc.nextInt();  //supondremos que el número introducido tiene 5 cifras
        
        System.out.println(N%10);
        System.out.printf("%02d %n",N%100);
        System.out.printf("%03d %n",N%1000);
        System.out.printf("%04d %n",N%10000);
        System.out.printf("%05d %n",N);
    }
}
