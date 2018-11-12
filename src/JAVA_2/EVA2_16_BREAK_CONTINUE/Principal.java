package JAVA_2.EVA2_16_BREAK_CONTINUE;

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
        // for: no manipular la variable contador 
        //Detenerlo cuando el nuemro se divisible entre 5
       // for (int i = 1 ; i <=10; i++) {
           // System.out.println(i);
            //int iResi = i % 5;
            //if (iResi==0)
              //  break; //Ibterrumpe la logica del programa 
                    
            
        //}
        //continue
        // imprimir todos los nuemros que no sean divisible enre 5
        for (int i = 1 ; i <=10; i++) {
            
            int iResi = i % 5;
             if (iResi==0)
                continue;
             System.out.println(i);
        }
    }
    
}
