package MultiThreading;
class Table{

    void printTable(int n){
        synchronized(this){
            for(int i=1;i<=5;i++){
                System.out.println(n*i);
                try{
                    Thread.sleep(4000);
                }catch(Exception e){System.out.println(e);}
            }
        }
    }
}

public class question11{
    public static void main(String args[]){
        final Table obj = new Table();

        Thread t1=new Thread(){
            public void run(){
                obj.printTable(6);
            }
        };
        Thread t2=new Thread(){
            public void run(){
                obj.printTable(10);
            }
        };
        t1.start();
        t2.start();
    }
}