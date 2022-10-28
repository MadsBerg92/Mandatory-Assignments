
public class Main {
    public static void main(String[] args) {

        Todo todo = new Todo();
        todo.addTask("Go fishing", 3, 40);
        todo.addTask("Cut the grass", 4, 60);
        todo.addTask("Fire up", 1, 50);
        todo.addTask("vacuum", 2, 20);

        // todo.completeTask(0);
        // todo.completeTask(0);
        // todo.completeTask(0);
        // todo.completeTask(0);

        todo.printPriority(2);
    }

}
