/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_control_if_antro_2;

import java.util.Scanner;

/**
 *
 * @authorGABRIELA CHAVEZ
 */
public class Eva2_3_control_if_antro_2 {

    /**
     * @param args the command line arguments
     */
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Tienes INE?");
        boolean bINE;
        
        bINE = input.nextBoolean();
        if (bINE == true) {
            System.out.println("SI TIENES INE");
        } else {
            System.out.println("NO TIENES INE");
        }
    }
    }
    

