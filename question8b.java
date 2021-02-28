package MultiThreading;
import java.util.*;
//public class question8b{
//    public static void main(String[] args) {
//
//        Timer t = new Timer();
//        TimerTask tt = new TimerTask() {
//            @Override
//            public void run() {
//                for(int i=1; i<=10;i++)
//                {
//                    System.out.println("Task Timer on Fixed Rate");
//                }
//            };
//        };
//        t.scheduleAtFixedRate(tt,500,1000);
//    }
//}
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class question8b {

    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
        System.out.println("Scheduling thread.");
        executorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println(new Date() + " Display thread");
            }
        }, 2, 5, TimeUnit.SECONDS);
    }
}