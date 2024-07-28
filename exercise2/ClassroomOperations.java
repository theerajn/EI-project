package exercise2;

import java.util.Map;

public interface ClassroomOperations {
    String getName();

    void addAssignment(String details) throws IllegalArgumentException;

    void removeAssignment(String details) throws IllegalArgumentException;

    Map<String, Boolean> listAssignments();
}
