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
public class EjerciciosExtra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero. Se devolvera esa cantidad de numeros en la secuencia de Fibonacci.");
        int n = leer.nextInt();
        int[] vector = new int[n];
        
        secuenciaFibonacci(vector, n);
        
        System.out.println("Secuencia Fibonacci hasta su posicion numero " + n);
        imprimirVector(vector, n);
    }
    
    public static void imprimirVector(int[] vector, int n) {
        for(int i = 0; i < n; i++){
            System.out.print("[" + vector[i] + "] ");
        }
    }

    private static void secuenciaFibonacci(int[] vector, int n) {
        
        int num1 = 0;
        int num2 = 1;
        int aux = 1;
        
        for (int i = 0; i < n; i++) {
            vector[i] = aux;
            aux = num1 + num2;
            num1 = num2;
            num2 = aux;
        }
    }
}
