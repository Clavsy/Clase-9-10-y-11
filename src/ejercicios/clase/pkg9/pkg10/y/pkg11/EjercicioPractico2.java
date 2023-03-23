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
public class EjercicioPractico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Dimensione el vector:");
        int n = leer.nextInt();

        int[] vector = new int[n];

        for (int i = 0; i < vector.length; i++) {

            vector[i] = (int) (Math.random() * 10 + 1);

        }

        int num;
        int numerosEncontrados;

        numerosEncontrados = 0;

        System.out.println("Ingrese el numero a buscar en el vector:");
        num = leer.nextInt();

        for (int i = 0; i < vector.length; i++) {

            if (num == vector[i]) {

                numerosEncontrados = numerosEncontrados + 1;
                System.out.println("Numero encontrado!");
                System.out.println("Posicion: " + "[" + i + "]");

            }

        }

        if (numerosEncontrados < 1) {
            System.out.println("No se encontro el numero ingresado.");
        }

    }

}
