package composite_Structural;

import java.util.Scanner;

public class FileSystem {
    private Directory root;
    private Scanner scanner;

    public FileSystem() {
        this.root = new Directory("root");
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("File System Menu:");
        System.out.println("1. Create File");
        System.out.println("2. Create Directory");
        System.out.println("3. Read");
        System.out.println("4. Write");
        System.out.println("5. Delete");
        System.out.println("6. Exit");

        System.out.print("Enter your choice: ");
        String choice = scanner.nextLine().trim();

        switch (choice) {
            case "1":
                createFile();
                break;
            case "2":
                createDirectory();
                break;
            case "3":
                read();
                break;
            case "4":
                write();
                break;
            case "5":
                delete();
                break;
            case "6":
                System.out.println("Exiting program.");
                scanner.close();
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
                start(); // Retry the menu
                break;
        }
    }

    private void createFile() {
        System.out.print("Enter file name: ");
        String name = scanner.nextLine().trim();
        File file = new File(name);
        root.addComponent(file);
        System.out.println("File created: " + name);
        start(); // Return to menu
    }

    private void createDirectory() {
        System.out.print("Enter directory name: ");
        String name = scanner.nextLine().trim();
        Directory directory = new Directory(name);
        root.addComponent(directory);
        System.out.println("Directory created: " + name);
        start(); // Return to menu
    }

    private void read() {
        System.out.print("Enter name of the file or directory to read: ");
        String name = scanner.nextLine().trim();
        Component component = findComponent(name);
        if (component != null) {
            component.read();
        } else {
            System.out.println("Component not found.");
        }
        start(); // Return to menu
    }

    private void write() {
        System.out.print("Enter name of the file to write: ");
        String name = scanner.nextLine().trim();
        Component component = findComponent(name);
        if (component != null && component instanceof File) {
            System.out.print("Enter content to write: ");
            String content = scanner.nextLine().trim();
            component.write(content);
        } else {
            System.out.println("File not found or wrong component type.");
        }
        start(); // Return to menu
    }

    private void delete() {
        System.out.print("Enter name of the file or directory to delete: ");
        String name = scanner.nextLine().trim();
        Component component = findComponent(name);
        if (component != null) {
            component.delete();
            if (component instanceof Directory) {
                root.removeComponent(component);
            }
        } else {
            System.out.println("Component not found.");
        }
        start(); // Return to menu
    }

    private Component findComponent(String name) {
        for (Component component : root.getComponents()) {
            if (component.getName().equals(name)) {
                return component;
            }
        }
        return null;
    }
}
