package MetodoPago_JavaPDF5;

/**
 * Clase que representa un pago con cuenta de PayPal.
 * También implementa la interfaz PaymentMethod.
 */
public class PayPalPayment implements PaymentMethod {

    // Atributo privado (correo asociado a PayPal)
    private String email;

    // Constructor que recibe el email de PayPal
    public PayPalPayment(String email) {
        this.email = email;
    }

    // Implementación del metodo para procesar el pago
    @Override
    public void processPayment(double amount) {
        System.out.println("Procesando pago con PayPal de $" + amount);
    }

    // Implementación del metodo para mostrar los detalles del pago
    @Override
    public String getPaymentDetails() {
        return "Email de PayPal: " + email;
    }
}


