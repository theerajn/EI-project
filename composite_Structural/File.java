package composite_Structural;

public class File extends Component {
    private String content;

    public File(String name) {
        super(name);
        this.content = "";
    }

    @Override
    public void read() {
        System.out.println("Reading file: " + name);
        System.out.println("Content: " + content);
    }

    @Override
    public void write(String content) {
        this.content = content;
        System.out.println("Writing to file: " + name);
    }

    @Override
    public void delete() {
        System.out.println("Deleting file: " + name);
    }
}
