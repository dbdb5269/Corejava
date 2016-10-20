package Thread;

/**
 * Created by dubo on 16/9/27.
 */
public class InteruptTest extends Thread {


    public void run(){
        try {
            sleep(10000);
        }catch (InterruptedException e){
            System.out.println("sleep interupted...");
            e.printStackTrace();
        }
        System.out.println("continue running");
    }
    public static void main(String[] args) {
        InteruptTest th=new InteruptTest();
        th.start();
        try{
            sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        th.interrupt();
    }
}
