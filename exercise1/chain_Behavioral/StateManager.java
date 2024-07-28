package exercise1.chain_Behavioral;

// StateManager.java
import java.util.Scanner;

public class StateManager {
    private State currentState = State.WAITING_FOR_INPUT;
    private final Handler pipeline;
    private final Scanner scanner = new Scanner(System.in);

    public StateManager(Handler pipeline) {
        this.pipeline = pipeline;
    }

    public void handleInput() {
        // Only handle input if we are in the WAITING_FOR_INPUT state
        if (currentState == State.WAITING_FOR_INPUT) {
            System.out.print("Enter data (or type 'exit' to quit): ");
            String input = scanner.nextLine();

            // Check for exit condition
            if ("exit".equalsIgnoreCase(input)) {
                currentState = State.EXIT;
                scanner.close();
                System.out.println("Exiting program.");
            } else {
                processRequest(input);
            }
        }
    }

    private void processRequest(String data) {
        Request request = new Request(data);
        pipeline.process(request);

        // Display final data or error
        if (request.getErrorMessage() != null) {
            System.out.println("Error: " + request.getErrorMessage());
        } else {
            System.out.println("Final Data: " + request.getData());
        }

        // Handle the next input after processing the current one
        handleInput();
    }
}
