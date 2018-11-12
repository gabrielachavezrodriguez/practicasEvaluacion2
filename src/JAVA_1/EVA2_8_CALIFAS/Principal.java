package JAVA_1.EVA2_8_CALIFAS;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @ACER
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa tu calificacion");
    int iCal;
    iCal = input.nextInt();
    switch(iCal){
        case 100: System.out.println("Sacaste A");
        break;
        case 90: System.out.println("Sacaste B");
        break;
        case 80: System.out.println("Sacaste C");
        break;
        case 70: System.out.println("Sacaste D");
        break;
        case 60: System.out.println("Sacaste F, Ya valiste kk morro menso jaja  xd");
        break;
        default: System.out.println("MEJOR VALLA A VERNDER AVON >:V");
        
    }
    }
    
    }
    

