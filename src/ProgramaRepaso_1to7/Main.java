package ProgramaRepaso_1to7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Crear tienda y mostrar catálogo:
        Store store = new Store();
        store.mostrarCatalogo();

        System.out.println("\nIntroduce el número del libro que quieres comprar: ");
        int indice = Integer.parseInt(scanner.nextLine());

        Book libroSeleccionado = store.getLibroPorIndice(indice - 1);
        System.out.println("\nHas elegido: " + libroSeleccionado.title());

        System.out.println("\nElige el método de pago (1 o 2): ");
        System.out.println("\n1. Tarjeta de crédito");
        System.out.println("\n2. PayPal");
        int metodoPago = Integer.parseInt(scanner.nextLine());

        PayMethod metodoSeleccionado;

        if (metodoPago == 1) {
            System.out.println("\nIntroduce el número de tarjeta: ");
            String numTarjeta = scanner.nextLine();
            System.out.print("\nIntroduce nombre del titular: ");
            String nombreTitular = scanner.nextLine();

            metodoSeleccionado = new CreditCard_Implements_PaymentMethod(numTarjeta, nombreTitular);
        } else {
            System.out.println("\nIntroduce el email de PayPal: ");
            String email = scanner.nextLine();

            metodoSeleccionado = new PayPal_Implents_PaymentMethod(email);
        }

        System.out.println("\nProcesando pago...");
        metodoSeleccionado.processPayment(libroSeleccionado.price());
        System.out.println(metodoSeleccionado.getPaymentDetails());

        System.out.println("\nEstado del pedido:");
        OrderStatus estado = OrderStatus.CONFIRMADO;
        printOrderStatusMessage(estado);

    }

    // Metodo auxiliar para mostrar estado del pedido:
    public static void printOrderStatusMessage(OrderStatus order) {
        switch (order) {
            case CONFIRMADO -> System.out.println("\nEl pedido está confirmado.");
            case PREPARADO -> System.out.println("\nEl pedido está preparado.");
            case ENVIADO -> System.out.println("\nEl pedido ha sido enviado.");
            case RECIBIDO -> System.out.println("\nEl pedido ha sido recibido.");
        }
    }
}
