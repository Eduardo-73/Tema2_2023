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
public class Ej3 {

    /**
     * En una empresa de fabricacion y produccion el presupuesto de la empresa
     * se reparte en 40%RH 30%PROD 30%FAB
     */
    public static void main(String[] args) {
        int presupuesto = Integer.parseInt(JOptionPane.showInputDialog(
                "Introduce el presupuesto de la empresa"));
        final double RH = 0.4, PROD = 0.3, FAB = 0.3;
        double presuRh = presupuesto * RH;//Recursos Humanos
        double presuProd = presupuesto * PROD;//Producción
        double presuFab = presupuesto * FAB;//Fabricación
        JOptionPane.showMessageDialog(null,
                """
              De %d € que tiene de presupuesto la empresa, van destinados hacia:
              ***************************************************************
              Recursos Humanos: %.2f%%
              Producción: %.2f%% 
              Fabricacion: %.2f%%
              ***************************************************************
             """.formatted(presupuesto,
                        presuRh, presuProd, presuFab));
    }
}
