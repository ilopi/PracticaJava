import java.util.Scanner;

public class Saludo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuál es tu nombre? ");

        String primero = scanner.nextLine();

        System.out.println("Hola " + primero + ", qué tal estás?");

        String segundo = scanner.nextLine();

        System.out.println("¡No me digas! ¿Y sigues trabajando en aquel sitio?");

        String tercero = scanner.nextLine();

        System.out.println("¿" + tercero + "?" + " ¿Prefieres el teletrabajo o la presencialidad?");

        String cuarto = scanner.nextLine();

        System.out.println("¿Acabas de decir: " + cuarto + "?" + " ¡Qué locura amigo!");
    }
}
