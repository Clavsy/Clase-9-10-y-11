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
public class EjercicioPractico4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] matriz = new int[4][4];

        
        System.out.println("Matriz original:");
        for (int filas = 0; filas < 4; filas++) {
            for (int columnas = 0; columnas < 4; columnas++) {

                matriz[filas][columnas] = (int) (Math.random() * 10);
                System.out.print("[" + matriz[filas][columnas] + "]");
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println("Matriz traspuesta:");
        for (int columnas = 0; columnas < 4; columnas++) {
            for (int filas = 0; filas < 4; filas++) {
                System.out.print("[" + matriz[filas][columnas] + "]");
            }
            System.out.println(" ");
        }

    }

}
