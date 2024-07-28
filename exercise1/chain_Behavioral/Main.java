package exercise1.chain_Behavioral;
public class Main {
    public static void main(String[] args) {
        // Create handlers for validation
        Handler nullOrEmptyValidation = new NullOrEmptyValidationHandler();
        Handler minLengthValidation = new MinLengthValidationHandler(5);

        // Chain validation handlers
        nullOrEmptyValidation.setNext(minLengthValidation);

        // Create handlers for transformation
        Handler toUpperCaseTransformation = new ToUpperCaseTransformationHandler();
        Handler trimWhitespaceTransformation = new TrimWhitespaceTransformationHandler();

        // Chain transformation handlers
        minLengthValidation.setNext(toUpperCaseTransformation);
        toUpperCaseTransformation.setNext(trimWhitespaceTransformation);

        // Create and start state manager with the pipeline
        StateManager stateManager = new StateManager(nullOrEmptyValidation);
        stateManager.handleInput(); // Start handling user input
    }
}
