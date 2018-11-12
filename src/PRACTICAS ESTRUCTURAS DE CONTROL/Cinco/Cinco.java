/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinco;

import javax.swing.JOptionPane;

/**
 *
 * @author Gala
 */
public class Cinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 = Integer.valueOf(JOptionPane.showInputDialog("Ingrese el primer numero"));
        int n2 = Integer.valueOf(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        int n3 = Integer.valueOf(JOptionPane.showInputDialog("Ingrese el tercer numero"));
        int n;
        if (n1 > n2) {
            if (n1 > n3) {
                n = n1;
            } else {
                n = n3;
            }
        } else {
            if (n2 > n3) {
                n = n2;
            } else {
                n = n3;
            }
        }
        JOptionPane.showMessageDialog(null, "El número " + n + " es el mayor");
    }

}
