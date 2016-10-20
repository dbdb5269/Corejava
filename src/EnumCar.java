
import static java.lang.System.out;
class MyException extends Exception{
    private String msg;
    public MyException(){
            this("");
    }
    public MyException(String msg){
            this.msg=msg;
    }
    public String getMessage(){
            return msg;
    }
}
public class EnumCar {
    private static final int MAX_X=3;
    private static final int MAX_Y=3;
    private static final int MIN_X=-3;
    private static final int MIN_Y=-3;
    private int x;
    private int y;
    private Direction state;
    public EnumCar() throws MyException{
        this(0,0,Direction.NORTH);
    }
    public EnumCar(int x,int y,Direction state) throws MyException{
        setX(x);
        setY(y);
        setState(state);
    }
    // other constructors
    public void setX(int x) throws MyException{
        if(x<MIN_X || x>MAX_X) {
            throw new MyException("setX error");
        }
        this.x=x;
    }
    public int getX(){
        return this.x;
    }
    public void setY(int y) throws MyException{
        if(y<MIN_Y || y>MAX_Y) {
            throw new MyException("setY error");
        }
        this.y=y;
    }
    public int getY(){
        return this.y;
    }
    public void setState(Direction state){
        this.state=state;
    }
    public Direction getState(){
        return this.state;
    }
    public String toString(){
        return "("+x+","+y+")"+state;
    }
    public void forward() throws MyException{
        state.forward(this);
    }
    public Direction turnLeft(){
        return state.turnLeft(this);
    }
    public Direction turnRight(){
        return state.turnRight(this);
    }
    public enum Direction{
        NORTH{
            public void forward(EnumCar car) throws MyException{
                car.setY(car.getY()+1);
            }
            public Direction turnLeft(EnumCar car){
                car.setState(WEST);
                return WEST;
            }
            public Direction turnRight(EnumCar car){
                car.setState(EAST);
                return EAST;
            }
        },
        SOUTH{
            public void forward(EnumCar car) throws MyException{
                car.setY(car.getY()-1);
            }
            public Direction turnLeft(EnumCar car){
                car.setState(EAST);
                return EAST;
            }
            public Direction turnRight(EnumCar car){
                car.setState(WEST);
                return WEST;
            }

        },
        WEST{
            public void forward(EnumCar car) throws MyException{
                car.setX(car.getX()-1);
            }
            public Direction turnLeft(EnumCar car){
                car.setState(SOUTH);
                return SOUTH;
            }
            public Direction turnRight(EnumCar car){
                car.setState(NORTH);
                return NORTH;
            }
        },
        EAST{
            public void forward(EnumCar car) throws MyException{
                car.setX(car.getX()+1);
            }
            public Direction turnLeft(EnumCar car){
                car.setState(NORTH);
                return NORTH;
            }
            public Direction turnRight(EnumCar car){
                car.setState(SOUTH);
                return SOUTH;
            }
        };
        public abstract void forward(EnumCar car) throws MyException;
        public abstract Direction turnLeft(EnumCar car);
        public abstract Direction turnRight(EnumCar car);
    }

    public static void main(String[] args){
        try{
            EnumCar car=new EnumCar();
            out.println(car);
            out.println("after foward():");
            car.forward();
            out.println(car);

            out.println("after turnLeft():");
            car.turnLeft();
            out.println(car);

            out.println("after turnRight():");
            car.turnRight();
            out.println(car);

            car.forward();
            car.forward();
            car.forward();
            car.forward();
            car.forward();
        }catch(MyException e){
            out.println(e.getMessage());
        }catch(Exception e){
//			out.println(e.printStackTrace());
        }finally{
            //一定会执行
        }
    }

}
