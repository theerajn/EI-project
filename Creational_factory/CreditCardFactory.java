package Creational_factory;

public class CreditCardFactory extends PaymentFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new CreditCardPayment();
    }
}
