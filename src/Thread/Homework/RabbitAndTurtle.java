package Thread.Homework;

/**
 * Created by dubo on 16/9/27.
 * 实现龟兔赛跑
 提示：可以采用Math.random()取得0~1之间的随机数模拟比赛进程，
 如总距离为100米，
 在随机数0~0.3之间代表兔子跑，每次跑2米，
 在0.3~1之间代表乌龟跑，每次跑1米，
 先跑完100米者为胜利者

 Race类：产生RabbitAndTurtle的两个实例，分别代表兔子和乌龟
 RabbitAndTurtle类：继承Thread类，实现赛跑的逻辑
 */
public class RabbitAndTurtle extends Thread{
    private String Animalname;
    private int max;
    private  static boolean stop=true;
    public RabbitAndTurtle(String name,int max){
        setAnimalname(name);
        setMax(max);
    }

    public String getAnimalname() {
        return Animalname;
    }

    public void setAnimalname(String animalname) {
        Animalname = animalname;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void run(){
//        int x=getMax();
//        int y=getMax();
        while(stop){
            if(getAnimalname().equals("Turtle")) {
                if (Math.random() > 0.3) {
                    max=max-1;

                    System.out.println("Turtle" + max);

                }
                if (max <= 0) {
                    System.out.println("Turtle win");
                    stop = false;
                    break;

                }
            }
            if(getAnimalname().equals("rabbit")) {
                if (Math.random() <= 0.3) {
                    max = max - 2;
                    System.out.println("Rabbit" + max);

                }
                if (max <=0) {
                    System.out.println("Rabbit win");
                    stop = false;
                    break;
                }
            }
        }

    }

}
