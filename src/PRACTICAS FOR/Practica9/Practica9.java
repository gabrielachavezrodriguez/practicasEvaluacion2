/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica9;

/**
 *
 * @author Gala
 */
public class Practica9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sumatoria = 0;
        for (int i = 1; i < 101; i++) {
            sumatoria += i;
            System.out.println(i);
        }
        System.out.println("Sumatoria = " + sumatoria);
    }

}
