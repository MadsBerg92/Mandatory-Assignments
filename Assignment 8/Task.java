public class Task {
    private String task;
    private int priority;
    private int workload;

    public Task(String task, int priority, int workload) {
        this.task = task;
        this.priority = priority;
        this.workload = workload;

    }

    @Override
    public String toString() {

        return task + " takes " + workload + " minutes and has priority " + priority;
    }

}
