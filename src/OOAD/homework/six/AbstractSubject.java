package OOAD.homework.six;

import java.util.Iterator;
import java.util.Vector;

/**
 * Created by dubo on 16/10/23.
 */
public abstract class AbstractSubject  implements Subject{
    private Vector<Observer> vector = new Vector<Observer>();
    public void add(Observer observer) {
        vector.add(observer);
    }

    public void del(Observer observer) {
        vector.remove(observer);
    }

    public void notifyObservers() {
        Iterator<Observer> it = vector.iterator();
        while(it.hasNext()){
            Observer next = it.next();
            next.update();
        }
    }
}
