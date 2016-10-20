package Thread.Homework;

/**
 * Created by dubo on 16/10/17.
 */
public class Race2 implements Runnable{
    private static Boolean signal=true;
    private String name;
    private int max;
    public Race2(String name,int max){
        this.name=name;
        this.max=max;
    }

    public String getName() {
        return name;
    }

    @Override
//    public void run() {
//        while(signal) {
//            if(getName().equals("Turtle")){
//                System.out.println("Turtle"+max);
//                max=max-1;
//                if(max<=0){
//                    signal=false;
//                    System.out.println("Turtle win");
//                }
//            }else {
//                System.out.println("Rabbit"+max);
//                max=max-2;
//                if(max<=0){
//                    signal=false;
//                    System.out.println("Rabbit win");
//                }
//            }
//        }
//    }
    public void run(){
        while (signal){
            max=max-2;
            System.out.println(getName()+max);
            if(max<=0){
                    signal=false;
                    System.out.println(getName()+" win");
                }
        }
    }
}
