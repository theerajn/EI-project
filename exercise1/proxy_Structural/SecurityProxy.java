package exercise1.proxy_Structural;

import java.util.Scanner;

public class SecurityProxy {
    private SensitiveData sensitiveData;
    private AuthenticationService authenticationService;
    private AuthorizationService authorizationService;
    private Scanner scanner;

    public SecurityProxy() {
        this.sensitiveData = new SensitiveData();
        this.authenticationService = new AuthenticationService();
        this.authorizationService = new AuthorizationService();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        displayMenu();
    }

    private void displayMenu() {
        System.out.println("\nSecurity Proxy Menu:");
        System.out.println("1. Access Data");
        System.out.println("2. Exit");
        System.out.print("Enter your choice: ");

        String choice = scanner.nextLine().trim();

        switch (choice) {
            case "1":
                accessData();
                break;
            case "2":
                System.out.println("Exiting program.");
                scanner.close();
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
                displayMenu(); // Retry menu on invalid choice
                break;
        }
    }

    private void accessData() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine().trim();
        System.out.print("Enter password: ");
        String password = scanner.nextLine().trim();

        if (authenticationService.authenticate(username, password)) {
            System.out.print("Enter required permission (e.g., read, write): ");
            String permission = scanner.nextLine().trim();

            if (authorizationService.authorize(permission)) {
                sensitiveData.accessData();
            } else {
                System.out.println("Authorization failed. You do not have the required permission.");
            }
        } else {
            System.out.println("Authentication failed. Invalid username or password.");
        }

        displayMenu(); // Return to menu after handling data access
    }
}
