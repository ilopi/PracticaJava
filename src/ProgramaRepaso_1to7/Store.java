package ProgramaRepaso_1to7;

public class Store {

    // Array de libros disponibles en la tienda:
    private Book[] catalogo;

    // Constructor que inicializa el catálogo:
    public Store() {
        catalogo = new Book[] {
                new Book("1984", "George Orwell", 15),
                new Book("Don Quijote", "Cervantes", 20),
                new Book("Cien Años de Soledad", "García Márquez", 18),
                new Book("El Principito", "Antoine de Saint-Exupéry", 12),
                new Book("La Sombra del Viento", "Carlos Ruiz Zafón", 17)
        };
    }

    // Getter del catálogo:
    public Book[] getCatalogo() {
        return catalogo;
    }

    // Mostrar todos los libros disponibles:
    public void mostrarCatalogo() {
        System.out.println("\nCatálogo de libros: ");
        for (int i = 0; i < catalogo.length; i++) {
            System.out.println((i + i) + ". " + catalogo[i].title() + " - " + catalogo[i].author() + " (" + catalogo[i].price() + "$)");
        }
    }

    public Book getLibroPorIndice(int indice) {
        if (indice >= 0 && indice < catalogo.length) {
            return catalogo[indice];
        } else {
            return null;
        }
    }
}
