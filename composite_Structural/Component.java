package composite_Structural;

public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void read();

    public abstract void write(String content);

    public abstract void delete();
}
