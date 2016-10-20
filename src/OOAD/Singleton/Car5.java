package OOAD.Singleton;



/**
 * Created by dubo on 16/10/20.
 */
public class Car5 {
    private static class Car5instance{
        private static Car5 car5=new Car5();
    }
    private Car5(){

    }
    public  static Car5 instance(){
      return Car5instance.car5;
    }
}
