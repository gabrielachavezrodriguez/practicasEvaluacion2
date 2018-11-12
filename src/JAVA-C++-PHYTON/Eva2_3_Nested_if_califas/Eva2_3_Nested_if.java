/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_nested_if;

import java.util.Scanner;

/**
 *
 * GABRIELA CHAVEZ
 * 
 */
public class Eva2_3_Nested_if {

    /**
     * @param args the command line arguments
     */
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Cual es tu calificacion?");
        int iCalifa;
        
        iCalifa = input.nextInt();
        if (iCalifa == 100) {
            System.out.println("Tienes una A");
        } else {
            if (iCalifa == 90) {
                System.out.println("Tienes una B");
            } else {
                if (iCalifa == 80) {
                    System.out.println("Tienes una C");
                } else {
                    if (iCalifa == 70) {
                        System.out.println("Tienes una D");
                    } else {
                        if (iCalifa == 60) {
                            System.out.println("Tienes una F");
                        } else {
                            System.out.println("Calificacion fuera de rango");
                        }
                    }
                }
            }
        }
    }
    }
    

