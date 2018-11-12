package JAVA_2.EVA2_18_FOR_ANIDADO;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabriela celeste chavez rodriguez
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int i = 0;
        int iCont = 0;
        for ( i= 1; i <= 10 ; i++) {
            for ( int j = 1; j <= 10; j++) {
                 System.out.println( i + "," + j);
                iCont++;
                
            }
        }
        System.out.println(iCont);
    }
    
}
