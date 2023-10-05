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
public class Ej1 {

    /*Necesito crear un programa que me pida cuantas horas trabaja a la semana 
    un medico.
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuántas horas trabaja un medico a la semana? ");
        int horasMedico = teclado.nextInt();
        final int HORASTOTALSEMANA = 24 * 7;
        int numMed = HORASTOTALSEMANA / horasMedico;
        System.out.printf("Se necesitan %.0f medicos a la semana",
                Math.ceil(numMed));
    }
}
