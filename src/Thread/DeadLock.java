package Thread;

/**
 * Created by dubo on 16/9/27.
 */
class DeadThread extends Thread{
    private Object a;
    private Object b;
    public DeadThread(Object a,Object b){
        this.a=a;
        this.b=b;
    }
    public void run(){
        synchronized (a){
            synchronized (b){
                System.out.println("deadThread");
            }
        }
    }
}

class DeadThread2 extends Thread{
    private Object a;
    private Object b;
    public DeadThread2(Object a,Object b){
        this.a=a;
        this.b=b;
    }
    public void run(){
        synchronized (b){
            synchronized (a){
                System.out.println("deadThread");
            }
        }
    }
}

public class DeadLock {
    public static void main(String[] args) {
        Object a=new Object();
        Object b=new Object();
        DeadThread th=new DeadThread(a,b);
        DeadThread2 th2=new DeadThread2(a,b);
        th.start();
        th2.start();
    }
}
