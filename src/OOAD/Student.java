package OOAD;

/**
 * Created by dubo on 16/10/19.
 */
public class Student extends Person {
    public Student(String name){
        super(name);
    }

    @Override
    public void eat(Fruit fruit) {
        System.out.println(super.getName()+fruit.getName());
    }

    public static void main(String[] args) {
        Student student=new Student("xiaoming");
        Teacher teacher=new Teacher("wang");

        Fruit fruit=new Fruit("香蕉");
        Fruit fruit2=new Fruit("苹果");

        student.eat(fruit);
        teacher.eat(fruit2);
    }
}
