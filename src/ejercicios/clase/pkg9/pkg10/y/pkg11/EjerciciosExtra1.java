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
public class EjerciciosExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Dimensione el vector:");
        int n = leer.nextInt();

        int[] vector = new int[n];
        int suma = 0;
       
        System.out.println("Rellene la matriz con numeros enteros:");
        for (int i = 0; i < vector.length; i++) {

            System.out.println("Numero #" + (i+1));
            vector[i] = leer.nextInt();
            suma = suma + vector[i];
            
        }
        
        System.out.println("El valor de la suma de todos los numeros del vector es de " + suma);
        
    }
    
}
