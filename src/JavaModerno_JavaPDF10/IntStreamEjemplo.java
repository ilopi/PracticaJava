package JavaModerno_JavaPDF10;

import java.util.stream.IntStream; // ✅ Importamos la clase IntStream correcta
import java.util.IntSummaryStatistics; // Para las estadísticas, si luego lo usas

public class IntStreamEjemplo {

    /*
     * IntStream es una variante especializada de Stream
     * para trabajar con enteros primitivos (int).
     * Permite usar métodos como sum(), average(), range(), etc.
     */

    public static void main(String[] args) {

        // range() genera un stream de 1 a 4 (el 5 no se incluye)
        System.out.println("Con IntStream.range:");
        IntStream.range(1, 5)
                .forEach(System.out::println);

        // rangeClosed() incluye el último número
        System.out.println("Con IntStream.rangeClosed:");
        IntStream.rangeClosed(1, 5)
                .forEach(System.out::println);

        // sum() calcula la suma de todos los números del stream
        int total = IntStream.rangeClosed(1, 100).sum();
        System.out.println("Suma del 1 al 100: " + total);  // 5050

        // reduce() acumula la suma manualmente
        int resultado = IntStream.range(1, 6)
                .reduce(0, (a, b) -> a + b);  // 1+2+3+4+5 = 15
        System.out.println("Resultado con reduce: " + resultado);
    }
}

