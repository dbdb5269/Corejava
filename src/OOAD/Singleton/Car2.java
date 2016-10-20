package OOAD.Singleton;



/**
 * Created by dubo on 16/10/20.
 */
public class Car2 {
    private static Car2 car2=null;
    private Car2(){

    }
    public static Car2 instance(){
        if (car2==null){
            return new Car2();
        }
        return car2;
    }
}
