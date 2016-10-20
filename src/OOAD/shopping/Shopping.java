package OOAD.shopping;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dubo on 16/10/19.
 */
public class Shopping {
    public static void main(String[] args) {
        Car car=new Car();
        Goods goods1=new Goods(1,"good1",100);
        Goods goods2=new Goods(2,"good2",300);
        Goods goods3=new Goods(3,"good3",200);
        Goods goods4=new Goods(4,"good4",500);
        Goods goods5=new Goods(5,"good5",700);
        Goods goods6=new Goods(6,"good6",1000);
        car.add(goods1);
        car.add(goods2);
        car.add(goods3);
        car.add(goods4);
        car.add(goods5);
        car.add(goods6);
        car.iterator();
        System.out.println(car.sum());
        car.removed(goods4);
        System.out.println("******");
        car.iterator();
        System.out.println(car.sum());
    }

}
