/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

/**
 *
 * @author Gala
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + 1);
        }
        for (int i = 0; i < 100; i++) {
            if (i > 0) {
                System.out.print(" - ");
            }
            System.out.print(i + 1);
        }
        System.out.println("");
    }

}
