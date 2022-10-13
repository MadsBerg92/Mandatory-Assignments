public class Main {
    public static void main(String[] args) {
    Student student = new Student("Max", 34);
    System.out.println(student.toString());
    student.setAge(50);
    System.out.println(student.toString());
    student.setName("Romeo");
    System.out.println(student.toString());
    student.setAge(9);
    student.setAge(16);
    System.out.println(student.toString());
    student.setAge(99);
    System.out.println(student.toString());
    student.setAge(100);
    }
    
}
