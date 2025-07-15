package ProgramaRepaso_1to7;

public class Order {

    private Book[] libros; // Array de libros del pedido
    private OrderStatus estadoPedido; // Estado actual del pedido
    private PayMethod metodoPago; // Metodo de pago elegido

    // Constructor:
    public Order(Book[] libros, OrderStatus estadoPedido) {
        this.libros = libros;
        this.estadoPedido = estadoPedido;
    }

    // Metodo para recorrer Book y sumar precios:
    public int calcularTotal() {
        int total = 0;

        for (Book libro : libros) {
            total += libro.price(); // Accedemos al campo del record Book
        }
        return total;
    }

    // Metodo para asignar el metodo de pago:
    public void setMetodoPago(PayMethod metodoPago) {
        this.metodoPago = metodoPago;
    }

    // Metodo para mostrar la información del pedido:
    public void mostrarResumen() {
        System.out.println("\nLibros en el pedido: ");
        for (Book libro : libros) {
            System.out.println("- " + libro.title() + " de " + libro.author() + " (" + libro.price() + "$)");
        }

        System.out.println("\nEstado del pedido: " + estadoPedido);
        System.out.println("\nTotal: " + calcularTotal() + " $");

        if (metodoPago != null) {
            System.out.println("\nMétodo de pago: ");
            System.out.println(metodoPago.getPaymentDetails());
        } else {
            System.out.println("\nNo se ha asignado método de pago");
        }
    }


}
