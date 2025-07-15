package JavaModerno_JavaPDF10;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lambda_InterfacesFuncionales {

    public static void main(String[] args) {

        /*
         * Una lambda es como una función corta y sin nombre.
         * (param) -> { cuerpo }
         */

        Consumer<String> saludar = nombre -> System.out.println("Hola " + nombre);
        saludar.accept("Juan");  // Imprime: Hola Juan

        // Versión corta de Lambda:
        List<String> nombres = List.of("Juan", "Ana", "Luis");
        nombres.forEach(System.out::println); // Igual que: p -> System.out.println(p)


        /*
         * Una interface funcional tiene solo un metodo abstracto.
         */

        @FunctionalInterface
        interface Operacion {
            int aplicar(int a, int b);
        }


        /*
         * Principales interfaces funcionales de Java (en java.util.function):
         * - Consumer<T>
         * - Supplier<T>
         * - Function<T, R>
         * - etc.
         */

        Consumer<String> imprimir = texto -> System.out.println(texto);
        imprimir.accept("Hola mundo");

        Predicate<Integer> mayorDeEdad = edad -> edad >= 18;
        System.out.println(mayorDeEdad.test(20)); // true

    }
}
