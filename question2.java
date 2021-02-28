package MultiThreading;
class Thread1 extends Thread {

    public void run() {
        System.out.println("Starting Thread 1 ......");

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

class Thread2 implements Runnable {

    public void run() {

        System.out.println("Starting Thread 2 ......");
    }
}

public class question2 {

    public static void main(String[] args) throws InterruptedException
    {
        Thread t1 = new Thread1();
        t1.start();
        t1.join();

        Thread t2 = new Thread(new Thread2());
        t2.start();
        t2.join();



    }
}