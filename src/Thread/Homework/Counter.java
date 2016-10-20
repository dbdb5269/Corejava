package Thread.Homework;

/**
 * Created by dubo on 16/9/27.
 */
public class Counter extends Thread {
    private Storage data;

    public Counter(Storage data){
        this.data = data;
    }

    public void run(){
        int num = 0;
        while(num<100){
            synchronized(data){
                if(!data.isCount){
                    data.setX(num++);
                    data.isCount = true;
                    data.notify();
                }else{
                    try{
                        data.wait();
                    }catch(Exception e){}
                }
            }
        }
    }
}
