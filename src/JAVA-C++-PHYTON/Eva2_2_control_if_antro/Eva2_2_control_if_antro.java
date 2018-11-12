/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_2_control_if_antro;

import java.util.Scanner;

/**
 *
 * @author GABRIELA CHAVEZ
 */
public class Eva2_2_control_if_antro {

    /**
     * @param args the command line arguments
     */
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Cual es tu edad?");
        int iEdad;
        
        iEdad = input.nextInt();
        if (iEdad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }
        System.out.println("Cual es tu edad?");
        
        iEdad = input.nextInt();
        if (iEdad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }

    }
    
}
