package Creational_factory;

public class BankTransferPayment implements PaymentMethod {
    @Override
    public void processTransaction(String details) {
        System.out.println("Processing Bank Transfer payment with details: " + details);
    }
}
