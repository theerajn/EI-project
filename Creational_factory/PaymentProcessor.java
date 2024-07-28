package Creational_factory;

import java.util.Scanner;

public class PaymentProcessor {
    private Scanner scanner;

    public PaymentProcessor() {
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Select payment method:");
        System.out.println("1. Credit Card");
        System.out.println("2. Cryptocurrency");
        System.out.println("3. Bank Transfer");
        System.out.println("4. Exit");

        System.out.print("Enter your choice: ");
        String choice = scanner.nextLine().trim();

        switch (choice) {
            case "1":
                processPayment(new CreditCardFactory());
                break;
            case "2":
                processPayment(new CryptocurrencyFactory());
                break;
            case "3":
                processPayment(new BankTransferFactory());
                break;
            case "4":
                System.out.println("Exiting program.");
                scanner.close();
                return; // Exit the program
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
                start(); // Recursive call to return to main menu
                break;
        }
    }

    private void processPayment(PaymentFactory factory) {
        PaymentMethod method = factory.createPaymentMethod();
        System.out.print("Enter payment details: ");
        String details = scanner.nextLine();
        method.processTransaction(details);
        start(); // Recursive call to return to main menu
    }
}
