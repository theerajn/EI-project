package Creational_factory;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void processTransaction(String details) {
        System.out.println("Processing Credit Card payment with details: " + details);
    }
}
