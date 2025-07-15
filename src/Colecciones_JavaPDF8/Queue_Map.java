package Colecciones_JavaPDF8;

// Necesario para usar Queue:
import java.util.Queue;
import java.util.LinkedList;

// Necesario para usar Map:
import java.util.HashMap;

public class Queue_Map {

    public static void main(String[] args) {

        /*
         * Una Queue es una colección ordenada de elementos.
         * FIFO = First In, First Out: El primero en entrar es el primero en salir.
         * No se puede acceder por índice.
         * Solo se puede agregar al final y sacar al principio.
         * Se usa para procesar en orden.
         */

        System.out.println("\nEjemplo Queue:");

        Queue<String> cola = new LinkedList<>();

        cola.add("Cliente 1");
        cola.add("Cliente 2");
        cola.add("Cliente 3");

        System.out.println("Siguiente en la cola: " + cola.peek()); // Muestra sin quitar
        System.out.println("Atendiendo a: " + cola.poll()); // Quita el primero
        System.out.println("Siguiente en la cola: " + cola.peek()); // Devuelve el cliente 2

        System.out.println("Cola restante: " + cola);


        /*
         * Un Map sirve para guardar pares clave-valor (key-value).
         * Es como una agenda o un diccionario.
         * Las claves son únicas (no se repiten).
         * Los valores pueden repetirse.
         * No tiene orden garantizado.
         * Para tener orden: TreeMap o LinkedHashMap.
         */

        System.out.println("\nEjemplo Map:");

        HashMap<String, String> persona = new HashMap<>();

        persona.put("Nombre", "Lucía");
        persona.put("Edad", "30");
        persona.put("Ciudad", "Barcelona");

        System.out.println("Nombre: " + persona.get("Nombre"));

        // Mostrar el mapa entero
        System.out.println(persona);

        persona.remove("Edad"); // Elimina esa clave y su valor

        System.out.println(persona);
    }
}
