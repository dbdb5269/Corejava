package OOAD.Singleton;



/**
 * Created by dubo on 16/10/20.
 */
public class Car4 {
    private static Car4 car4=null;
    private Car4(){

    }
    public  static Car4 instance(){
        if (car4==null){
            synchronized(car4){
                if (car4==null){
                    return new Car4();
                }

            }

        }
        return car4;
    }
}
