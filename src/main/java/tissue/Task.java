package tissue;

public class Task {
    private final String task;
    private boolean done;

    public Task(boolean done, String task) {
        this.done = done;
        this.task = task;
    }

    public Task markTask() {
        done = true;
        return this;
    }

    public Task unmarkTask() {
        done = false;
        return this;
    }

    public boolean getDone() {
        return done;
    }

    public String getTask() {
        return task;
    }

    @Override
    public String toString() {
        return done ? "[X] " + task : "[ ] " + task;
    }
}
