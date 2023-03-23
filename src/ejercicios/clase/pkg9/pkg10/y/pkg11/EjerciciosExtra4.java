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
public class EjerciciosExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int trabajoPractico1;
        int trabajoPractico2;
        int integrador1;
        int integrador2;
        double[] vector = new double[10];

        System.out.println("Bienvenido al sistema de notas de Egg!");
        System.out.println("Las notas ingresadas seran entre 1 y 10.");

        for (int i = 0; i < 10; i++) {

            System.out.println("Ingrese las notas del alumno #" + (i + 1) + ":");

            System.out.println("Primer trabajo practico:");
            trabajoPractico1 = leer.nextInt();
            while (trabajoPractico1 > 10 || trabajoPractico1 < 1) {
                System.out.println("Nota ingresada invalida. Intentelo de nuevo:");
                trabajoPractico1 = leer.nextInt();
            }
            System.out.println(" ");

            System.out.println("Segundo trabajo practico:");
            trabajoPractico2 = leer.nextInt();
            while (trabajoPractico2 > 10 || trabajoPractico2 < 1) {
                System.out.println("Nota ingresada invalida. Intentelo de nuevo:");
                trabajoPractico2 = leer.nextInt();
            }
            System.out.println(" ");

            System.out.println("Primer integrador:");
            integrador1 = leer.nextInt();
            while (integrador1 > 10 || integrador1 < 1) {
                System.out.println("Nota ingresada invalida. Intentelo de nuevo:");
                integrador1 = leer.nextInt();
            }
            System.out.println(" ");

            System.out.println("Segundo integrador:");
            integrador2 = leer.nextInt();
            while (integrador2 > 10 || integrador2 < 1) {
                System.out.println("Nota ingresada invalida. Intentelo de nuevo:");
                integrador2 = leer.nextInt();
            }
            System.out.println(" ");

            vector[i] = trabajoPractico1 * 0.1 + trabajoPractico2 * 0.15 + integrador1 * 0.25 + integrador2 * 0.5;

        }

        imprimirVector(vector);

        int aprobados = 0;
        int desaprobados = 0;

        for (int i = 0; i < 10; i++) {
            if (vector[i] >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }

        System.out.println("RESULTADOS:");
        System.out.println("Cantidad de alumnos aprobados: " + aprobados);
        System.out.println("Cantidad de alumnos desaprobados: " + desaprobados);

    }

    public static void imprimirVector(double[] vector) {
        for (int i = 0; i < 10; i++) {
            System.out.print("[" + vector[i] + "] ");
        }
    }
}
