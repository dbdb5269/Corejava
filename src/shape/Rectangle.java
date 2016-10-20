package shape;

/**
 * Created by dubo on 16/9/13.
 */
public class Rectangle extends Shape{
    public void draw(){
        System.out.println("Rectangle draw()");
    }
    public void draw(String s){
        System.out.println("Rectangle draw(String)"+s);
    }
}
