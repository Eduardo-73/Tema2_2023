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
public class Ej5 {

    /**
     * Empresa de partinetes 0,21 Servicio 0,15 min Cuando acabo el viaje hay un
     * retargo de un 21% IVA
     */
    public static void main(String[] args) {

        final double SERVICIO = 0.21, MIN_SERV = 0.15, IVA = 0.21;

        double tiempoViaje = Double.parseDouble(JOptionPane.showInputDialog(
                "¿Cuánto ha durado el viaje en patinete?"));

        double total = (tiempoViaje * MIN_SERV) + SERVICIO;
        double recargo = total * IVA;

        JOptionPane.showMessageDialog(null, """
                El total ha sido %.2f €
                Y el recargo del 21%% %.2f%%   
                """.formatted(total, recargo));
    }
}
