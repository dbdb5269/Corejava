package Thread;

/**
 * Created by dubo on 16/9/27.
 */
public class MyRunable implements Runnable{
    private int max;


    public MyRunable() {
        this(100);
    }
    public MyRunable(int max){
        super();
        setMax(max);
    }
    @Override
    public void run(){
        for(int i=0;i<max;i++){
            System.out.println(Thread.currentThread().getId()+":"+i);
        }
    }

    public void setMax(int max) {
        if(max<0){
            return;
        }
        this.max = max;
    }

    public int getMax() {
        return max;
    }

    public static void main(String[] args) {
        System.out.println("main:"+Thread.currentThread().getId());
        MyRunable myRunable=new MyRunable(120);
        Thread th=new Thread(myRunable);
        Thread th2=new Thread(myRunable);
        Thread th3=new Thread(myRunable);
        th.start();
        th2.start();
        th3.start();
    }
}
