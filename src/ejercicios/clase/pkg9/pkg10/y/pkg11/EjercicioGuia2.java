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
public class EjercicioGuia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String[] equipo = new String[12];
        
        System.out.println("Ingrese los nombres de sus compañeros de equipo uno por uno:");
        
        for(int i = 0; i < 12; i++){
            
            System.out.println("Nombre #" + (i+1));
            equipo[i] = leer.nextLine();
            
        }

        for(int i = 0; i < 12; i++){
            
            System.out.println(equipo[i]);
            
        }
        
    }

}
