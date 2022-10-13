public class Student {

    private String name;
    private int age;

    public Student(String n, int a) {
        name = n;
        age = a;

    }

    public String getName() {
        return name;

    }

    public int getAge() {
        return age;

    }

    public String toString() {
        return "The name of the student is " + name + ". The student is " + age + " years old.";
    }

    public void setName(String newname) {
        name = newname;

    }

    public void setAge(int newage) {
        if (newage < 16) {
            System.out.println("The university does not accept students below 16");
        } else if (newage > 99) {
            System.out.println("The university does not accept students that are older than 99");
        } else if (newage >= 15 && newage <= 99) {
            age = newage;

        }
    }

}