// ArchivedState.java
public class ArchivedState extends DocumentState {
    public ArchivedState(Document document) {
        super(document);
    }

    @Override
    public void publish() {
        System.out.println("Document cannot be published in Archived state.");
    }

    @Override
    public void review() {
        System.out.println("Document cannot be reviewed in Archived state.");
    }

    @Override
    public void approve() {
        System.out.println("Document cannot be approved in Archived state.");
    }

@Override
    public void archive() {
        System.out.println("Document is is already archived.");
    }
}
