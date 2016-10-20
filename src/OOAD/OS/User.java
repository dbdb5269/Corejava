package OOAD.OS;

/**
 * Created by dubo on 16/10/19.
 */
public class User {
    private String name;
    private Role role;

    public User(String name,Role role){
        this.role=role;
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
