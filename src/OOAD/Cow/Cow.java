package OOAD.Cow;

/**
 * Created by dubo on 16/10/19.
 */
public class Cow {
    private int age;
    private int id;
    public Cow(int id,int age){
        this.id=id;
        this.age=age;
    }
    public Cow(){
        this.age=0;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Cow born(int id,int age){
        return new Cow(id,age);
    }
    public void grow(){
        age++;
    }
}
