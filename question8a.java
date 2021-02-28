package MultiThreading;
import java.util.*;
class MyTask extends TimerTask {
    public void run() {
        System.out.println("Task is running");
    }
}
public class question8a{
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new MyTask();
        timer.schedule(task, new Date());
    }
    public void run() {
        System.out.println("Performing the given task");
    }
}
