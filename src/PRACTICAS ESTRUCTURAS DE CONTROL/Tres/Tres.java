/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tres;

import javax.swing.JOptionPane;

/**
 *
 * @author Gala
 */
public class Tres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = Integer.valueOf(JOptionPane.showInputDialog("Ingrese el numero"));
        if (n >= 0) {
            JOptionPane.showMessageDialog(null, "El número es positivo");
        } else {
            JOptionPane.showMessageDialog(null, "El número es negativo");
        }
    }

}
