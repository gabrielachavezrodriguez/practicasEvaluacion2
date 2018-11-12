/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diez;

import javax.swing.JOptionPane;

/**
 *
 * @author Gala
 */
public class Diez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mat = Integer.valueOf(JOptionPane.showInputDialog("Ingrese los puntos en matematicas"));
        int fis = Integer.valueOf(JOptionPane.showInputDialog("Ingrese los puntos en fisica"));
        int quim = Integer.valueOf(JOptionPane.showInputDialog("Ingrese los puntos en quimica"));
        int total = mat + fis + quim;
        if ((mat >= 65 && fis >= 55 && quim >= 50 && total >= 180)
                || (mat >= 65 && total >= 140)) {
            JOptionPane.showMessageDialog(null, "El candidato es elegible para el curso");
        } else {
            JOptionPane.showMessageDialog(null, "El candidato no es elegible para el curso");
        }
    }

}
