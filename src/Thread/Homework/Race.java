package Thread.Homework;

import Thread.Account.SeverceThread;

/**
 * Created by dubo on 16/9/27.
 *
 *
 * 实现龟兔赛跑
 提示：可以采用Math.random()取得0~1之间的随机数模拟比赛进程，
 如总距离为100米，
 在随机数0~0.3之间代表兔子跑，每次跑2米，
 在0.3~1之间代表乌龟跑，每次跑1米，
 先跑完100米者为胜利者

 Race类：产生RabbitAndTurtle的两个实例，分别代表兔子和乌龟
 RabbitAndTurtle类：继承Thread类，实现赛跑的逻辑
 */
public class Race {
    public static void main(String[] args) {
//        RabbitAndTurtle rabbit=new RabbitAndTurtle("rabbit",100);
//        RabbitAndTurtle Turtle=new RabbitAndTurtle("Turtle",100);
//        rabbit.start();
//        Turtle.start();

        Race2 rabbit=new Race2("rabbit",100);
        Race2 Turtle=new Race2("Turtle",100);
        Thread thread=new Thread(rabbit);
        Thread thread2=new Thread(Turtle);
        thread.start();
        thread2.start();

    }
}
