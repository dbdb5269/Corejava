package OOAD.Singleton;

/**
 * Created by dubo on 16/10/20.
 */
public class Car {
    private static Car instance = new Car();
    private Car(){

    }
    public static Car instance(){
        return instance;
    }
}
