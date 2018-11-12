package JAVA_2.EVA2_21_WHILE_COMO_FOR;

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
        for ( int i = 1; i <=10; i++) {
            System.out.print(i +" - ");
        }
        System.out.println("");
        int iWhile = 1;
        while (iWhile <=10){
            System.out.print(iWhile+" + ");
            iWhile++;
            
        }
    }
    
}
