package IandO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by dubo on 16/10/18.
 */
public class Thunder2 extends Thread {
    private RandomAccessFile in;
    private RandomAccessFile out;
    private long start;
    private long end;
    private File fileout;
    public Thunder2(RandomAccessFile in,RandomAccessFile out,long start,long end,File fileout){
        this.in=in;
        this.out=out;
        this.start=start;
        this.end=end;
        this.fileout=fileout;
    }

    @Override
     public void run() {

        while (start<end){
            //dbdb5269
            // System.out.println("线程的名字："+Thread.currentThread().getName());
            //System.out.println(Thread.currentThread().getName());
           // System.out.println("while");
            synchronized (Thunder2.class) {

                try {
                    in.seek(start);
                    out.seek(start);
                    byte[] bytes = new byte[300];
                    int len = 0;
                    len = in.read(bytes);
                    if (start + len > end) {
                        len = (int) (end - start);
                    }

                    out.write(bytes, 0, len);
                    start = start + len;
                    System.out.println(Thread.currentThread().getName()+"本次读取："+len+"个字节");
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        }

    }

    public static void main(String[] args) {
        File file =new File("a.txt");
        File fileout =new File("b.txt");
        RandomAccessFile in= null;
        RandomAccessFile out=null;
        try {
            in = new RandomAccessFile(file,"r");
             out=new RandomAccessFile(fileout,"rw");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        long length=file.length();
        Thunder2 thunder=new Thunder2(in,out,0,length/2,fileout);
        Thunder2 thunder2=new Thunder2(in,out,length/2+1,length,fileout);
        thunder2.start();
        thunder.start();
    }
}
