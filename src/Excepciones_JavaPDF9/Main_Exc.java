package Excepciones_JavaPDF9;

import java.io.*;

public class Main_Exc {

    public static void main(String[] args) throws Exception, MiExcepcion {

        /*
         * Una excepción es un error en tiempo de ejecución.
         * En vez de que el programa se rompa, podemos atrapar ese error y seguir con la ejecución.
         * Usamos tres palabras clave:
         * - try: donde ocurre el posible error.
         * - catch: donde lo atrapamos.
         * - finally: bloque opcional que siempre se ejecuta (haya o no error).
         */

        try {
            int resultado = 10 / 0; // Error: división por cero
        } catch (ArithmeticException e) {
            System.out.println("¡Error! No se puede dividir por cero.");
        } finally {
            System.out.println("Esto siempre se ejecuta.");
        }

        // Excepcion dividir (abajo):
        dividir(5, 0);

        // Mi excepción personalizada (en otra clase):
        int edad = 17;
        if (edad < 18) {
            throw new MiExcepcion("Debes ser mayor de edad.");
        }

    }

    /*
     * Checked vs Unchecked Exceptions:
     * - Checked: Errores previsibles.
     * - Unchecked: Errores de programación.
     * Usamos throws para decir:
     * "este metodo puede lanzar una excepción, quien lo use debe manejarla".
     *
     */

    public static void dividir(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("No se puede dividir por cero");
        }
    }

}
/*
 * try-with-resources (para cerrar archivos automáticamente)
 * Esto se usa cuando estás trabajando con recursos como archivos o conexiones.
 * Java se asegura de cerrarlos.
 */

//static String leerPrimeraLinea(String path) throws IOException {
//    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
//        return br.readLine();
//    }
//}
