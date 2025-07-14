package ProgramaRepaso_1to7;

public class CreditCard_Implements_PaymentMethod implements PayMethod {

    // Atributos privados (información de la tarjeta)
    private String cardNumber;
    private String cardName;

    // Constructor para inicializar los datos de la tarjeta
    public CreditCard_Implements_PaymentMethod(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardName = cardHolderName;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("\nProcesado el pago con tarjeta de " + amount + " $.");
    }

    @Override
    public String getPaymentDetails() {
        return "\nNúmero de la tarjeta: " + cardNumber + "\nTitular de la tarjeta: " + cardName;
    }
}
