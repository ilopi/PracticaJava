package Mooc.fi;// Importamos la clase Scanner del paquete java.util
// Scanner nos permite leer datos que escribe el usuario por teclado
import java.util.Scanner;

// Declaramos una clase pública llamada 'Mooc.fi.Mensaje'
public class Mensaje {

    // Punto de entrada del programa
    public static void main(String[] args) {

        // Creamos un objeto Scanner para leer desde la entrada estándar (el teclado)
        Scanner scanner = new Scanner(System.in);

        // Mostramos un mensaje en pantalla pidiendo al usuario que escriba algo
        System.out.println("¿Cómo te llamas? " + "¡Dímelo!");

        // Leemos una línea completa escrita por el usuario y la guardamos en la variable 'message'
        String message = scanner.nextLine();

        // Imprimimos en pantalla el mensaje que escribió el usuario
        System.out.println(message);

        String start = "My name is ";
        String end = ", James Bond";
        System.out.println(start + "Bond" + end);
    }
}
