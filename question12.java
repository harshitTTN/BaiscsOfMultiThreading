package MultiThreading;
import java.util.concurrent.atomic.AtomicInteger;

class Counter extends Thread {

    // Atomic counter Variable
    AtomicInteger count;

    // Constructor of class
    Counter() {
        count = new AtomicInteger();
    }

    public void run() {

        int max = 1_000_00_000;

        for (int i = 0; i < max; i++) {
            count.addAndGet(1);
        }
    }
}

public class question12 {
    public static void main(String[] args)
            throws InterruptedException {

        Counter c = new Counter();


        Thread first = new Thread(c, "First");
        Thread second = new Thread(c, "Second");


        first.start();
        second.start();

        first.join();
        second.join();


        System.out.println(c.count);
    }
}