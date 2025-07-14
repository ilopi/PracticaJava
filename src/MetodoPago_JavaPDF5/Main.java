package MetodoPago_JavaPDF5;

/**
 * Clase principal (con metodo main) para probar los métodos de pago.
 */
public class Main {
    public static void main(String[] args) {
        // Creamos una instancia de pago con tarjeta
        PaymentMethod metodo1 = new CreditCardPayment("1234-5678-9012", "Laura", "12/25");

        // Creamos una instancia de pago con PayPal
        PaymentMethod metodo2 = new PayPalPayment("laura@example.com");

        // Procesamos ambos pagos y mostramos sus detalles
        metodo1.processPayment(100.0);
        System.out.println(metodo1.getPaymentDetails());

        metodo2.processPayment(50.0);
        System.out.println(metodo2.getPaymentDetails());
    }
}



