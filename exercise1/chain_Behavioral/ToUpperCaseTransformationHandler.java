 //ToUpperCaseTransformationHandler.java
package exercise1.chain_Behavioral;

public class ToUpperCaseTransformationHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public void process(Request request) {
        if (request.getErrorMessage() == null) {
            request.setData(request.getData().toUpperCase());
            System.out.println("Data converted to upper case.");
            if (next != null) {
                next.process(request);
            }
        } else {
            System.out.println("Skipping transformation due to validation errors.");
        }
    }
}
