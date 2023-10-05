/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntes;

/**
 *
 * @author edu
 */
public class OperacionesAritmeticas {

    public static void main(String[] args) {
        int a = 12;
        int b = 5;
        int suma = a + b;
        System.out.println("Suma " + suma);
        int resta = a - b;
        System.out.println("Resta " + resta);
        int producto = a * b;
        System.out.println("Multiplicación " + producto);
        int division = a / b;
        System.out.println("División " + division);
        int resto = a % b;//Operador resto o módulo
        //Devuelve el valor del resto de una división entera
        System.out.println("Resto " + resto);
    }
}
