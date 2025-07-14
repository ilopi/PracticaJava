package MetodoPago_JavaPDF5;

/**
 * Clase que representa un pago con tarjeta de crédito.
 * Implementa la interfaz PaymentMethod, por lo que debe definir los métodos obligatorios.
 */
public class CreditCardPayment implements PaymentMethod {

    // Atributos privados (información de la tarjeta)
    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;

    // Constructor para inicializar los datos de la tarjeta
    public CreditCardPayment(String cardNumber, String cardHolderName, String expirationDate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
    }

    // Implementación del metodo para procesar el pago
    @Override
    public void processPayment(double amount) {
        System.out.println("Procesando pago con tarjeta de $" + amount);
    }

    // Implementación del metodo para mostrar los detalles del pago
    @Override
    public String getPaymentDetails() {
        return "Tarjeta: " + cardNumber + ", Titular: " + cardHolderName + ", Expira: " + expirationDate;
    }
}

