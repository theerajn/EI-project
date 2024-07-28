public class Main {
    public static void main(String[] args) {
        Document document = new Document(); // Start in Draft state

        // Create StateManager and start processing input
        StateManager stateManager = new StateManager(document);
        stateManager.processInput(); // Start handling user input
    }
}
