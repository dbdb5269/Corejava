package NetWork;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Date;

/**
 * Created by dubo on 16/10/8.
 */
public class TimeUDPServer {
    public static void main(String[] args) {
        //接收端书写

        DatagramSocket ds=null;
        try {
            //step1 DatagramSocket(int port)
            //创建一个数据报socket 绑定指定端口
            ds=new DatagramSocket(10001);
            //step2 调用DatagramPacket(byte[] buf,int length)
            //建立一个数据报,其中buf是缓冲区
            byte[] buf=new byte[1024];
            DatagramPacket dp=new DatagramPacket(buf,buf.length);
            //step3调用DatagramSocket的receive()接受UDP包
            try {
                ds.receive(dp);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(new String(buf));
            //发送时间信息
            //step1:调用DatagramSocket()创建一个数据报socket ----ds
            //step2:DatagramPacket(byte buf,int offset,int length,InetAddress addr, int port)
            buf =new Date().toString().getBytes();
            DatagramPacket dp2=new DatagramPacket(buf,0,dp.getAddress(),dp.getPort());
            //step3:调用调用DatagramSocket.send发送UDP包
            try {
                ds.send(dp2);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }finally {
            if(ds !=null){
                ds.close();
            }
        }
        //
    }
}
