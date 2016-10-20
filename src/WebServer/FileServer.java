package WebServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by dubo on 16/10/18.
 */
public class FileServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket=new ServerSocket(8888);
            Socket sever=serverSocket.accept();
            InputStream inputStream=sever.getInputStream();
            DataInputStream dataInputStream=new DataInputStream(inputStream);
            File file =new File("x.jpg");
            FileOutputStream fileOutputStream=new FileOutputStream(file);
            byte bytes[]=new byte[4];
            int length=0;
            while ((length=dataInputStream.read(bytes))!=-1){
                char c=(char)bytes[0];
                char c2=(char)bytes[1];
                System.out.println(c);
                System.out.println(c2);
                System.out.println(length);
                fileOutputStream.write(bytes,0,length);
            }
            System.out.println(length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
