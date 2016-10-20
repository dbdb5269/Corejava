package IandO.PIPE;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * Created by dubo on 16/9/30.
 */
public class PipeTest {
    public static void main(String[] args) {
        PipedOutputStream pipedOutputStream=new PipedOutputStream();
        PipedInputStream pipedInputStream=null;
        Thread t1=new Sender(pipedOutputStream);
        try {
            pipedInputStream=new PipedInputStream(pipedOutputStream);
        }catch (IOException e){
            e.printStackTrace();
        }

        Thread t2=new Fetcher(pipedInputStream);


        t1.start();
        t2.start();


    }
}
