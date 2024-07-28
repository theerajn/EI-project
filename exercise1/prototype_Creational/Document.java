package exercise1.prototype_Creational;



public class Document {
    private String content;
    private String formatting;

    public Document(Template template) {
        this.content = template.getContent();
        this.formatting = template.getFormatting();
    }

    public void display() {
        System.out.println("Document:");
        System.out.println("Content: " + content);
        System.out.println("Formatting: " + formatting);
    }

    public void editContent(String newContent) {
        this.content = newContent;
    }

    public void editFormatting(String newFormatting) {
        this.formatting = newFormatting;
    }
}
