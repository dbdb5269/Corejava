package NetWork;

/**
 * Created by dubo on 16/10/8.
 */
import java.net.*;
import java.io.*;
import java.util.Date;

public class Sever2 {
    class SevericThread extends Thread{
        private Socket s;
        public SevericThread(Socket s){
            this.s=s;
        }
        public void run(){
            super.run();
            BufferedReader br=null;
            BufferedWriter bw=null;
            try {

                //step3
                InputStream is = null;
                try {
                    is = s.getInputStream();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                br = new BufferedReader(new InputStreamReader(is));
                String requestMsg = null;
                try {
                    requestMsg = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(requestMsg);
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (requestMsg == null) {

                }
                System.out.println(requestMsg);
                OutputStream os = null;
                try {
                    os = s.getOutputStream();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                bw = new BufferedWriter(new OutputStreamWriter(os));
                try {
                    bw.write(new Date().toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    bw.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    bw.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
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

    }
    public static void main(String[] args) {

        ServerSocket ss=null;
        Socket s=null;

        try {
            //step1
            ss=new ServerSocket(10000);
            //step2
            while(true) {


                s = ss.accept(); //<----new conection   clien
                new Sever2().new SevericThread(s).start();
                //step3

            }

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
