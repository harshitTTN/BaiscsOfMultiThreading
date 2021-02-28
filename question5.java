package MultiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Yes implements Runnable {

    private int id;

    public Yes(int i) {

        this.id = i;
    }

    public void run() {

        System.out.println("Started Task Number " + id);

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {

        }

        System.out.println("Completed Task Number " + id);

    }
}

public class question5 {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 5; i++) {
            executor.submit(new Yes(i));
        }

        System.out.println("IsShutdown : "+executor.isShutdown());

        System.out.println("IsTerminated : "+executor.isTerminated());

        executor.shutdown();

        System.out.println("Stop the process");

        System.out.println("IsShutdown : "+executor.isShutdown());

        System.out.println("IsTerminated : "+executor.isTerminated());
    }

}