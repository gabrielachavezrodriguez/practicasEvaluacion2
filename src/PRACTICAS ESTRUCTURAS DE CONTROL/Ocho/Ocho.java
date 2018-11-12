/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocho;

import javax.swing.JOptionPane;

/**
 *
 * @author Gala
 */
public class Ocho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int l1 = Integer.valueOf(JOptionPane.showInputDialog("Ingrese el valor del lado 1 en cm"));
        int l2 = Integer.valueOf(JOptionPane.showInputDialog("Ingrese el valor del lado 2 en cm"));
        int l3 = Integer.valueOf(JOptionPane.showInputDialog("Ingrese el valor del lado 3 en cm"));
        if (l1 == l2 && l1 == l3) {
            JOptionPane.showMessageDialog(null, "El triangulo es equilátero");
        } else if (l1 == l2 || l1 == l3) {
            JOptionPane.showMessageDialog(null, "El triangulo es isósceles");
        } else {
            JOptionPane.showMessageDialog(null, "El triangulo es escaleno");
        }
    }

}
