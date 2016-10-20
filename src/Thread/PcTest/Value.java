package Thread.PcTest;

/**
 * Created by dubo on 16/9/28.
 */
public class Value {
    //produce
    private int var;
    private boolean isWait=false;

    public boolean isWait() {
        return isWait;
    }

    public void setWait(boolean wait) {
        isWait = wait;
    }

    public int getVar() {
        return var;
    }

    public void setVar(int var) {
        this.var = var;
    }

}
