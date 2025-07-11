import java.util.Scanner;

public class Bucles {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in); // Creamos un lector para la entrada por teclado

        int number = 0; // Contador de cuántos números se han introducido
        int suma = 0; // Variable para acumular la suma de los números

        // Bucle infinito: se repetirá hasta que hagamos 'break'
        while (true) {

            // Si ya se han introducido 5 números, salimos del bucle
            if (number == 5) {
                break;
            }

            System.out.println("Escribe un número: ");

            // Leemos el número, lo convertimos a entero y lo sumamos a la variable 'suma'
            suma = suma + Integer.parseInt(reader.nextLine());

            // Aumentamos el contador para llevar la cuenta de cuántos números llevamos
            number = number + 1;
        }

        // Cuando salimos del bucle, mostramos la suma total de los 5 números introducidos
        System.out.println("La suma de los números es " + suma); 
    }
}