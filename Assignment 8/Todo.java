import java.util.ArrayList;
import java.util.List;

public class Todo {
    List<Task> todos = new ArrayList<>();

    public Todo() {

    }

    public void addTask(String description, int priority, int minutes) {
        if (priority > 4) {
            System.out.println(description + "has invalid priority");
        }
        if (minutes < 0) {
            System.out.println(description + "has invalid workload");
        }

        todos.add(new Task(description, priority, minutes));

    }

    public void print() {
        System.out.println("TODO\n--------------");
        for (Task task : todos) {
            System.out.println(task);

        }

    }

    public void completeTask(int index) {

    }

}
