/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

/**
 *
 * @author Gala
 */
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(100 - i);
        }
        for (int i = 0; i < 100; i++) {
            if (i > 0) {
                System.out.print(" - ");
            }
            System.out.print(100 - i);
        }
        System.out.println("");
    }

}
