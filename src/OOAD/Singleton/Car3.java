package OOAD.Singleton;



/**
 * Created by dubo on 16/10/20.
 */
public class Car3 {
    private static Car3 car3=null;
    private Car3(){

    }
    public synchronized static Car3 instance(){
        if (car3==null){
            return new Car3();
        }
        return car3;
    }
}
