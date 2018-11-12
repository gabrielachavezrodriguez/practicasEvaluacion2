package JAVA_2.EVA2_22_ADIVINA_NUME_WHILE;

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
        System.out.println("Tienes que adivinar el numero");
        int iRam = (int)(Math.random() * 10) +1;
        System.out.println(iRam);
        int iNum =11;
        while(iRam != iNum){
            
            System.out.println("Dame un nuemro");
            iNum= input.nextInt();
            System.out.println("Elige otro nuemro");
        }
        
    }
    
}
