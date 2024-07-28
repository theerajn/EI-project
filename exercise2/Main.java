package exercise2;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VirtualClassroomManager manager = new VirtualClassroomManager();
        Scanner scanner = new Scanner(System.in);

        handleUserInput(scanner, manager);

        System.out.println("Exiting the application.");
        scanner.close();
    }

    private static void handleUserInput(Scanner scanner, VirtualClassroomManager manager) {
        // Display menu
        System.out.println("\nVirtual Classroom Manager");
        System.out.println("-------------------------");
        System.out.println("1. Add Classroom");
        System.out.println("2. Remove Classroom");
        System.out.println("3. List Classrooms");
        System.out.println("4. Add Student");
        System.out.println("5. List Students");
        System.out.println("6. Schedule Assignment");
        System.out.println("7. Remove Assignment");
        System.out.println("8. Submit Assignment");
        System.out.println("9. Exit");
        System.out.print("Select an option (1-9): ");

        // Handle user input
        int choice;
        try {
            choice = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number between 1 and 9.");
            handleUserInput(scanner, manager); // Recursive call
            return;
        }

        switch (choice) {
            case 1:
                System.out.print("Enter classroom name: ");
                String addClassroomName = scanner.nextLine();
                try {
                    manager.addClassroom(addClassroomName);
                    System.out.println("Classroom added.");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;

            case 2:
                System.out.print("Enter classroom name: ");
                String removeClassroomName = scanner.nextLine();
                try {
                    manager.removeClassroom(removeClassroomName);
                    System.out.println("Classroom removed.");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;

            case 3:
                System.out.println("Classrooms:");
                manager.listClassrooms().forEach((name, classroom) -> System.out.println("- " + name));
                break;

            case 4:
                System.out.print("Enter student ID: ");
                String studentId = scanner.nextLine();
                System.out.print("Enter classroom name: ");
                String studentClassroom = scanner.nextLine();
                try {
                    manager.addStudent(studentId, studentClassroom);
                    System.out.println("Student added.");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;

            case 5:
                System.out.print("Enter classroom name: ");
                String listClassroomName = scanner.nextLine();
                try {
                    String[] students = manager.listStudents(listClassroomName);
                    System.out.println("Students in " + listClassroomName + ":");
                    if (students.length == 0) {
                        System.out.println("No students found.");
                    } else {
                        for (String student : students) {
                            System.out.println("- " + student);
                        }
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;

            case 6:
                System.out.print("Enter classroom name: ");
                String scheduleClassroomName = scanner.nextLine();
                System.out.print("Enter assignment details: ");
                String assignmentDetails = scanner.nextLine();
                try {
                    manager.scheduleAssignment(scheduleClassroomName, assignmentDetails);
                    System.out.println("Assignment scheduled.");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;

            case 7:
                System.out.print("Enter classroom name: ");
                String removeClassroomNameAssignment = scanner.nextLine();
                System.out.print("Enter assignment details: ");
                String removeAssignmentDetails = scanner.nextLine();
                try {
                    manager.removeAssignment(removeClassroomNameAssignment, removeAssignmentDetails);
                    System.out.println("Assignment removed.");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;

            case 8:
                System.out.print("Enter student ID: ");
                String submitStudentId = scanner.nextLine();
                System.out.print("Enter classroom name: ");
                String submitClassroomName = scanner.nextLine();
                System.out.print("Enter assignment details: ");
                String submitAssignmentDetails = scanner.nextLine();
                try {
                    manager.submitAssignment(submitStudentId, submitClassroomName, submitAssignmentDetails);
                    System.out.println("Assignment submitted.");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;

            case 9:
                // Exit the recursion
                return;

            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 9.");
                break;
        }

        // Recursive call for next input
        handleUserInput(scanner, manager);
    }
}
