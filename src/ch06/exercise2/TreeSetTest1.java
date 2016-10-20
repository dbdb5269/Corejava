package ch06.exercise2;

/**
 * Created by dubo on 16/9/20.
 */
/*使用TreeSet和Comparator,写TreeSetTest1
要求：对TreeSet中的元素"HashSet"、"ArrayList"、"TreeMap"、"HashMap"、"TreeSet"、"LinkedList"进行升序和倒序排列*/

import java.util.*;
public class TreeSetTest1 {
    public static void main(String[] args){
        List list3=new ArrayList();

        HashSet<Integer> hashSet= new HashSet<Integer>();
        hashSet.add(99);
        hashSet.add(3);
        hashSet.add(66);
        hashSet.add(12);
        hashSet.add(1);
        TreeSet maptreeSet=new TreeSet(hashSet);
        Iterator iterator3=maptreeSet.iterator();
        while (iterator3.hasNext()){
            System.out.println(iterator3.next());
        }
        SortedMap<Integer,String> sortedmap=new TreeMap<Integer,String>();
        sortedmap.put(11,"hello");
        sortedmap.put(2,"hello");
        sortedmap.put(5,"hello");
        sortedmap.put(1,"hello");
        sortedmap.put(8,"hello");

        List<Person> treeSet=new ArrayList<Person>();
        List<Person> c=new LinkedList<>();

//        Set<Map.Entry<Integer,String>> entries=sortedmap.entrySet();
//        Iterator <Map.Entry<Integer,String>> iterator2=entries.iterator();
        Iterator iterator2=sortedmap.entrySet().iterator();
        while (iterator2.hasNext()){

            Map.Entry entry=(Map.Entry)iterator2.next();
            System.out.println(entry.getKey());
        }
        // ArrayList<Person> treeSet=new ArrayList<>();

        Person p4=new Person("d",25,false);
        Person p5=new Person("e",26,false);
        Person p1=new Person("a",21,false);
        Person p2=new Person("b",23,false);
        Person p3=new Person("c",24,false);

        c.add(p1);
        c.add(p2);
        c.add(p3);
        c.add(p4);
        c.add(p5);


        Iterator iterator=c.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}


