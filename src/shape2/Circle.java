package shape2;
public class Circle extends Shape{
	private Point point;
	private int r;
	private static double PI=3.14;
	@Override
	public double area(){

		return PI*r*r;
	}
	public void draw(){

		System.out.println("("+point.getX()+","+point.getY()+") r="+r);
	}
	public Circle(Point p,int r){
		point=p; //setPoint(p)
		this.r=r;
	}
}
