package shape2;
public class Point extends Shape{
	private int x;
	private int y;
	public Point(int x,int y){
		this.x=x; //setX(x)
		this.y=y; //setY(y)
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public double area(){
		return 0;
	}
	public void draw(){
		System.out.println("draw Point");
	}
}
