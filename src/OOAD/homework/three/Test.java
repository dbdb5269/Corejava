package OOAD.homework.three;

/**
 * Created by dubo on 16/10/23.
 */
public class Test {
    public static void main(String[] args) {
        Person admin=new Person("Admin");
        Person user=new Person("user");
        Check check = new Check();
        Proxy proxy=new Proxy(check);
        proxy.showUsersInfo(admin);
        proxy.showUsersInfo(user);
    }
}
