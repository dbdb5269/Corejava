package WebServer;

/**
 * Created by dubo on 16/10/13.
 */
import java.io.*;
import java.net.*;
public class PictureThread implements Runnable{
    private Socket socket;

    public PictureThread(Socket socket){
        this.socket=socket;
    }

    @Override
    public void run(){
        String hostAddress=socket.getInetAddress().getHostAddress();
        try{
            System.out.println(hostAddress+"...connected...");
            DataInputStream dataInputStreamFromClient=new DataInputStream(socket.getInputStream());
            long currentTimeMillis=dataInputStreamFromClient.readLong();
            InputStream inputStreamFromClient=socket.getInputStream();
            FileOutputStream fileOutputStreamToFile=new FileOutputStream(new File("files/server_"+currentTimeMillis+".jpg"));
            byte[] data=new byte[1024];
            int len=0;
            while((len=inputStreamFromClient.read(data))!=-1){
                fileOutputStreamToFile.write(data,0,len);
            }
            OutputStream outputStreamToClient=socket.getOutputStream();
            outputStreamToClient.write((hostAddress+"上传成功。。。").getBytes());
            fileOutputStreamToFile.close();
            socket.close();
        }catch(Exception e){
            throw new RuntimeException(hostAddress+"上传失败。。。");
        }
    }
}
