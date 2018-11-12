/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siete;

import javax.swing.JOptionPane;

/**
 *
 * @author Gala
 */
public class Siete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int temp = Integer.valueOf(JOptionPane.showInputDialog("Ingrese la temperatura en grados centigrados"));
        if (temp < 0) {
            JOptionPane.showMessageDialog(null, "Freezing weather");
        } else if (temp < 11) {
            JOptionPane.showMessageDialog(null, "Very Cold weather");
        } else if (temp < 21) {
            JOptionPane.showMessageDialog(null, "Cold weather");
        } else if (temp < 31) {
            JOptionPane.showMessageDialog(null, "Normal in Temp");
        } else if (temp < 41) {
            JOptionPane.showMessageDialog(null, "Its Hot");
        } else if (temp < 51) {
            JOptionPane.showMessageDialog(null, "Its Very Hot");
        }
    }

}
