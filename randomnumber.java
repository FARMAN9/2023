
import java.util.Random;

public class randomnumber {
    public static void ramd(int num) {
        for (int i = 0; i < num; i++) {
            Random n = new Random();

            System.out.println("\nrandom number :" + (n.nextInt(10)));

        }
    }

    public static void main(String[] args) {
        ramd(10);
    }
}
