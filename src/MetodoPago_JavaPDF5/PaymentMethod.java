package MetodoPago_JavaPDF5;

/**
 * Esta interfaz define el contrato que cualquier clase de metodo de pago debe seguir.
 * Obliga a implementar:
 *  - processPayment(double amount): para procesar el pago.
 *  - getPaymentDetails(): para obtener los detalles del pago.
 */
public interface PaymentMethod {
    void processPayment(double amount); // Metodo para procesar el pago
    String getPaymentDetails();         // Metodo para obtener detalles del método de pago
}

