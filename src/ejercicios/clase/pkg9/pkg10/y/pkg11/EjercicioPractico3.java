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
public class EjercicioPractico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Dimensione el vector:");
        int n = leer.nextInt();

        int[] vector = new int[n];

        for (int i = 0; i < vector.length; i++) {

            vector[i] = (int) (Math.random() * 99999 + 1);

        }

        int operacion;
        int contador;
        int digitos1 = 0;
        int digitos2 = 0;
        int digitos3 = 0;
        int digitos4 = 0;
        int digitos5 = 0;

        for (int i = 0; i < vector.length; i++) {

            contador = 1;
            operacion = vector[i];

            do {

                if (operacion >= 10) {
                    contador++;
                    operacion = operacion / 10;
                }

            } while (operacion >= 10);

            switch (contador) {
                case 1:
                    digitos1++;
                    break;
                case 2:
                    digitos2++;
                    break;
                case 3:
                    digitos3++;
                    break;
                case 4:
                    digitos4++;
                    break;
                case 5:
                    digitos5++;
                    break;
                default:

            }

        }

        System.out.println("Numeros contados:");
        System.out.println("Con 1 digito  =" + "[" + digitos1 + "]");
        System.out.println("Con 2 digitos =" + "[" + digitos2 + "]");
        System.out.println("Con 3 digitos =" + "[" + digitos3 + "]");
        System.out.println("Con 4 digitos =" + "[" + digitos4 + "]");
        System.out.println("Con 5 digitos =" + "[" + digitos5 + "]");
        
    }

}
