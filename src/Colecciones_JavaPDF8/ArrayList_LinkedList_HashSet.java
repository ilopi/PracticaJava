package Colecciones_JavaPDF8;

// Importante para usar SET:
import java.util.Set;
import java.util.HashSet;

// Importante para usar List:
import java.util.ArrayList;
import java.util.List;

// Importante para usar LinkedList:
import java.util.LinkedList;

public class ArrayList_LinkedList_HashSet {

    public static void main(String[] args) {
        /*
         * int[] miArray = new int[10]; → solo puedes guardar 10 elementos.
         * Una colección como ArrayList o HashSet → tantos elementos como necesites.
         * Set es una colección donde no se permiten duplicados.
         */

        System.out.println("\nEjemplo de HashSet: ");
        Set<String> frutas = new HashSet<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Manzana"); // No se agrega de nuevo porque ya existe

        System.out.println(frutas); // Imprime los elementos, sin repetir "Manzana"


        /*
         * Una List permite elementos duplicados.
         * Se puede acceder a cada elemento por el índice.
         * Se pueden agregar y quitar elementos fácil.
         * Implementaciones más comunes:
         * - ArrayList: Lectura rápida y acceso por índice.
         * - LinkedList: Muchas inserciones/eliminaciones.
         *
         * Cuando un Array se llena, se crea otro más grande automáticamente.
         * Acceso rápido por índice: miLista.get(2)
         */

        System.out.println("\nEjemplo de List: ");
        List<String> palabras = new ArrayList<>(); // Entre los paréntesis podemos indicar la cantidad
        palabras.add("Hola");
        palabras.add("Hola"); // duplicado permitido
        palabras.add("Mundo");

        System.out.println("Elemento en posición 0: " + palabras.get(0)); // Hola

        for (String palabra : palabras) {
            System.out.println(palabra);
        }


        /*
         * Una LinkedList está hecha de nodos enlazados (cajitas con punteros).
         * Cada nodo tiene: un valor y un enlace al siguiente.
         * Eliminar o insertar en cualquier posición es rápido.
         * Ideal para hacer muchas modificaciones en una lista.
         * Acceder por el índice es más lento.
         */

        System.out.println("\nEjemplo de LinkedList: ");
        LinkedList<String> nombres = new LinkedList<>();

        nombres.add("Pepe");
        nombres.add("Sandra");
        nombres.add("Ana");
        nombres.add("Laura");

        nombres.addFirst("Inicio");
        nombres.addLast("Final");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        System.out.println("Primer elemento: " + nombres.getFirst());
        System.out.println("Último elemento: " + nombres.getLast());
    }
}
