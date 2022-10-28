
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Todo {
    List<Task> todos = new ArrayList<>();
    List<Integer> totalMinutes = new ArrayList<>();
    List<Task> prioritizedList = new ArrayList<>();

    public Todo() {

    }

    public void addTask(String description, int priority, int minutes) {
        if (priority > 4 || priority <= 0) {
            System.out.println(description + " has invalid priority");
        }
        if (minutes < 0) {
            System.out.println(description + " has invalid workload");
        }

        todos.add(new Task(description, priority, minutes));

    }

    public void print() {
        System.out.println("Todo:\n-----");

        for (Task task : todos) {

            System.out.println(task);

        }
        if (todos.isEmpty()) {
            System.out.println("You're all done for today! #TodoZero");
        }

        if (totalMinutes.size() > 0) {
            int counter = 0;
            for (int i = 0; i < totalMinutes.size(); i++) {
                int totalWork = totalMinutes.get(i);

                counter += totalWork;

            }
            System.out.println(counter + " minutes of work done!");

        }

    }

    public void completeTask(int index) {
        try {
            int workload = todos.get(index).getWorkload();

            totalMinutes.add(workload);

            todos.remove(index);

        } catch (Exception e) {
            System.out.println("Invalid index");
        }

    }

    public void printPriority(int limit) {
        System.out.println("Filtered todo:\n--------------");
        int counter = 0;
        for (Task task : todos) {
            if (limit >= task.getPriority()) {
                prioritizedList.add(task);
                counter++;
                System.out.println(task);
            }

        }
        if (counter == 0) {
            System.out.println("No tasks with given priority");
        }
    }

    public void printPrioritized() {
        System.out.println("Prioritized todo:\n-----------------");
        todos.sort(Comparator.comparing(Task::getPriority).thenComparing(Task::getWorkload));
        todos.forEach(task -> System.out.println(task));

    }

}
