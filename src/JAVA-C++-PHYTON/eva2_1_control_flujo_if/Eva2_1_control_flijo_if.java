/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_control_flijo_if;

import java.util.Scanner;

/**
 *
 * Elena Guadalupe Diaz Lopez #18550623
 *
 */
public class Eva2_1_control_flijo_if {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Que calificacion esperas para fundamentos de programacion");
        double rCalificacion;

        rCalificacion = input.nextDouble();
        System.out.println("Tu calificacion es");
        System.out.println(rCalificacion);
        if (rCalificacion >= 70) {
            System.out.println("Ya pasaste");
        } else {
            System.out.println("No pasaste");
        }
    }
}
