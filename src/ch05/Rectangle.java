package ch05;

/**
 * Created by dubo on 16/9/21.
 */
public class Rectangle extends Shape {
    private double height;
    private double width;
    public Rectangle(){
        this.height=1.0;
        this.width=1.0;
    }
    public Rectangle(double height,double width){
        this.height=height;
        this.width=width;
    }
    public Rectangle(int x,int y,double height,double width){
        super(x,y);
        this.height=height;
        this.width=width;
    }
    public void draw(){
        System.out.println("draw in rectangle"+getX()+","+getX()+","+height+","+width);
    }
}
