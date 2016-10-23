package OOAD.homework.Two;

/**
 * Created by dubo on 16/10/21.
 */
public class Test {
    public static void main(String[] args) {

            //Action a=new Person();
            Action a = new preDecorator(new Person());
            a.say("dubo");

    }
}
