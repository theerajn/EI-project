// DocumentState.java
public abstract class DocumentState {
    protected Document document;

    public DocumentState(Document document) {
        this.document = document;
    }

    public abstract void publish();

    public abstract void review();

    public abstract void approve();

    public abstract void archive();
}
