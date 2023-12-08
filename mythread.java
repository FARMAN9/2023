public class mythread implements Runnable {
    public void run() {
        System.err.println("Thread i ruu ab");
    }

    public static void main(String args[]) {
        mythread t[];
        Thread t1[];
        for (int i = 0; i < 5; i++) {
            t[i] = new mythread();
        }

    }
}
