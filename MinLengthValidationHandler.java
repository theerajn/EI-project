// MinLengthValidationHandler.java
package Behavioral_chain;

public class MinLengthValidationHandler implements Handler {
    private final int minLength;
    private Handler next;

    public MinLengthValidationHandler(int minLength) {
        this.minLength = minLength;
    }

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public void process(Request request) {
        if (request.getErrorMessage() == null && request.getData().length() < minLength) {
            request.setErrorMessage("Data is too short. Minimum length required is " + minLength + ".");
        } else if (next != null) {
            next.process(request);
        }
    }
}
