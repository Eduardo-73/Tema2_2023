/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej26SeptEduardo;

import javax.swing.JOptionPane;

/**
 *
 * @author edu
 */
public class Ej2Jp {

    public static void main(String[] args) {

        int numVaca = Integer.parseInt(JOptionPane.showInputDialog(
                null, "¿Cuánta vacas tienes?"));
        final int TOTAL_LITROS = 1000;
        final double YOGUT = 0.2;
        int totalLeche = numVaca * TOTAL_LITROS;
        double totalYogurt = totalLeche / YOGUT;
        JOptionPane.showMessageDialog(null,
                "Se pueden hacer %.0f yogures".formatted(
                        Math.floor(totalYogurt)));
    }
}
