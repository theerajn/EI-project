package exercise2;

import java.util.ArrayList;
import java.util.List;

public class AssignmentSubject {
    private List<AssignmentObserver> observers = new ArrayList<>();

    public void addObserver(AssignmentObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(AssignmentObserver observer) {
        observers.remove(observer);
    }

    protected void notifyObservers(String assignmentDetails, boolean isScheduled) {
        for (AssignmentObserver observer : observers) {
            observer.update(assignmentDetails, isScheduled);
        }
    }
}
