import java.util.Scanner;

public class masCondiciones {

    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        boolean isLessThan = a < b;

        if (isLessThan) {
            System.out.println("1 es menor que 3");
        }

        Scanner reader = new Scanner(System.in);

        System.out.println("Escribe un número: ");

        int number = Integer.parseInt(reader.nextLine());
        int divisible = number % 400;

        if (divisible == 0) {
            System.out.println("El número " + number + " es divisible por 400");
        } else {
            System.out.println("El número " + number + " no es divisible por 400");
            System.out.println("El resto es " + divisible);
        }

        System.out.println("Introduce el primer String");
        String first = reader.nextLine();
        System.out.println("Introduce el segundo String");
        String second = reader.nextLine();

        if (first.equals(second)) { // Aquí no se pone ==
            System.out.println("Mismo String");
        } else {
            System.out.println("Diferentes String");
        }


        System.out.println("Escribe un String");
        String input = reader.nextLine();

        if (input.equals("un string")) { // Comprueba si lo que el usuario escribió fue exactamente esto
            System.out.println("¡Correcto!");
        } else {
            System.out.println("¡Incorrecto!");
        }
    }
}