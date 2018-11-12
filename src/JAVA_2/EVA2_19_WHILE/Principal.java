package JAVA_2.EVA2_19_WHILE;
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
        String sCade ="";
        while (!sCade.equals("x")||sCade.equals("X") ){
            System.out.println("Introduce un mensaje (X para salir)");
            sCade = input.nextLine();
            System.out.println("Tu mensaje: "+ sCade);
        }
    }
    
}
