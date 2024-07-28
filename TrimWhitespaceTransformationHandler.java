// TrimWhitespaceTransformationHandler.java
package Behavioral_chain;

public class TrimWhitespaceTransformationHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public void process(Request request) {
        if (request.getErrorMessage() == null) {
            request.setData(request.getData().trim());
            System.out.println("Whitespace trimmed from data.");
            if (next != null) {
                next.process(request);
            }
        } else {
            System.out.println("Skipping transformation due to validation errors.");
        }
    }
}
