package Creational_factory;

public class BankTransferFactory extends PaymentFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new BankTransferPayment();
    }
}
