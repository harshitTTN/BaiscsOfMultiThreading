package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class hello implements Runnable {

    private int id;

    public hello(int i) {

        this.id = i;
    }

    public void run() {

        System.out.println("Started Task Number " + id);

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {

        }

        System.out.println("Completed Task Number " + id);

    }
}

public class question4 {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 5; i++) {
            executor.submit(new hello(i));
        }

        executor.shutdown();

        System.out.println("Stop the Process");

        executor.shutdownNow();
    }

}
