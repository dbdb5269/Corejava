package Thread.PcTest;

/**
 * Created by dubo on 16/9/28.
 */
public class Consumer extends Thread{
    private Value var;
    public Consumer(String string,Value var){
        super(string);
        setVar(var);
    }

    public Value getVar() {
        return var;
    }

    public void setVar(Value var) {
        this.var = var;
    }
    @Override
    public void run(){
        synchronized (var){
            try {

                var.setWait(true);

                var.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        int value=var.getVar();
        System.out.println(getName()+" eat "+value);
    }
}
