package exercise2;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Classroom extends AssignmentSubject implements ClassroomOperations {
    private static final Logger logger = Logger.getLogger(Classroom.class.getName());

    private String name;
    private Map<String, Boolean> assignments;

    public Classroom(String name) {
        this.name = name;
        this.assignments = new HashMap<>();
    }

    @Override
   
    public String getName() {
        return name;
    }

    @Override
    public void addAssignment(String details) throws IllegalArgumentException {
        if (assignments.containsKey(details) && assignments.get(details)) {
            logger.log(Level.WARNING, "Assignment {0} already scheduled in classroom {1}",
                    new Object[] { details, name });
            throw new IllegalArgumentException("Assignment already scheduled.");
        }
        assignments.put(details, true); // Assignment scheduled
        notifyObservers(details, true); // Notify observers about the new assignment
        logger.log(Level.INFO, "Assignment {0} added to classroom {1}", new Object[] { details, name });
    }

    @Override
    public void removeAssignment(String details) throws IllegalArgumentException {
        if (!assignments.containsKey(details)) {
            logger.log(Level.WARNING, "Assignment {0} not found in classroom {1}",
                    new Object[] { details, name });
            throw new IllegalArgumentException("Assignment not found.");
        }
        assignments.put(details, false); // Assignment removed
        notifyObservers(details, false); // Notify observers about the removal
        logger.log(Level.INFO, "Assignment {0} removed from classroom {1}", new Object[] { details, name });
    }

    @Override
    public Map<String, Boolean> listAssignments() {
        return new HashMap<>(assignments);
    }

    public boolean isAssignmentScheduled(String details) {
        return assignments.getOrDefault(details, false);
    }
}
