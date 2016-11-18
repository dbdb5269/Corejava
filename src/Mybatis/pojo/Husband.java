package Mybatis.pojo;

import org.apache.ibatis.type.Alias;

/**
 * Created by dubo on 16/11/18.
 */
@Alias("hus")
public class Husband {
    private Integer id;
    private String name;

    public Husband(){
        super();
    }
    public Husband(String name){

        this.name=name;
    }

    @Override
    public String toString() {
        return "id="+id+"name="+name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
