package exercise2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Student implements StudentOperations {
    private static final Logger logger = Logger.getLogger(Student.class.getName());

    private String studentId;
    private String classroomName;
    private Map<String, List<String>> submittedAssignments;

    public Student(String studentId, String classroomName) {
        this.studentId = studentId;
        this.classroomName = classroomName;
        this.submittedAssignments = new HashMap<>();
    }

    @Override
    public String getStudentId() {
        return studentId;
    }

    @Override
    public String getClassroomName() {
        return classroomName;
    }

    @Override
    public void submitAssignment(String classroomName, String details) {
        if (!this.classroomName.equals(classroomName)) {
            logger.log(Level.WARNING, "Student {0} is not enrolled in classroom {1}",
                    new Object[] { studentId, classroomName });
            System.out.println("Student not enrolled in this classroom.");
            return;
        }

        VirtualClassroomManager manager = VirtualClassroomManager.getInstance();
        Classroom classroom = (Classroom) manager.getClassroom(classroomName);
        if (classroom == null) {
            logger.log(Level.WARNING, "Classroom {0} not found", classroomName);
            System.out.println("Classroom does not exist.");
            return;
        }

        if (!classroom.isAssignmentScheduled(details)) {
            System.out.println("Assignment does not exist.");
            return;
        }

        submittedAssignments.computeIfAbsent(classroomName, k -> new ArrayList<>());
        List<String> assignments = submittedAssignments.get(classroomName);

        if (assignments.contains(details)) {
            logger.log(Level.WARNING, "Assignment {0} already submitted by student {1}",
                    new Object[] { details, studentId });
            System.out.println("Assignment already submitted.");
            return;
        }

        
        assignments.add(details);
        System.out.println("Assignment submitted successfully.");
    }

    @Override
    public Map<String, List<String>> getSubmittedAssignments() {
        return new HashMap<>(submittedAssignments); // Ensure this matches the interface
    }

    @Override
    public Map<String, List<String>> listSubmissions() {
        
        throw new UnsupportedOperationException("Unimplemented method 'listSubmissions'");
    }
}
