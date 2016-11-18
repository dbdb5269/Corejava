package OOAD.homework.six;

/**
 * Created by dubo on 16/10/23.
 */
public class MySubject extends AbstractSubject{
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }
}
