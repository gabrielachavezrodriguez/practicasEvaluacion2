package JAVA_1.EVA2_7_DIAS_SEMANA;

import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @GABRIELA CHAVEZ RODRIGUEZ
 */
public class EVA2_7_DIAS_SEMANA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa el numero del dia");
        int iDias;
        iDias = input.nextInt();
        switch(iDias){
            case 1: System.out.println("Domingo");
            break;
            case 2: System.out.println("Lunes");
            break;
            case 3: System.out.println("Martes");
            break;
            case 4: System.out.println("Miercoles");
            break;
            case 5: System.out.println("Jueves");
            break;
            case 6: System.out.println("Viernes");
            break;
            case 7: System.out.println("Sabado");
            break;
            default: System.out.println("ya no hay mas dias");
                
                    }
    
}
}
