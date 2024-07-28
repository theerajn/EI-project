// Document.java
public class Document {
    private DocumentState state;

    public Document() {
        this.state = new DraftState(this);
    }

    public void setState(DocumentState state) {
        this.state = state;
    }

    public void publish() {
        state.publish();
    }

    public void review() {
        state.review();
    }

    public void approve() {
        state.approve();
    }

    public void archive() {
        state.archive();
    }
}
