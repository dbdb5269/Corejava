package OOAD.homework.three;

/**
 * Created by dubo on 16/10/23.
 */
public class Proxy implements Method{
    private Check check;
    public Proxy(Check check){
        this.check = check;
    }

    @Override
    public void showUsersInfo(Person person) {
        method1();
        check.showUsersInfo(person);
        method2();
    }
    public void method1(){

    }
    public void method2(){

    }
}
