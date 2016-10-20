package WebServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.net.Socket;

/**
 * Created by dubo on 16/10/13.
 */
//PictureClient.java
public class PictureClient {
    public static void main(String[] args) {
        Socket socket = null;
        DataOutputStream dos = null;
        DataInputStream dis = null;
        try {
            socket = new Socket("127.0.0.1", 7676);
            dis = new DataInputStream(new FileInputStream("files/1.txt"));
            dos = new DataOutputStream(socket.getOutputStream());
            int length = 0;
            byte[] chars = new byte[1024];
            while ((length = dis.read(chars)) != -1) {
                dos.write(chars, 0, length);
            }
            dos.flush();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        } finally {
            try {
                dos.close();
                dis.close();
                socket.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(-1);

            }
        }
    }

}
