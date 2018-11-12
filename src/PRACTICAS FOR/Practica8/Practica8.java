/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica8;

import java.util.Random;

/**
 *
 * @author Gala
 */
public class Practica8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            System.out.println(r.nextInt(100) + 1);
        }
    }

}
