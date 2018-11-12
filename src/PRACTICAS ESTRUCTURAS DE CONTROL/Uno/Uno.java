/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

import javax.swing.JOptionPane;

/**
 *
 * @author Gala
 */
public class Uno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 = Integer.valueOf(JOptionPane.showInputDialog("Ingrese el primer numero"));
        int n2 = Integer.valueOf(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        if (n1 == n2) {
            JOptionPane.showMessageDialog(null, "El número 1 y el número 2 son iguales");
        } else {
            JOptionPane.showMessageDialog(null, "El número 1 y el número 2 no son iguales");
        }
    }

}
