package NetWork;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by dubo on 16/10/8.
 */
public class TimeTCPClient {
    public static void main(String[] args) {
        Socket s=null;
        BufferedWriter bw=null;
        BufferedReader br=null;
        try {
            s=new Socket(InetAddress.getByName("127.0.0.1"),10000);
            bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bw.write("need time");
            bw.newLine();
            bw.flush();
            br=new BufferedReader(new InputStreamReader(s.getInputStream()));
            String timeMsg=br.readLine();
            System.out.println(timeMsg);


        } catch (UnknownHostException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(bw !=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(br !=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if(s !=null) try {
                s.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
