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
public class EjercicioPractico5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] matriz1 = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        int[][] matriz2 = new int[3][3];
        int contador = 0;
        
        for (int filas = 0; filas < 3; filas++) {
            for (int columnas = 0; columnas < 3; columnas++) {
                
                System.out.print("[" + matriz1[filas][columnas] + "]");
                
            }
            System.out.println(" ");
        }
        
        System.out.println(" ");
        
        for (int filas = 0; filas < 3; filas++) {
            for (int columnas = 0; columnas < 3; columnas++) {
                
                matriz2[filas][columnas] = matriz1[columnas][filas];
                
                if((matriz2[filas][columnas] + matriz1[filas][columnas]) == 0){
                    contador++;
                }
                
                System.out.print("[" + matriz2[filas][columnas] + "]");
                
            }
            System.out.println(" ");
        }

        if(contador == 9){
            System.out.println("La matrices son antisimetricas.");
        }else{
            System.out.println("Las matrices NO son antisimetricas.");
        }
        
    }

}
