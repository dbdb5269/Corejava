package WebServer.thread;

import WebServer.request.Request;
import WebServer.response.Response;

import java.net.Socket;

/**
 * Created by dubo on 16/10/11.
 */
public class ServerThread extends Thread {
    private Socket socket;
//    public ServerThread(){
//        super();
//    }
    public ServerThread(Socket socket){
        super();
        this.socket=socket;
    }
    @Override
    public void run(){
        System.out.println("建立socket");
        Request request=new Request(socket);
        System.out.println("获得request");
        request.inputstream();

        Response response=new Response(socket,request.url(),request.br());
        response.response();
        System.out.println("response结束");

    }
}
