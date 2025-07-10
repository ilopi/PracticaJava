import java.util.Scanner;

public class ImpuestoDonaciones {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        while (true) { // Pregunta de nuevo

            System.out.println("Escribe el valor del regalo: ");

            double valor = Integer.parseInt(reader.nextLine());

            if (valor == 0) {
                System.out.println("Programa finalizado.");
                break;
            } // Condición para salir del programa

            double impuesto = 0;

            if (valor < 5000) {
                System.out.println("No hay impuestos.");
                break; // Sale del programa
            }

            if (valor < 25000) {
                impuesto = 100 + (valor - 5000) * 0.08;
            } else if (valor < 55000) {
                impuesto = 1700 + (valor - 25000) * 0.10;
            } else if (valor < 200000) {
                impuesto = 4700 + (valor - 55000) * 0.12;
            } else if (valor < 1000000) {
                impuesto = 22100 + (valor - 200000) * 0.15;
            } else {
                impuesto = 142100 + (valor - 1000000) * 0.17;
            }

            System.out.println("Los impuestos son de " + impuesto + " euros");
        }
    }
}