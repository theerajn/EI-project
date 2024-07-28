package exercise2;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
//import java.util.logging.Logger;

public class VirtualClassroomManager implements VirtualClassroomManagerOperations {
    private Map<String, ClassroomOperations> classrooms;
    private Map<String, StudentOperations> students;
    private ClassroomFactory classroomFactory;

    private static VirtualClassroomManager instance;

    public VirtualClassroomManager() {
        this.classrooms = new HashMap<>();
        this.students = new HashMap<>();
        this.classroomFactory = new ClassroomFactory();
    }

    public static VirtualClassroomManager getInstance() {
        if (instance == null) {
            instance = new VirtualClassroomManager();
        }
        return instance;
    }

    @Override
    public void addClassroom(String name) throws IllegalArgumentException {
        if (classrooms.containsKey(name)) {
            LoggerManager.getLogger().log(Level.WARNING, "Classroom {0} already exists", name);
            throw new IllegalArgumentException("Classroom already exists.");
        }
        classrooms.put(name, classroomFactory.createClassroom(name));
        LoggerManager.getLogger().log(Level.INFO, "Classroom {0} added", name);
    }

    @Override
    public void removeClassroom(String name) throws IllegalArgumentException {
        if (!classrooms.containsKey(name)) {
            LoggerManager.getLogger().log(Level.WARNING, "Classroom {0} does not exist", name);
            throw new IllegalArgumentException("Classroom does not exist.");
        }
        students.entrySet().removeIf(entry -> entry.getValue().getClassroomName().equals(name));
        classrooms.remove(name);
        LoggerManager.getLogger().log(Level.INFO, "Classroom {0} removed", name);
    }

    @Override
    public Map<String, ClassroomOperations> listClassrooms() {
        return new HashMap<>(classrooms);
    }

    @Override
    public void addStudent(String id, String classroomName) throws IllegalArgumentException {
        if (students.containsKey(id)) {
            LoggerManager.getLogger().log(Level.WARNING, "Student {0} already enrolled", id);
            throw new IllegalArgumentException("Student already enrolled.");
        }
        if (!classrooms.containsKey(classroomName)) {
            LoggerManager.getLogger().log(Level.WARNING, "Classroom {0} does not exist", classroomName);
            throw new IllegalArgumentException("Classroom does not exist.");
        }
        students.put(id, new Student(id, classroomName));
        LoggerManager.getLogger().log(Level.INFO, "Student {0} added to classroom {1}",
                new Object[] { id, classroomName });
    }

    @Override
    public String[] listStudents(String classroomName) throws IllegalArgumentException {
        if (!classrooms.containsKey(classroomName)) {
            LoggerManager.getLogger().log(Level.WARNING, "Classroom {0} does not exist", classroomName);
            throw new IllegalArgumentException("Classroom does not exist.");
        }
        return students.values().stream()
                .filter(student -> student.getClassroomName().equals(classroomName))
                .map(StudentOperations::getStudentId)
                .toArray(String[]::new);
    }

    @Override
    public void scheduleAssignment(String classroomName, String details) throws IllegalArgumentException {
        if (!classrooms.containsKey(classroomName)) {
            LoggerManager.getLogger().log(Level.WARNING, "Classroom {0} does not exist", classroomName);
            throw new IllegalArgumentException("Classroom does not exist.");
        }
        classrooms.get(classroomName).addAssignment(details);
        LoggerManager.getLogger().log(Level.INFO, "Assignment {0} scheduled in classroom {1}",
                new Object[] { details, classroomName });
    }

    @Override
    public void removeAssignment(String classroomName, String details) throws IllegalArgumentException {
        if (!classrooms.containsKey(classroomName)) {
            LoggerManager.getLogger().log(Level.WARNING, "Classroom {0} does not exist", classroomName);
            throw new IllegalArgumentException("Classroom does not exist.");
        }
        classrooms.get(classroomName).removeAssignment(details);
        LoggerManager.getLogger().log(Level.INFO, "Assignment {0} removed from classroom {1}",
                new Object[] { details, classroomName });
    }

    @Override
    public void submitAssignment(String studentId, String classroomName, String details)
            throws IllegalArgumentException {
        if (!students.containsKey(studentId)) {
            LoggerManager.getLogger().log(Level.WARNING, "Student {0} not found", studentId);
            throw new IllegalArgumentException("Student does not exist.");
        }

        Student student = (Student) students.get(studentId);
        if (!student.getClassroomName().equals(classroomName)) {
            LoggerManager.getLogger().log(Level.WARNING, "Student {0} is not enrolled in classroom {1}",
                    new Object[] { studentId, classroomName });
            throw new IllegalArgumentException("Student is not enrolled in this classroom.");
        }

        Classroom classroom = (Classroom) classrooms.get(classroomName);
        if (classroom == null) {
            LoggerManager.getLogger().log(Level.WARNING, "Classroom {0} does not exist", classroomName);
            throw new IllegalArgumentException("Classroom does not exist.");
        }

        
        if (!classroom.isAssignmentScheduled(details)) {
            LoggerManager.getLogger().log(Level.WARNING, "Assignment {0} not found in classroom {1}",
                    new Object[] { details, classroomName });
            System.out.println("Assignment does not exist.");
            return;
        }

        student.submitAssignment(classroomName, details);
        LoggerManager.getLogger().log(Level.INFO, "Assignment {0} submitted by student {1} in classroom {2}",
                new Object[] { details, studentId, classroomName });
    }

    public Classroom getClassroom(String classroomName) {
        return (Classroom) classrooms.get(classroomName);
    }
}
