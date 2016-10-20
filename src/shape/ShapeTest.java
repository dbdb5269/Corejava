package shape;

/**
 * Created by dubo on 16/9/13.
 */
public class ShapeTest{
    public static void draw(Shape s){
        s.draw();
    }
    public static void draw(Shape s,String title){
        s.draw(title);
    }
    public static void main(String[] args){

        Shape s=new Shape();
        draw(s);
        draw(s,"hello");

        s=new Circle();
        draw(s);
        draw(s,"hello Circle");
        s=new Rectangle();
        draw(s);
        draw(s,"hello Rectangle");
    }
}
