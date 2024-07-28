package exercise1.chain_Behavioral;

 public class TransformationHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public void process(Request request) {
        transform(request);
        System.out.println("Transformation done.");
        if (next != null) {
            next.process(request);
        }
    }

    private void transform(Request request) {
        // Add transformation logic here
        request.setData(request.getData().toUpperCase());
    }
}
