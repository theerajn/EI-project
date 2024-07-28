package Creational_factory;

public class CryptocurrencyPayment implements PaymentMethod {
    @Override
    public void processTransaction(String details) {
        System.out.println("Processing Cryptocurrency payment with details: " + details);
    }
}
