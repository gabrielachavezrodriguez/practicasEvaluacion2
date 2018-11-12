package JAVA_2.EVA2_15_MEDIA;

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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int iSuma = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Edad " + i + ":");
            iSuma = iSuma + input.nextInt();
        }
        double dMedia = (float) iSuma / 5;
        System.out.println("La Media es " + dMedia);
    }

}
