package JavaModerno_JavaPDF10;

import java.util.ArrayList;
import java.util.List;

public class Genericos2 {

    // Metodo genérico que convierte un array de cualquier tipo T en una lista de ese mismo tipo T
    public static <T> List<T> fromArrayToList(T[] array) {
        List<T> lista = new ArrayList<>();
        for (T t : array) {
            lista.add(t); // Añadimos cada elemento del array a la lista
        }
        return lista; // Devolvemos la lista completa
    }

    public static void main(String[] args) {

        // Creamos un array de Strings
        String[] textos = {"Hola ", "Mundo", "!!!"};

        // Convertimos el array a lista usando el método genérico
        List<String> listaTextos = Genericos2.fromArrayToList(textos);

        // Imprimimos cada texto de la lista
        listaTextos.forEach(System.out::print); // Salida esperada: Hola Mundo!!!

        System.out.println(); // Salto de línea para separar salidas

        // Creamos un array de enteros (Integer, clase envolvente de int)
        Integer[] numeros = {1, 2, 3, 4, 5};

        // Convertimos el array a lista
        List<Integer> listaNumeros = Genericos2.fromArrayToList(numeros);

        // Imprimimos los números
        listaNumeros.forEach(System.out::print); // Salida esperada: 12345
    }
}

