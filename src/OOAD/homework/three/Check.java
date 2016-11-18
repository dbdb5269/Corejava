package OOAD.homework.three;

import OOAD.*;

/**
 * Created by dubo on 16/10/23.
 */
public class Check implements Method {
    @Override

    public void showUsersInfo(Person person) {
        if(person.getName().equals("Admin")){
            System.out.println("check succeed");
        }else {
            System.out.println("fail");
        }

    }
}
