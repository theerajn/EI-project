package exercise1.prototype_Creational;

import java.util.Scanner;

public class Editor {
    private Template template;
    private Document document;
    private Scanner scanner;

    public Editor(Template template) {
        this.template = template;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome to Document Editor.");
        System.out.println("1. Create New Document");
        System.out.println("2. Edit Document");
        System.out.println("3. Display Document");
        System.out.println("4. Exit");

        System.out.print("Enter your choice: ");
        String choice = scanner.nextLine().trim();

        switch (choice) {
            case "1":
                createNewDocument();
                start(); // Recursive call to return to main menu
                break;
            case "2":
                editDocument();
                start(); // Recursive call to return to main menu
                break;
            case "3":
                displayDocument();
                start(); // Recursive call to return to main menu
                break;
            case "4":
                System.out.println("Exiting program.");
                scanner.close(); // Close scanner before exiting
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
                start(); // Recursive call to return to main menu
                break;
        }
    }

    private void createNewDocument() {
        document = new Document(template.clone());
        System.out.println("New document created based on template.");
    }

    private void editDocument() {
        if (document == null) {
            System.out.println("No document to edit. Please create a new document first.");
            return; // Exit method to go back to main menu
        }

        System.out.println("Edit Document:");
        System.out.println("1. Edit Content");
        System.out.println("2. Edit Formatting");
        System.out.println("3. Back");

        System.out.print("Enter your choice: ");
        String choice = scanner.nextLine().trim();

        switch (choice) {
            case "1":
                System.out.print("Enter new content: ");
                String newContent = scanner.nextLine();
                document.editContent(newContent);
                System.out.println("Content updated.");
                break;
            case "2":
                System.out.print("Enter new formatting: ");
                String newFormatting = scanner.nextLine();
                document.editFormatting(newFormatting);
                System.out.println("Formatting updated.");
                break;
            case "3":
                // Return to main menu
                return;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
                break;
        }
        // Recursive call to allow further edits
        editDocument();
    }

    private void displayDocument() {
        if (document == null) {
            System.out.println("No document to display. Please create a new document first.");
            return; // Exit method to go back to main menu
        }
        document.display();
    }
}
