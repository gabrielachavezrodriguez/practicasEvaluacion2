/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica11;

import javax.swing.JOptionPane;

/**
 *
 * @author Gala
 */
public class Practica11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = Integer.valueOf(JOptionPane.showInputDialog("Ingrese un numero"));
        for (int i = 1; i < 101; i++) {
            if (i % n != 0) {
                System.out.println(i);
            }
        }
    }

}
