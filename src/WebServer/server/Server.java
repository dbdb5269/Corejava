package WebServer.server;

import WebServer.thread.ServerThread;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

/**
 * Created by dubo on 16/10/11.
 */
public class Server {
    private ServerSocket serverSocket;
    private int port;
    private static Properties prop;
    static {
        prop=new Properties();

        try {
            prop.load(new FileInputStream( new File("files/server.properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void init(){
        try {
            port=Integer.parseInt(prop.getProperty("port"));
            serverSocket=new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public  void recive(){

        ServerThread serverThread= null;
        try {
            System.out.println("wait ");
            serverThread = new ServerThread(serverSocket.accept());
            System.out.println("获得链接");
        } catch (IOException e) {
            e.printStackTrace();
        }
        serverThread.start();
//        try {
//            serverThread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
    public static void main(String[] args) {
        Server server=new Server();
        server.init();
        while(true){
            server.recive();
        }
    }
}
