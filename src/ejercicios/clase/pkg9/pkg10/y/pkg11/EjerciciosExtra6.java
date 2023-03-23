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
public class EjerciciosExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String[][] sopaDeLetras = new String[20][20];
        String palabra;
        int random1;
        int random2;
        
        System.out.println("CREADOR DE SOPA DE LETRAS");
        System.out.println("Ingrese 5 palabras para rellenar la sopa de letras.");
        System.out.println("Min: 3 caracteres / Max: 5 caracteres");

        rellenarMatriz(sopaDeLetras);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Palabra #" + (i + 1));
            palabra = leer.nextLine();

            random1 = (int) (Math.random() * 20);
            random2 = (int) (Math.random() * 15);

            for (int j = 0; j < palabra.length(); j++) {
                sopaDeLetras[random1][random2++] = palabra.substring(j, j + 1);
            }
        }
        imprimirMatriz(sopaDeLetras);
    }

    public static void rellenarMatriz(String[][] matriz) {

        byte random;
        String cadena;
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                    random = (byte) (Math.random() * 10);
                    cadena = Byte.toString(random);
                    matriz[i][j] = cadena;
                }
            }
        }

    public static void imprimirMatriz(String[][] matriz) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
    }
}
