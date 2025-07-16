package JavaModerno_JavaPDF10;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static void main(String[] args) {

        /*
         * Los Generics (genéricos) permiten crear
         * clases, métodos y estructuras de datos que pueden trabajar
         * con cualquier tipo de objeto.
         * Nos ahorran conversiones (casting) y hacen el código más seguro.
         * Sintaxis: List<Tipo> lista = new ArrayList<>();
         */

        // Creamos una lista genérica de tipo Usuario (es decir, solo podrá contener objetos de tipo Usuario)
        List<Usuario> usuarios = new ArrayList<>();

        // Añadimos instancias de Usuario a la lista
        usuarios.add(new Usuario("Pepe", "Fuentes"));
        usuarios.add(new Usuario("Juan", "García"));
        usuarios.add(new Usuario("Mario", "Puente"));

        // Obtenemos el primer usuario sin necesidad de hacer casting
        Usuario primero = usuarios.get(0); // Si la lista no fuera genérica, habría que hacer casting manual
        System.out.println("Primer usuario: " + primero);

        // Recorremos la lista usando un bucle for-each
        System.out.println("\nTodos los usuarios:");
        for (Usuario u : usuarios) {
            System.out.println(u); // Se mostrará el resultado del metodo toString de Usuario
        }

    }

    // Clase interna Usuario
    public static class Usuario {
        private String nombre;
        private String apellido;

        // Constructor vacío (por si se necesita crear un Usuario sin datos al principio)
        public Usuario() {
        }

        // Constructor con parámetros para inicializar el nombre y apellido
        public Usuario(String nombre, String apellido) {
            this.nombre = nombre;
            this.apellido = apellido;
        }

        // Métodos getter y setter para el nombre
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        // Métodos getter y setter para el apellido
        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        // Metodo que devuelve una representación en texto del objeto Usuario
        @Override
        public String toString() {
            return "Usuario{" +
                    "nombre='" + nombre + '\'' +
                    ", apellido='" + apellido + '\'' +
                    '}';
        }
    }
}

