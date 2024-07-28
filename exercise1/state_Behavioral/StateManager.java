
import java.util.Scanner;

public class StateManager {
    private Document document;
    private Scanner scanner;

    public StateManager(Document document) {
        this.document = document;
        this.scanner = new Scanner(System.in);
    }

    public void processInput() {
        System.out.println("Enter command (publish, review, approve, archive) or type 'exit' to quit:");
        String command = scanner.nextLine().trim().toLowerCase();

        switch (command) {
            case "publish":
                document.publish();
                break;
            case "review":
                document.review();
                break;
            case "approve":
                document.approve();
                break;
            case "archive":
                document.archive();
                break;
            case "exit":
                System.out.println("Exiting program.");
                scanner.close();
                return;
            default:
                System.out
                        .println("Invalid command. Please enter 'publish', 'review', 'approve', 'archive', or 'exit'.");
                break;
        }

        // Process next input
        processInput();
    }
}
