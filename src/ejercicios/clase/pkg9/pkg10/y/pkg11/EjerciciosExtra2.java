/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.clase.pkg9.pkg10.y.pkg11;

import java.util.Scanner;

/**
 *
 * @author clavs
 */
public class EjerciciosExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Dimensione los vectores:");
        int n = leer.nextInt();

        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        boolean flag = true;
        
        System.out.println("Rellene el vector #1:");
        for (int i = 0; i < n; i++) {
            System.out.println("Pocision #" + i);
            vector1[i] = leer.nextInt();
        }
        
         System.out.println("Rellene el vector #2:");
        for (int i = 0; i < n; i++) {
            System.out.println("Pocision #" + i);
            vector2[i] = leer.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            if (vector1[i] != vector2[i]) {
                i = n;
                flag = false;
            }
        }

        if (flag) {
            System.out.println("Ambos vectores son iguales!");
        } else {
            System.out.println("Los vectores son diferentes.");
        }
    }

}
