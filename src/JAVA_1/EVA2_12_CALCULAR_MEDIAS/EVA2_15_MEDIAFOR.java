/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA_1.EVA2_12_CALCULAR_MEDIAS;

import java.util.Scanner;

/**
 *
 * @GABRIELA CHAVEZ RODRIGUEZ
 */
public class EVA2_15_MEDIAFOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int iSuma = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Edad" + i + ":");
            iSuma += iSuma + input.nextInt();
            
            
        }
        double dMedia = (float)iSuma / 5;
        System.out.println("La media es " + ((float)iSuma / 5));
        
    }
    
}
