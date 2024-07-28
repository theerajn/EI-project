// ApprovedState.java
public class ApprovedState extends DocumentState {
    public ApprovedState(Document document) {
        super(document);
    }

    @Override
    public void publish() {
        System.out.println("Publishing document from Approved state.");
        document.setState(new ArchivedState(document)); // Transition to Archived state
    }

    @Override
    public void review() {
        System.out.println("Document cannot be reviewed in Approved state.");
    }

    @Override
    public void approve() {
        System.out.println("Document is already approved.");
    }

    @Override
    public void archive() {
        System.out.println("Document cannot be archived in Approved state.");
    }
}
