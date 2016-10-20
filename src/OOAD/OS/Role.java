package OOAD.OS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by dubo on 16/10/19.
 */
public class Role {
    private String name;
    private List<Authority> list=new ArrayList<>();

    public List<Authority> getList() {
        return list;
    }

    public void setList(List<Authority> list) {
        this.list = list;
    }
    public void add(Authority authority){
        list.add(authority);
    }

    public Role(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        for(Authority a:list){
            System.out.println(a.canDO());
        }
    }

}
