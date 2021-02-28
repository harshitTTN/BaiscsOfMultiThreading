package MultiThreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


class Processor implements Runnable{
    private int id ;
    public Processor (int id){
        this.id=id;
    }
    public void run(){
        System.out.println("Starting:" +id);
        try{
            Thread.sleep(5000);
        }catch(Exception e){System.out.println(e);}
        System.out.println("Completed" +id);
    }
}
public class question7 {
    public static void main(String args[]){
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for(int i=0;i<5;i++){
            executor.submit(new Processor(i));
        }
        executor.shutdown();
        System.out.println("ALL TASKS SUBMITTED");
        try{
            executor.awaitTermination(1, TimeUnit.DAYS);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("ALL TASKS COMPLETED");


    }
}