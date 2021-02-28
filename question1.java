package MultiThreading;
//class T2 extends Thread{
//    public void run(){
//        System.out.println("Thread t1");
//    }
//}
class T1 implements Runnable{
    public void run(){
        System.out.println("Thread t2");
    }
}
public class question1 {
    public static void main(String[] args){
//        T2 obj = new T2();
//        obj.start();
        T1 obj = new T1();
        Thread t = new Thread(obj);
        t.start();
    }
}
