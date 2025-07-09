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

    }
}
