package Thread;

/**
 * Created by dubo on 16/9/27.
 */
public class Race extends Thread {
    private String animal;
    private int max;
    private boolean stop;
    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }


    public Race(String name, int max) {
        setAnimal(name);
        setMax(max);
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }
    public void run(){

        for(int i=0;i<max;i++){
            if(!stop) {
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(currentThread().getId()+":"+i);;
            }
        }

        stop=true;
    }
    public static void main(String[] args) {
        Race rabit=new Race("rablit",100);
        Race tortoise=new Race("tortoise",100);
        rabit.start();
        tortoise.start();
    }
}
