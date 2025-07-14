package Record_JavaPDF6;

public class Main {
    public static void main(String[] args) {

        // Creamos un objeto 'book' usando el record 'Book'
        // Pasamos 4 argumentos: título, autor, año y ISBN
        Book book = new Book("Don Quijote", "Cervantes", 1605, "000-000");

        // Llamamos al metodo 'title()' que viene generado automáticamente por el record
        // Muestra el título del libro por consola
        System.out.println(book.title());
    }

    // Aquí declaramos un RECORD llamado 'Book'
    // Es una forma simplificada de crear una clase inmutable con atributos y métodos generados automáticamente
    public record Book(String title, String author, int year, String ISBN) {
        // Java genera automáticamente:
        // - Constructor
        // - Métodos getters: title(), author(), year(), ISBN()
        // - toString(), equals() y hashCode()
    }
}
