/*对象之间3种语义关系
*1.is a :继承实现代码复用
*has a:组合（构造制造存在）和聚合（set）
*use a:参数形式 Person｛max（Compare c){}}很弱关系
*
*
*/


package shape2;



public class ShapeTest{
	public static void main(String[] args){
		Graphics g=new Graphics();
		int r=9;
		Point p=new Point(2,3);
		
		Shape s=new Circle(p,r);
		g.drawShape(s);
		s=new Rectangle(p,3,4);
		Rectangle rectangle=(Rectangle) s;

		g.drawShape(s);
	}
}	
