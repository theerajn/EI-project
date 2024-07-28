package exercise1.prototype_Creational;

public class Main {
    public static void main(String[] args) {
        // Define a pre-existing template
        Template template = new Template("Sample Content", "Bold");

        // Initialize the editor with the template
        Editor editor = new Editor(template);
        editor.start(); // Start handling user input
    }
}
