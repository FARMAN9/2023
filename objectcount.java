public class objectcount {
    static int count = 0;

    objectcount() {
        count++;
    }

    public static void printcount() {
        System.out.println(count);
    }

    protected void finalize() {
        System.gc();
        count--;
    }

    public static void main(String a[]) {
        printcount();
        objectcount o[] = new objectcount[10];
        for (int i = 0; i < 10; i++) {
            o[i] = new objectcount();
        }
        new objectcount();
        printcount();
        o[1].finalize();
        printcount();
        System.gc();
        printcount();

    }

}
