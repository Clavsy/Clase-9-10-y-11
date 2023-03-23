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
public class EjercicioPractico6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int[][] cuadrado = new int[3][3];

        System.out.println("Ingrese valores entre 1 y 9 para rellenar el cuadrado magico:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                cuadrado[i][j] = leer.nextInt();

                while (cuadrado[i][j] < 1 || cuadrado[i][j] > 9) {
                    System.out.println("Valor ingresado invalido, vuelva a intentar:");
                    cuadrado[i][j] = leer.nextInt();
                }

            }
        }

        System.out.println("Cuadrado formado:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + cuadrado[i][j] + "]");
            }
            System.out.println(" ");
        }

        int suma1 = cuadrado[0][0] + cuadrado[0][1] + cuadrado[0][2];

        System.out.println(" ");
        
        System.out.println("La suma de...");
        
        boolean filas = comparadorFilas(suma1, cuadrado);
        System.out.println("... las filas, son iguales? = " + filas);
        
        boolean columnas = comparadorColumnas(suma1, cuadrado);
        System.out.println("... las columnas, son iguales? = " + columnas);
        
        boolean diagonal = comparadorDiagonal(suma1, cuadrado);
        System.out.println("... la diagonal, es igual? = " + diagonal);
        
        boolean diagonalOpuesta = comparadorDiagonalOpuesta(suma1, cuadrado);
        System.out.println("... la diagonal opuesta, es igual? = " + diagonalOpuesta);
        
        System.out.println(" ");
        
        if(filas && columnas && diagonal && diagonalOpuesta){
            System.out.println("El cuadrado es mágico :D");
        } else {
            System.out.println("El cuadrado NO es magico :(");
        }
        
    }

    public static boolean comparadorFilas(int suma1, int[][] cuadrado) {

        boolean retorno = false;
        int suma2;
        int verificador = 0;

        for (int i = 0; i < 3; i++) {

            suma2 = 0;

            for (int j = 0; j < 3; j++) {
                suma2 = suma2 + cuadrado[i][j];
            }

            if (suma2 == suma1) {
                verificador++;
            }
        }

        if (verificador == 3) {
            retorno = true;
        }

        return retorno;
    }

    public static boolean comparadorColumnas(int suma1, int[][] cuadrado) {

        boolean retorno = false;
        int suma2;
        int verificador = 0;

        for (int i = 0; i < 3; i++) {

            suma2 = 0;

            for (int j = 0; j < 3; j++) {
                suma2 = suma2 + cuadrado[j][i];
            }

            if (suma2 == suma1) {
                verificador++;
            }
        }

        if (verificador == 3) {
            retorno = true;
        }

        return retorno;
    }

    public static boolean comparadorDiagonal(int suma1, int[][] cuadrado) {

        boolean retorno = false;
        int suma2 = 0;
        int verificador = 0;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (i == j) {
                    suma2 = suma2 + cuadrado[i][j];
                }

            }
        }

        if (suma2 == suma1) {
            verificador++;
        }

        if (verificador == 1) {
            retorno = true;
        }

        return retorno;
    }

    public static boolean comparadorDiagonalOpuesta(int suma1, int[][] cuadrado) {

        boolean retorno = false;
        int suma2 = 0;
        int verificador = 0;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (i + j == 2) {
                    suma2 = suma2 + cuadrado[i][j];
                }

            }
        }

        if (suma2 == suma1) {
            verificador++;
        }

        if (verificador == 1) {
            retorno = true;
        }

        return retorno;
    }

}
