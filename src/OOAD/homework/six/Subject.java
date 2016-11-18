package OOAD.homework.six;

/**
 * Created by dubo on 16/10/23.
 */
public interface Subject {
    public void add(Observer observer);

    /*删除观察者*/
    public void del(Observer observer);

    /*通知所有的观察者*/
    public void notifyObservers();

    /*自身的操作*/
    public void operation();
}
