package IandO.PIPE;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * Created by dubo on 16/9/30.
 */
public class Sender extends Thread {
    private PipedOutputStream pipedOutputStream;
    public Sender(PipedOutputStream pipedOutputStream){
        this.pipedOutputStream=pipedOutputStream;
    }
    public void run(){
        int num=100;
        DataOutputStream dataOutputStream=new DataOutputStream(pipedOutputStream);
        try {
            dataOutputStream.writeInt(num);
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
