import java.util.Scanner;

public class JavaPDF2 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in); // Crear lector para entrada por consola

        // ───────────────────────────────
        // 1. CONDICIONALES: if - else if - else
        // ───────────────────────────────
        System.out.println("Escribe tu edad: ");
        int edad = Integer.parseInt(reader.nextLine()); // Leer edad desde consola

        // Condicionales anidados para clasificar por edades
        if (edad < 13) {
            System.out.println("Eres un niño.");
        } else if (edad < 18) {
            System.out.println("Eres un adolescente.");
        } else if (edad < 65) {
            System.out.println("Eres un adulto.");
        } else {
            System.out.println("Eres una persona mayor.");
        }

        // ───────────────────────────────
        // 2. SWITCH: Menú de opciones
        // ───────────────────────────────
        System.out.println("Escribe un número (1, 2 o 3): ");
        int opcion = Integer.parseInt(reader.nextLine()); // Leer opción

        // Estructura switch para manejar varias opciones
        switch (opcion) {
            case 1:
                System.out.println("Has elegido la opción 1: Ver perfil.");
                break;
            case 2:
                System.out.println("Has elegido la opción 2: Editar perfil.");
                break;
            case 3:
                System.out.println("Has elegido la opción 3: Cerrar sesión.");
                break;
            default:
                System.out.println("Opción no válida. Intenta de nuevo.");
        }

        // ───────────────────────────────
        // 3. OPERADOR TERNARIO
        // ───────────────────────────────

        // ✔️ Ejemplo 1: Mayoría de edad
        int edad2 = 20;

        // Si edad2 >= 18 → "mayor de edad", si no → "menor de edad"
        String mensaje = (edad2 >= 18) ? "Eres mayor de edad." : "Eres menor de edad.";
        System.out.println(mensaje);

        // ✔️ Ejemplo 2: Número par o impar
        int numero = 7;

        // Si es divisible entre 2 → par, si no → impar
        String tipo = (numero % 2 == 0) ? "par" : "impar";
        System.out.println("El número es " + tipo);

    }
}
