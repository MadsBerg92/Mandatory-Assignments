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
        String statement = "";
        switch (priority) {
            case 1:
                statement = "very important";
                break;
            case 2:
                statement = "important";
                break;
            case 3:
                statement = "unimportant";
                break;
            case 4:
                statement = "after learn Portuguese";
                break;

        }

        return task + " takes " + workload + " minutes and has priority " + statement;

    }

    public int getWorkload() {
        return workload;
    }

    public int getPriority() {
        return priority;
    }

}
