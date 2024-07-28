// NullOrEmptyValidationHandler.java
package exercise1.chain_Behavioral;

public class NullOrEmptyValidationHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public void process(Request request) {
        if (request.getData() == null || request.getData().trim().isEmpty()) {
            request.setErrorMessage("Data is null or empty.");
        } else if (next != null) {
            next.process(request);
        }
    }
}
