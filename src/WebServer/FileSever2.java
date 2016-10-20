package WebServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by dubo on 16/10/18.
 */
public class FileSever2 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket=new ServerSocket(8888);
            Socket socket=serverSocket.accept();
            InputStream inputStream=socket.getInputStream();
            InputStreamReader inputStreamReader=new InputStreamReader(inputStream);
            BufferedReader bufferedReader=new BufferedReader(inputStreamReader);

            File file=new File("x.jpg");
            FileOutputStream fileOutputStream=new FileOutputStream(file);
            OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fileOutputStream);
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
