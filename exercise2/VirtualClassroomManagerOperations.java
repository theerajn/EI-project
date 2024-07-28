package exercise2;

import java.util.Map;

public interface VirtualClassroomManagerOperations {
    void addClassroom(String name) throws IllegalArgumentException;

    void removeClassroom(String name) throws IllegalArgumentException;

    Map<String, ClassroomOperations> listClassrooms();

    void addStudent(String id, String classroomName) throws IllegalArgumentException;

    String[] listStudents(String classroomName) throws IllegalArgumentException;

    void scheduleAssignment(String classroomName, String details) throws IllegalArgumentException;

    void removeAssignment(String classroomName, String details) throws IllegalArgumentException;

    void submitAssignment(String studentId, String classroomName, String details) throws IllegalArgumentException;
}
