package Creational_factory;

public class CryptocurrencyFactory extends PaymentFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new CryptocurrencyPayment();
    }
}
