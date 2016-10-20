package Thread;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by dubo on 16/10/17.
 */
public class Test {




    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(4);
        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
