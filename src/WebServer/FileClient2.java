package WebServer;

import javax.imageio.stream.FileImageInputStream;
import java.io.*;
import java.net.Socket;

/**
 * Created by dubo on 16/10/18.
 */
public class FileClient2 {
    public static void main(String[] args) {
        try {
            Socket socket=new Socket("localhost",8888);
            File file=new File("TA.jpg");
            //FileImageInputStream fileImageInputStream=new FileImageInputStream(file);
            FileInputStream fileInputStream=new FileInputStream(file);
            InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream);
            OutputStream outputStream=socket.getOutputStream();
            OutputStreamWriter outputStreamWriter=new OutputStreamWriter(outputStream);
            BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
            BufferedWriter bufferedWriter=new BufferedWriter(outputStreamWriter);
            while (bufferedReader.ready()){
                bufferedWriter.write(bufferedReader.readLine());
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
