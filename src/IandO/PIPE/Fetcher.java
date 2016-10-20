package IandO.PIPE;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PipedInputStream;

/**
 * Created by dubo on 16/9/30.
 */
public class Fetcher extends Thread {
    private PipedInputStream pipedInputStream;
    public Fetcher(PipedInputStream pipedInputStream) {
        this.pipedInputStream=pipedInputStream;
    }
    public void run(){
        int num;
        DataInputStream dataInputStream=new DataInputStream(pipedInputStream);

        try{
            num= dataInputStream.readInt();
            System.out.println(num);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
