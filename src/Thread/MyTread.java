package Thread;

/**
 * Created by dubo on 16/9/26.
 */
public class MyTread extends Thread {
    private int max;
    public MyTread(int max){
        setMax(max);

    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
    public void run(){ //code在这里
        super.run();
        for(int i=0;i<max;i++){
            System.out.println(getId()+":"+i);
        }
    }
    public static void main(String[] args) {
        MyTread thread=new MyTread(150);
        MyTread thread2=new MyTread(150);
        MyTread thread3=new MyTread(150);

        thread.start();
        thread2.start();
        thread3.start();


    }
}
