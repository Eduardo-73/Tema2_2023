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
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce los diámetros de tu casa");
        System.out.print("Introduce la base: ");
        double base = teclado.nextDouble();
        System.out.print("Introduce la altura: ");
        double altura = teclado.nextDouble();
        System.out.print("Introduce la altura del tejado: ");
        double tejado = teclado.nextDouble();
        double area = ((base * tejado / 2)) + (base + altura);
        System.out.printf("El area de tu casa es de: %.2f m2\n", area);
        final double PRECIO = 7.25;
        double resultado = area * PRECIO;
        System.out.printf("El precio de pintar la casa es: %.2f€",
                resultado);

    }
}
