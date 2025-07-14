package Mooc.fi;

import java.util.Scanner;

public class VariasVariables {

    public static void main(String[] args) {

        String text = "Atento a los datos: ";
        int months = 12;
        double temperatura = 38.5;
        boolean tof = true;

        System.out.println(text + "Meses: " + months + "; Temperatura: " + temperatura + "; Booleano: " + tof);

        int number = 123;
        System.out.println("El valor de la variable es " + number);

        number = 42;
        System.out.println("Pero ahora es " + number);

        double a = 3.14;
        double b = 5.5;
        double c = 8.1;
        double multi = a * b * c;

        System.out.println("La suma de a b c es " + multi);

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuál es tu edad? ");

        String edad = scanner.nextLine();

        int edadEntero = Integer.parseInt(edad); // Conversion

        int suma = edadEntero + 2;

        System.out.println("Dentro de 2 años tendrás " + suma);

    }
}
