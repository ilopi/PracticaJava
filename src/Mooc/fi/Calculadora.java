package Mooc.fi;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Escribe un número: ");

        int numero1 = Integer.parseInt(reader.nextLine());

        System.out.println("Escribe otro número: ");

        int numero2 = Integer.parseInt(reader.nextLine());

        int cuadrado = numero1 * numero1;

        int suma = numero1 + numero2;
        double squareRoot = Math.sqrt(suma); // Raíz cuadrada

        if (numero2 < 0) {
            System.out.printf("\nEl valor abs de " + numero2 + " es " + numero2 * -1);
        } else {
            System.out.println("\nEl valor abs de " + numero2 + " es " + numero2);
        }

        System.out.println("\nEl cuadrado de " + numero1 + " es " + cuadrado);
        System.out.println("\nLa raíz cuadrada de la suma de " + numero1 + " y " + numero2 + " es " + squareRoot);


    }
}
