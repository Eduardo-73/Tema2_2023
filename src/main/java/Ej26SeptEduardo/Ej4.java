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
public class Ej4 {

    /**
     * 3 amigos montan una empresa cada uno mete un dinero ¿Que porcentaje de
     * participacion tienen en la empresa cada uno?
     */
    public static void main(String[] args) {
        int amigo1 = Integer.parseInt(JOptionPane.showInputDialog(
                "¿Cuanto dinero añade en la empresa el amigo 1?"));
        int amigo2 = Integer.parseInt(JOptionPane.showInputDialog(
                "¿Cuanto dinero añade en la empresa el amigo 2?"));
        int amigo3 = Integer.parseInt(JOptionPane.showInputDialog(
                "¿Cuanto dinero añade en la empresa el amigo 3?"));
        double cantidadTotal = amigo1 + amigo2 + amigo3;
        double porcAmig1 = (amigo1 / cantidadTotal) * 100;
        double porcAmig2 = (amigo2 / cantidadTotal) * 100;
        double porcAmig3 = (amigo3 / cantidadTotal) * 100;
        JOptionPane.showMessageDialog(null,
                """
                ---------------------------------------------------------------
                 De la cantidad total de %.2f €
                 El porcentaje de participación del amigo 1 es de: %.2f%%
                 El porcentaje de participación del amigo 2 es de: %.2f%%
                 El porcentaje de participación del amigo 3 es de: %.2f%%
                ---------------------------------------------------------------
                                            """.formatted(cantidadTotal,
                        porcAmig1, porcAmig2, porcAmig3));
    }
}
