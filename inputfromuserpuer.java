import java.util.Scanner;

public class inputfromuserpuer {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                System.out.println("enter your name:");
                String name = in.nextLine();
                System.out.println("hello " + name);
            }
        }
    }

}
