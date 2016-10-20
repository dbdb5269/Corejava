package NetWork;

/**
 * Created by dubo on 16/10/8.
 */
import java.net.*;
import java.io.*;
import java.util.Date;

public class TimeTCPSever {
    public static void main(String[] args) {

        ServerSocket ss=null;
        Socket s=null;
        BufferedReader br=null;
        BufferedWriter bw=null;
        try {
            //step1
            ss=new ServerSocket(10000);
            //step2
            while(true) {


                try {
                    s = ss.accept(); //<----new conection   client
                    //step3
                    InputStream is = s.getInputStream();

                    br = new BufferedReader(new InputStreamReader(is));
                    String requestMsg = br.readLine();
                    System.out.println(requestMsg);
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (requestMsg == null) {

                    }
                    System.out.println(requestMsg);
                    OutputStream os = s.getOutputStream();
                    bw = new BufferedWriter(new OutputStreamWriter(os));
                    bw.write(new Date().toString());
                    bw.newLine();
                    bw.flush();
                } finally {
                    //step4
                    if (br != null) try {
                        br.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    if (bw != null) try {
                        bw.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    if (s != null) {
                        try {
                            s.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                }
            }
            //step3



        } catch (IOException e) {
            e.printStackTrace();
        }finally {


            if (ss != null) {
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
