/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seis;

import javax.swing.JOptionPane;

/**
 *
 * @author Gala
 */
public class Seis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = Integer.valueOf(JOptionPane.showInputDialog("Ingrese la coordenada x"));
        int y = Integer.valueOf(JOptionPane.showInputDialog("Ingrese la coordenada y"));
        if (x > 0) {
            if (y > 0) {
                JOptionPane.showMessageDialog(null, "cuadrante II");
            } else {
                JOptionPane.showMessageDialog(null, "cuadrante IV");
            }
        } else {
            if (y > 0) {
                JOptionPane.showMessageDialog(null, "cuadrante I");
            } else {
                JOptionPane.showMessageDialog(null, "cuadrante III");
            }
        }
    }

}
