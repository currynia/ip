package tissue.task;

/** Defines the structure of every task event. */
public class Task {
    private final String task;
    private boolean isDone;

    /**
     * Constructor for task object.
     *
     * @param isDone boolean condition to see if task isDone.
     * @param task The name of the task to be stored.
     */
    public Task(boolean isDone, String task) {
        this.isDone = isDone;
        this.task = task;
    }

    /**
     * Marks a task as done.
     *
     * @return The marked task.
     */
    public Task markTask() {
        isDone = true;
        return this;
    }

    /**
     * Unmarks a task.
     *
     * @return The unmarked task.
     */
    public Task unmarkTask() {
        isDone = false;
        return this;
    }

    public boolean getIsDone() {
        return isDone;
    }

    public String getTask() {
        return task;
    }

    @Override
    public String toString() {
        return isDone ? "[X] " + task : "[ ] " + task;
    }
}
