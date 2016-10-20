package ch05;

/**
 * Created by dubo on 16/9/21.
 */
public class Circle extends Shape {
    private double r;
    public Circle(){
        this.r=1.0;
    }
    public Circle(int x,int y,int r){
        super(x,y);
        this.r=r;
    }
    public Circle(int r){
        this.r=r;
    }
    public void draw(){
        System.out.println("draw circle"+getX()+","+getY()+","+r);
    }
}
