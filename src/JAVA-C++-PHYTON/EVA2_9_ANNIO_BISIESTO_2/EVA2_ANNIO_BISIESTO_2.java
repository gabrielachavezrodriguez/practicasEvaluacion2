/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_annio_bisiesto_2;

/**
 *
 * @author ACER
 */
public class EVA2_ANNIO_BISIESTO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        int iAño;
        
        iAño = 1996;
        int iResi4;
        int iResi100;
        int iResi400;
        
        iResi4 = iAño % 4;
        iResi100 = iAño % 100;
        iResi400 = iAño % 400;
        if (iResi4 == 0 && (!(iResi100 == 0) || iResi400 == 0)) {
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }
    }
}

    
    

