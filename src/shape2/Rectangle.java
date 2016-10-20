package shape2;



/**
 * Created by dubo on 16/9/14.
 */
public class Rectangle extends Shape {
    private int height;
    private int width;
    private Point point;
    public Rectangle(Point point,int height,int width){
        setHeight(height);
        setWidth(width);
        setPoint(point);
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public Point getPoint() {
        return point;
    }

    @Override
    public void draw() {
        System.out.println(point.getX()+"-"+point.getY()+"-"+getWidth()+"-"+getHeight());

    }
}
