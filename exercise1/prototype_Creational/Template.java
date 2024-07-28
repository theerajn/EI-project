package exercise1.prototype_Creational;

public class Template {
    private String content;
    private String formatting;

    public Template(String content, String formatting) {
        this.content = content;
        this.formatting = formatting;
    }

    public Template clone() {
        return new Template(content, formatting);
    }

    public String getContent() {
        return content;
    }

    public String getFormatting() {
        return formatting;
    }

    @Override
    public String toString() {
        return "Content: " + content + "\nFormatting: " + formatting;
    }
}
