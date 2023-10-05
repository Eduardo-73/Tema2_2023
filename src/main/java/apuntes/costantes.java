/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntes;

import java.util.Scanner;

/**
 *
 * @author edu
 */
public class costantes {

    public static void main(String[] args) {

        //Variable de tipo int 
        int numero = 5;
        numero = 4;
        int numero2 = 7;
        numero = numero2;
        numero2 = 9;
        System.out.println("Número: " + numero + "Número 2: " + numero2);
        //Constantes 
        final double EURIBOR = 4.1;
        System.out.println("Euribor: " + EURIBOR);
        //La palabra reservada final implica que la variable pasa a ser una 
        //constante
        //EURIBOR = 4.2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la cantidad de hipoteca: ");
        double importe = teclado.nextDouble();
        System.out.println("El importe es: " + importe);
        teclado.nextLine();//Quita la porquería
        //Forma B
        System.out.println("Introduce la cantidad de hipoteca: ");
        String importeTexto = teclado.nextLine();//Poner número con .
        //Transformo a número el número leído
        float importe3 = Float.parseFloat(importeTexto);
        System.out.printf("La cantidad leída es de %.3f", importe3);
    }
}
