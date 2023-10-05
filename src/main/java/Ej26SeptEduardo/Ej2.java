/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej26SeptEduardo;

import java.util.Scanner;

/**
 *
 * @author edu
 */
public class Ej2 {

    /*
    Una vaca de media da 1000L de leche al año y un yogurt son 200ml de leche, 
    quiero saber el numero de vacas 
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuánta vacas tienes?");
        int numVaca = teclado.nextInt();
        final int TOTALLITROS = 1000;
        final double YOGUT = 0.2;
        int totalLeche = numVaca * TOTALLITROS;
        double totalYogurt = totalLeche / YOGUT;
        System.out.printf("Se pueden hacer %.0f yogures",
                Math.floor(totalYogurt));
    }
}
