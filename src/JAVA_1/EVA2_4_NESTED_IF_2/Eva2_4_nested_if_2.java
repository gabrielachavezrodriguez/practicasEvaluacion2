/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA_1.EVA2_4_NESTED_IF_2;

import java.util.Scanner;

/**
 *
 * GABRIELA CHAVEZ RODRIGUEZ
 */
public class Eva2_4_nested_if_2 {

    /**
     * @param args the command line arguments
     */
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("CUAL ES TU CALIFICACION?");
        int iCalifa;
        
        iCalifa = input.nextInt();
        if (iCalifa == 100) {
            System.out.println("Tienes A");
        } else {
            if (iCalifa >= 90) {
                System.out.println("Tienes B");
            } else {
                if (iCalifa >= 80) {
                    System.out.println("Tienes C");
                } else {
                    if (iCalifa >= 70) {
                        System.out.println("Tienes D");
                    } else {
                        if (iCalifa >= 60) {
                            System.out.println("Tienes F");
                        } else {
                            System.out.println("Calificacion fuera de Rango");
                        }
                    }
                }
            }
        }
    }
    }
    

