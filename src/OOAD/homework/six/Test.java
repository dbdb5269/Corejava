package OOAD.homework.six;

/**
 * Created by dubo on 16/10/23.
 */
public class Test {
    public static void main(String[] args) {
        Subject sub = new MySubject();
        sub.add(new Father());
        sub.add(new Mother());
        sub.operation();
    }
}
