package Exception;

/**
 * Created by dubo on 16/9/24.
 */
//修改TestException.java，要求如下：
//        在命令行输入参数不能满足输出要求时，会抛出相应异常，使用异常处理机制处理抛出的异常。

public class TestException

{
    public static void main(String[] args)
    {
        try {
            System.out.println(args[0]);
            System.out.println(args[1]);
            System.out.println(args[2]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("参数异常");
        }


    }

}
