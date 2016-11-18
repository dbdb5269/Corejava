package WebServer;

import java.io.*;
import java.net.Socket;

/**
 * Created by dubo on 16/10/18.
 */
public class FileClient {

    public static void main(String[] args) {
        DataInputStream dataInputStream=null;
        DataOutputStream dataOutputStream=null;
        try {
            Socket client=new Socket("http://202.207.247.42/Pages/Cjd/Xszp.aspx?xh=2013005239",80);

            File file=new File("TA.jpg");
            FileInputStream fileInputStream=new FileInputStream(file);

            dataInputStream=new DataInputStream(fileInputStream);
            dataOutputStream=new DataOutputStream(client.getOutputStream());
            byte[] bytes=new byte[1024];
            int length=0;
            while ((length=dataInputStream.read(bytes))!=-1){

                dataOutputStream.write(bytes,0,length);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                dataInputStream.close();
                dataOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
