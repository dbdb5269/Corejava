package Mybatis.pojo;

import org.apache.ibatis.type.Alias;

/**
 * Created by dubo on 16/11/18.
 */
@Alias("wife")
public class Wife {
    private Integer id;
    private String name;
    private Husband husband;

    public Wife(String name,Husband husband) {

        this.name=name;
        this.husband=husband;
    }
    public Wife(){
        super();
    }
    @Override
    public String toString() {
        return "id="+id+"name="+name+"    husband="+"["+husband+"]";
    }

    public Husband getHusband() {
        return husband;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
