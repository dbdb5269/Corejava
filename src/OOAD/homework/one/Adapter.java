package OOAD.homework;

/**
 * Created by dubo on 16/10/21.
 */
public class Adapter extends Action implements Work {

    @Override
    public void doStart() {

    }

    @Override
    public void doRun() {
        run();
    }

    @Override
    public void doEnd() {

    }

    public static void main(String[] args) {
        Adapter adapter=new Adapter();
        adapter.doRun();
    }
}
