/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntes;

/**
 *
 * @author edu
 */
public class OperadoresUnarios {

    public static void main(String[] args) {
        int a = 12;
        int b = 7;

        //Suman uno al valor de la variable que acompaña
        a++; //Se usa el valor de la variable y al terminar la instrucción completa se suma 1
        ++a; //Se suma 1 y luego se usa el valor en la instrucción

        System.out.println("a vale -> " + a);

        //Resta uno al valor de la variable que acompaña
        a--;
        --a;

        System.out.println("a vale -> " + a);
        System.out.println("a vale -> " + (++a));
        System.out.println("a vale -> " + (a++));
        System.out.println("a vale -> " + a);

        //Operadores autoasignación
        b = b + 3;
        b += 3;

        System.out.println("b vale " + b);

        b *= 2; // b = b * 2
        b -= 4; // b = b - 4
        b /= 6; // b = b / 6

        System.out.println("a: " + a + " b: " + b);

        int aux;
        aux = a;
        b = aux;
        System.out.println("a: " + a + " b: " + b);

    }
}
