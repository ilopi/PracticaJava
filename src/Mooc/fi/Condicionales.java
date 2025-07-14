package Mooc.fi;

import java.util.Scanner;

public class Condicionales {

    public static void main(String[] args) {

        System.out.println("Hello, world!");
        if (true) {
            System.out.println("Este código es inevitable");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un número: ");

        String numero = scanner.nextLine();

        int numeroBien = Integer.parseInt(numero); // Conversion

        if (numeroBien > 10) {

            System.out.println("El número es mayor de 10");
        } else if (numeroBien == 10) {
            System.out.println("El número es 10");
        } else if (numeroBien < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es menor de 10");
        }

        System.out.println("Escribe tu edad: ");

        String edad = scanner.nextLine();

        int edadBien = Integer.parseInt(edad); // Conversion

        if (edadBien > 18 && edadBien < 30) {
            System.out.println("Eres joven");
        } else if (edadBien < 18 && edadBien >= 0) {
            System.out.println("Eres pequeño");
        } else if (edadBien >= 30) {
            System.out.println("Eres muy maduro para tu edad");
        } else {
            System.out.println("Eso es mentira");
        }
        // || Esto es un 'o'.
        // !(number > 4) Esto es una negación. También '!='.
    }
}
