package IandO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by dubo on 16/10/18.
 */

/*1.使用多线程
  2.使用随即流
  3.一个文件分俩半,一个线程负责第一个部分的内容,并且边读边写,
   另一个线程负责第二部分的内容,并且边读边写
 4.代码中只有俩个RandomAccessFile类型的对象 in out
 5.in负责读 out负责写,俩个线程对象中使用是同一对随即流对象(in out)，
 注意加锁
 */
public class Thunder{
    class Server extends Thread{
        private long start;
        private RandomAccessFile in;
        private RandomAccessFile out;
        private long end;
        public Server(RandomAccessFile in,RandomAccessFile out,long start,long end){
            this.in=in;
            this.out=out;
            this.start=start;
            this.end=end;

        }
        @Override
        public void run(){
            while(start<end){
                //System.out.println("线程的名字："+Thread.currentThread().getName());
                synchronized (Server.class) {
                    //标记开始读和写的位置
                    try {
                        in.seek(start);
                        out.seek(start);
                        //开始文章的读取操作
                        byte b[] = new byte[200];
                        int len = 0;
                        len = in.read(b);
                        if (start + len > end) {
                            len = (int) (end - start);
                        }
                        System.out.println(Thread.currentThread().getName()+"本次读取："+len+"个字节");
                        start = start + len;
                        out.write(b, 0, len);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }


        }
    }

    public static void main(String[] args) {
        File file=new File("a.txt");
        File fileout=new File("b.txt");
        RandomAccessFile in=null;
        RandomAccessFile out=null;

        long length=file.length();

        try {
            in=new RandomAccessFile(file,"r");
            out=new RandomAccessFile(fileout,"rw");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Thunder thunder=new Thunder();

        Server thread=thunder.new Server(in,out,0,length/2);
        Server thread2=thunder.new Server(in,out,(length/2)+1,length);

        thread.start();
        thread2.start();

    }
}
