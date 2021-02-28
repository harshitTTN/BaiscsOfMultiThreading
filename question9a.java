package MultiThreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class question9a  {

    public static void main(final String[] arguments) throws InterruptedException {
        ExecutorService excr = Executors.newCachedThreadPool();
        ThreadPoolExecutor mypool = (ThreadPoolExecutor) excr;
        System.out.println("size of mypool: " + mypool.getPoolSize());
        excr.submit(new Threadimpl());
        excr.submit(new Threadimpl());
        System.out.println("Total number threads scheduled): "+ mypool.getTaskCount());
        excr.shutdown();
    }

    static class Threadimpl implements Runnable {

        public void run() {

            try {
                Long num = (long) (Math.random() / 30);

                TimeUnit.SECONDS.sleep(num);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}