package JAVA_2.EVA2_17_ENCONTRAR_NUMERO;

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
        int iNumeAlea = (int)(Math.random() * 10) +1;
        //System.out.println(iNumeAlea);
        for (int i = 0 ; i < 3; i++) {
            System.out.println("Adivina un nuemro");
            int iNume = input.nextInt();
            if(iNume == iNumeAlea) {
                System.out.println("Felicidades , ganaste");
            }
            if (i == 2) {              
              System.out.println("Lo bueno es que ahí salud");
            }
        }
        
    }
    
}
