package OOAD.homework.Two;

/**
 * Created by dubo on 16/10/21.
 */
public class preDecorator extends PersonDecorator {

    public preDecorator(Action action) {

        super(action);
    }

    @Override
    public void say(String name) {
        say2();
        super.say(name);
    }

    public void say2(){
        System.out.print("briuo_");

    }


}
