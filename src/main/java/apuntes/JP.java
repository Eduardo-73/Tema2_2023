/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntes;

import javax.swing.JOptionPane;

/**
 *
 * @author edu
 */
public class JP {

    public static void main(String[] args) {
        //IMC de una persona
        /**
         * showInputDialog es un método estático que muestra un mensaje y un
         * textArea para introducir información Devuelve lo que se teclea en un
         * String
         */
        String nombre = JOptionPane.showInputDialog("¿Cómo te llamas?");
        System.out.println("El nombre es " + nombre);
        JOptionPane.showMessageDialog(null, "Te llamas "
                + nombre);
        String estaturaTexto = JOptionPane.showInputDialog("Introduce tu "
                + "estatura (m) ");
        double estatura = Double.parseDouble(estaturaTexto);
        JOptionPane.showMessageDialog(null, "Estatura " 
                + estatura);
        String pesoTexto = JOptionPane.showInputDialog("Introduce el "
                + "peso (Kg)");
        double peso = Double.parseDouble(pesoTexto);
        JOptionPane.showMessageDialog(null, "Peso " + peso);
        double imc = peso/Math.pow(estatura, 2);
        
        String resultado = """
                           Te llamas %s
                           Tu estatura %.2f
                           Tu peso %.2f
                           Tu IMC %.2f
                           """.formatted(nombre,estatura,peso,
                                   imc);
        JOptionPane.showMessageDialog(null, resultado);
    }
}
