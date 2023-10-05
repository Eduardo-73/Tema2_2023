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
public class Ej1JP {

    public static void main(String[] args) {

        int horasMedico = Integer.parseInt(JOptionPane.showInputDialog(
                "Cuántas horas trabaja un medico a la semana? "));
        final int HORAS_TOTAL_SEMANA = 24 * 7;
        double numMed = HORAS_TOTAL_SEMANA / horasMedico;
        JOptionPane.showMessageDialog(null, """
                             Se necesitan %.0f medicos a la semana
                                       """.formatted(Math.ceil(numMed)));

    }
}
