package exercise2;

public class ClassroomFactory {
    public Classroom createClassroom(String name) {
        return new Classroom(name);
    }
}
