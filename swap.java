public class swap {
    swap(int a, int b) {
        System.out.println("A=" + a);
        System.out.println("B=" + b);
        a = a + b;// 3+4=7
        b = a - b;// 7-4=3
        a = a - b;// 7-3=
        System.out.println("-----swap-----");
        System.out.println("A=" + a);
        System.out.println("B=" + b);
    }

    public static void main(String[] args) {
        new swap(400000000, 1000000000);

    }
}