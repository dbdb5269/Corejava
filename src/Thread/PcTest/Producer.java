package Thread.PcTest;

/**
 * Created by dubo on 16/9/28.
 */
public class Producer extends Thread{
    private Value var;
    public Producer(String string,Value var){
        super(string);
        setVar(var);
    }

    public void setVar(Value var) {
        this.var = var;
    }

    public Value getVar() {
        return var;
    }
    public void run(){
        int sum=0;
        for(int i=0;i<100;i++){
            sum=sum+i;
        }
        var.setVar(sum);
        while(!var.isWait()){
            try {
                sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
        synchronized (var){
            var.notify();
        }
    }
}
