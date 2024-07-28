package exercise2;

import java.util.List;
import java.util.Map;

public interface StudentOperations {
    String getStudentId();

    String getClassroomName();

    void submitAssignment(String classroomName, String details);

    Map<String, List<String>> getSubmittedAssignments(); // Ensure this matches

    Map<String, List<String>> listSubmissions();
}
