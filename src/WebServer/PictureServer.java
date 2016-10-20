package WebServer;

/**
 * Created by dubo on 16/10/13.
 */
//PictureServer.java
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class PictureServer extends Thread {
    Socket socket = null;

    public PictureServer(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        DataOutputStream dos = null;
        DataInputStream dis = null;
        try {
            dis = new DataInputStream(socket.getInputStream());
            dos = new DataOutputStream(new FileOutputStream("files/2.txt"));
            int length = 0;
            byte[] chars = new byte[1024];
            while ((length = dis.read(chars)) != -1) {
                dos.write(chars, 0, length);
            }
            dos.flush();
            System.out.println("传输完成");
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        } finally {
            try {
                dos.close();
                dis.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(-1);

            }
        }
    }

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(7676);
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("传输开始");
                PictureServer server = new PictureServer(socket);
                server.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        } finally {
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(-1);
            }
        }
    }
}
