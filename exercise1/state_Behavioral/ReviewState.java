// ReviewState.java
public class ReviewState extends DocumentState {
    public ReviewState(Document document) {
        super(document);
    }

    @Override
    public void publish() {
        System.out.println("Document cannot be published in Review state.");
    }

    @Override
    public void review() {
        System.out.println("Reviewing document in Review state.");
        // Additional logic could be added here for review
    }

    @Override
    public void approve() {
        System.out.println("Approving document in Review state.");
        document.setState(new ApprovedState(document)); // Transition to Approved state
    }

    @Override
    public void archive() {
        System.out.println("Document cannot be archived in Review state.");
    }
}
