package exercise1.chain_Behavioral;

 public class ValidationHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public void process(Request request) {
        if (validate(request)) {
            System.out.println("Validation passed.");
            if (next != null) {
                next.process(request);
            }
        } else {
            System.out.println("Validation failed.");
        }
    }

    private boolean validate(Request request) {
        // Add validation logic here
        return request.getData() != null && !request.getData().isEmpty();
    }
}
