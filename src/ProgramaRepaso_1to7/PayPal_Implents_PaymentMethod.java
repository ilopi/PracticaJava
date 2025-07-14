package ProgramaRepaso_1to7;

public class PayPal_Implents_PaymentMethod implements PayMethod {

    private String email;

    public PayPal_Implents_PaymentMethod(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("\nProcesado el pago con Paypal de: " + amount);
    }

    @Override
    public String getPaymentDetails() {
        return "\nemail del Titular: " + email;
    }
}
