/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_5_contro_if_antro_final_final;

import java.util.Scanner;

/**
 *
 * @GABRIELA CHAVEZ
 */
public class Eva2_5_contro_if_antro_final_final {

    /**
     * @param args the command line arguments
     */
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Cual es tu edad?");
        int iEdad;
        
        iEdad = input.nextInt();
        System.out.println("Tienes tu INE?");
        boolean bINE;
        
        bINE = input.nextBoolean();
        if (iEdad >= 18 && bINE == true) {
            System.out.println("Entras al antro");
        } else {
            System.out.println("No entrras al antro");
        }
    }
    
}
