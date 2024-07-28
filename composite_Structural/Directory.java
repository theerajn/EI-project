package composite_Structural;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Component {
    private List<Component> components;

    public Directory(String name) {
        super(name);
        this.components = new ArrayList<>();
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public void read() {
        System.out.println("Reading directory: " + name);
        for (Component component : components) {
            component.read();
        }
    }

    @Override
    public void write(String content) {
        System.out.println("Cannot write to directory: " + name);
    }

    @Override
    public void delete() {
        System.out.println("Deleting directory: " + name);
        for (Component component : components) {
            component.delete();
        }
    }
}
