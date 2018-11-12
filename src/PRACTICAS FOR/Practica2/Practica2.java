/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import javax.swing.JOptionPane;

/**
 *
 * @author Gala
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = Integer.valueOf(JOptionPane.showInputDialog("Ingrese el numero de repeticiones"));
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + " Gabriela Chavez");
        }
    }

}
