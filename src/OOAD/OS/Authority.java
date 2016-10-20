package OOAD.OS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by dubo on 16/10/19.
 */
public class Authority {
    private String name;

    public Authority(String name){

        this.name=name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String canDO(){
        return getName();
    }

}
