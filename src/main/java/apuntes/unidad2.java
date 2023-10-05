/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package apuntes;

import java.util.Scanner;

/**
 *
 * @author edu
 */
public class unidad2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Usuario introduce tu nombre: ");
        //Lee un texto desde el teclado 
        //El método next lee una palabra
        String nombre = teclado.nextLine();
        System.out.println("Tu nombre es: " + nombre);
        System.out.print("Introduce tu primer apellido: ");
        //Next solo coge la primera paralbra
        String apellido1 = teclado.next();
        System.out.println("Tu apellido es: " + apellido1);
        //Cadena de texto
        //Declaración de variable e inicialización en la misma línea
//        String nombre = "Pepito de los palotes";
//        String apellido;
//        apellido = "Grillo";
//
//        System.out.print(nombre);
//        System.out.print(" ");
//        System.out.print(apellido);
//        
//        //Salto de líneas
//        System.out.println("");
//        System.out.println(nombre + "" + apellido);
//        
//        //Text block 
//        //Permite formatear texto en vaias líneas
//        String bloqText = """
//                          Clase de DAW
//                          21 de sep 2023
//                          """;
//                          
//        System.out.println(bloqText);
//        
//        int edad = 25;
//        System.out.println("La edad de " + nombre + " es de " + edad + " años");
//        
//        float estatura = 1.80f;
//        int estaturaEnCm = 180;
//        double peso = 95.4;
//        
//        System.out.println("Estatura " + estatura + " peso: " + peso);
//        System.out.println("---------------------------");
//        System.out.println(     """
//                                Soy pepito 
//                                de los palotes
//                                peso %.2f y mido %.2f
//                                """.formatted(peso,estatura));
//        
//        System.out.println("------------------------------");
//        //Blanco es true o SI y Negro es false o NO
//        boolean blancoNegro = true;
//        System.out.println("Es el valor blanco? " + blancoNegro);

        //Pedir datos al usuario por teclado 
        System.out.println("¿Cuánto pesas? ");
        double peso = teclado.nextDouble();
        System.out.println("Tu peso es: " + peso);
        //Cuando pasas de número a pedir de nuevo una palabra tienes que 
        //poner un nextLine
        teclado.nextLine();
        System.out.print("Dame tu segundo apellido: ");
        String apellido2 = teclado.next();
        
        
        String bloq =   """
                        Nombre: %s
                        Apellido: %s
                        Sugundo Apellido: %s
                        Peso: %.2f
                        """.formatted(nombre,apellido1,apellido2,
                                peso);
        System.out.println(bloq);
  
        //Pasar de String a int
        System.out.println("Introduce la estatura (cm): ");
        String estaturaTexto = "23";
        int estatura = Integer.parseInt(estaturaTexto);
        System.out.println("Estatura: " + estatura);
        
        //Calculo del IMC
        double imc = (peso/(Math.pow(estatura, 2)));
        System.out.println(imc);
        
        System.out.println("PI " + Math.PI);
        
        
        
    }
}
