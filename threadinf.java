class mythread extends Thread {
    mythread(String name) {
        this.setName(name);
    }

    public void run() {
        while (true) {
            System.out.println(this.getName() + " running in infinte loop");
        }
    }
}

public class threadinf {
    public static void main(String[] args) {
        mythread t0 = new mythread("thread 0");
        mythread t1 = new mythread("thread 1");
        mythread t2 = new mythread("thread 2");
        mythread t3 = new mythread("thread 3");
        t0.start();
        t1.start();
        t2.start();
        t3.start();

    }

}
