/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.clase.pkg9.pkg10.y.pkg11;

/**
 *
 * @author clavs
 */
public class EjerciciosExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] vector = new int[10];
        
        rellenarVector(vector);
        imprimirVector(vector);
        
        System.out.println(" ");
    }

    public static void rellenarVector(int[] vector) {
        for(int i = 0; i < 10; i++){
            vector[i] = (int) (Math.random()*100);
        }
    }

    public static void imprimirVector(int[] vector) {
        for(int i = 0; i < 10; i++){
            System.out.print("[" + vector[i] + "] ");
        }
    }
    
}
