import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DrinkingSongGenerator ds = new DrinkingSongGenerator(88, "bottles", "wine");
        Scanner scanner = new Scanner(System.in);

        // int n = scanner.nextInt();
        // String c = scanner.next();
        // String d = scanner. next();
        System.out.println(ds.toString());

        // DrinkingSongGenerator ds1 = new DrinkingSongGenerator(14, "kegs", "mead");

        // System.out.println(ds1.toString());

        scanner.close();

    }

}
