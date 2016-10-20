package Thread.PcTest;

/**
 * Created by dubo on 16/9/28.
 */
public class CPTest {
    public static void main(String[] args) {
        Value var=new Value();
        Producer th1=new Producer("producer",var);
        Consumer th2=new Consumer("consumer",var);
        th1.start();
        th2.start();
    }
}

