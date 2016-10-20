package ch05;

/**
 * Created by dubo on 16/9/21.
 */
public class Shape {
    private int x;
    private int y;
    public Shape(){
        this.x=0;
        this.y=0;
    }
    public Shape(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void draw(){
        System.out.println("Shape draw");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
