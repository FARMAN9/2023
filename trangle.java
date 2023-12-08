public class trangle {
    public static void main(String[] args) {
        for (int i = 100; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
                if (i % 2 == 0) {
                    System.out.print("" + i + "\t");
                }
            }
            System.out.println();
        }
    }

}
