package OOAD.Cow;


import java.util.*;

/**
 * Created by dubo on 16/10/19.
 */
public class Farm {

    public static void main(String[] args) {
        int time=1;
        int id=2;
        int num=1;
        Cow cow1=new Cow(1,4);
        List<Cow> list=new ArrayList<Cow>();
        list.add(cow1);
        while(time<=10){
            System.out.println("************第"+time+"年");
            int size=list.size();
            //System.out.println(size);
            int i=0;
            while (i<size){
                Cow tempCow=list.get(i);


               if(tempCow.getAge()>=4){
                   list.add(tempCow.born(id,1));
                   id++;
               }
                System.out.println("牛:"+tempCow.getId()+"  age:"+tempCow.getAge());
               tempCow.grow();

                i++;

            }

            time++;

        }

//        Iterator iterator2=list.iterator();
//        while (iterator2.hasNext()){
//            Cow tempCow=(Cow)iterator2.next();
//            System.out.println(tempCow.getId());
//        }
    }
}
