import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random n = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(n.nextFloat(30 - 5) + 5);
        }

    }

}
