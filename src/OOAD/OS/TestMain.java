package OOAD.OS;

/**
 * Created by dubo on 16/10/19.
 */
//在系统中有用户，角色，权限，一种权限对应一个操作,使用面向对象的方式把完成上述功能的代码结构，并且简单的进行测试
public class TestMain {
    public static void main(String[] args) {
        Role role=new Role("admin");
        User user=new User("dubo",role);
        Authority authority=new Authority("rw");
//        Operate operate=new Operate("读写",authority);
//        operate.toString(operate,user);

    }
}
