/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuatro;

import javax.swing.JOptionPane;

/**
 *
 * @author Gala
 */
public class Cuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = Integer.valueOf(JOptionPane.showInputDialog("Ingrese el numero"));
        JOptionPane.showMessageDialog(null, "" + Integer.compare(n, 0));
    }

}
