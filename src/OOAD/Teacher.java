package OOAD;

/**
 * Created by dubo on 16/10/19.
 */
public class Teacher extends Person {
    private String name;
    public Teacher(String name){
        super(name);
    }

    @Override
    public void eat(Fruit fruit) {
        System.out.println(super.getName()+fruit.getName());
    }
}
