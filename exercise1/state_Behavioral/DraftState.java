// DraftState.java
public class DraftState extends DocumentState {
    public DraftState(Document document) {
        super(document);
    }

    @Override
    public void publish() {
        System.out.println("Publishing document from Draft state.");
        document.setState(new ReviewState(document)); // Transition to Review state
    }

    @Override
    public void review() {
        System.out.println("Document cannot be reviewed while in Draft state.");
    }

    @Override
    public void approve() {
        System.out.println("Document cannot be approved while in Draft state.");
    }

    @Override
    public void archive() {
        System.out.println("Document cannot be archived while in Draft state.");
    }
}
