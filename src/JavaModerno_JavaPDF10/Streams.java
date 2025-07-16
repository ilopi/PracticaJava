package JavaModerno_JavaPDF10;

import java.util.*;
import java.util.stream.*;

public class Streams {

    /*
     * Un Stream en Java es una secuencia de datos (como una lista, un array, etc.)
     * que puedes procesar de forma funcional, es decir:
     * - Sin bucles for.
     * - Sin modificar el origen de los datos.
     * - Encadenando operaciones.
     * Un Stream NO es:
     * - Una colección que guarda elementos.
     * - No modifica la colección original.
     * - No se puede reutilizar una vez que lo has cerrado.
     */


    // Clase Usuario simple
    static class Usuario {
        private String nombre;
        private String apellido;

        public Usuario(String nombre, String apellido) {
            this.nombre = nombre;
            this.apellido = apellido;
        }

        public String getNombre() {
            return nombre;
        }

        public String getApellido() {
            return apellido;
        }

        @Override
        public String toString() {
            return nombre + " " + apellido;
        }

        // Necesario para eliminar duplicados con distinct()
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Usuario usuario = (Usuario) o;
            return Objects.equals(nombre, usuario.nombre) &&
                    Objects.equals(apellido, usuario.apellido);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nombre, apellido);
        }
    }

    public static void main(String[] args) {

        // Lista de nombres completos
        List<String> nombres = List.of(
                "Javier Garcia",
                "Ana Lopez",
                "Javier Gomez",
                "Carlos Martín",
                "Javier Garcia", // Repetido
                "Laura Pérez"
        );

        // 🧱 Creamos un Stream y lo transformamos en objetos Usuario
        List<Usuario> usuarios = nombres.stream()

                // 🔁 Intermedio: convertimos el String en Usuario
                .map(nombre -> {
                    String[] partes = nombre.split(" ");
                    return new Usuario(partes[0], partes[1]);
                })

                // 🔍 Eliminamos duplicados (gracias a equals + hashCode)
                .distinct()

                // 🎯 Convertimos el resultado en una lista
                .toList();

        // ✅ Mostramos todos los usuarios
        System.out.println("Usuarios únicos:");
        usuarios.forEach(System.out::println);

        System.out.println("\nSolo los Javier:");
        // 🔁 Filtramos los que se llaman "Javier"
        usuarios.stream()
                .filter(u -> u.getNombre().equals("Javier"))
                .forEach(System.out::println);

        System.out.println("\n¿Hay alguien llamado Laura?");
        // 🔍 anyMatch devuelve true si al menos uno cumple
        boolean hayLaura = usuarios.stream()
                .anyMatch(u -> u.getNombre().equals("Laura"));
        System.out.println("Resultado: " + hayLaura);

        System.out.println("\nContar cuántos se apellidan 'Garcia':");
        // 🔢 Contamos cuántos se apellidan García
        long conteoGarcia = usuarios.stream()
                .filter(u -> u.getApellido().equals("Garcia"))
                .count();
        System.out.println("Total: " + conteoGarcia);

        System.out.println("\nObtener el primer usuario llamado Javier:");
        // 🔍 findFirst devuelve el primer que cumple la condición
        Optional<Usuario> primerJavier = usuarios.stream()
                .filter(u -> u.getNombre().equals("Javier"))
                .findFirst();

        primerJavier.ifPresent(System.out::println);

        System.out.println("\nConcatenar todos los apellidos con reduce:");
        // 🔗 Reduce combina todos los apellidos en uno solo
        String apellidosConcatenados = usuarios.stream()
                .map(Usuario::getApellido)
                .reduce("Apellidos: ", (a, b) -> a + b + " ");
        System.out.println(apellidosConcatenados);

        System.out.println("\nConvertimos todos los nombres en mayúsculas:");
        // 🧽 map + toUpperCase
        usuarios.stream()
                .map(u -> u.getNombre().toUpperCase())
                .forEach(System.out::println);
    }
}

