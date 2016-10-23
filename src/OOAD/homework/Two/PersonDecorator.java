package OOAD.homework.Two;

/**
 * Created by dubo on 16/10/21.
 */
public abstract class PersonDecorator implements Action {
    private Action action;
    public PersonDecorator(Action action){
        this.action=action;
    }

    public void say(String name) {
        this.action.say(name);
    }

}
