package Mooc.fi;

import java.util.Scanner;

public class SegundosDia {

    public static void main(String[] args) {

        int a = 2;
        System.out.println(a);

        int b = 4;
        System.out.println(b);

        int sum = a + b;
        System.out.println(sum);

        int parentesis = ( a + b ) * b * ( a + a);
        System.out.println(parentesis);

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos días te gustaría convertir a segundos?");
        int number = Integer.parseInt(scanner.nextLine());
        int segun = number * 86400;
        System.out.println(segun + " segundos hay en " + number + " días");

    }
}
