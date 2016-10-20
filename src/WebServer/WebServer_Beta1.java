package WebServer;

import java.io.*;
import java.net.NetPermission;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by dubo on 16/10/9.
 */
public class WebServer_Beta1 {
    class ServerThread extends Thread{
        private Socket socket;
        private Map<String,String> map=new HashMap<>();
        public ServerThread(Socket socket){
            this.socket=socket;

        }
        @Override
        public void run(){
            super.run();
            DataOutputStream dataOutputStream=null;
            PrintStream printStream=null;
            File file=null;

            try {

                InputStream is = socket.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                String firsrline = br.readLine();
                System.out.println(firsrline);



                String arrayResourse[] = firsrline.split(" ");
                String head=arrayResourse[0];

                String resourse = arrayResourse[1];
                String newresourse = resourse.substring(1);

                Boolean isNull = newresourse.isEmpty();

                String url=null;

                if(head.equals("GET")){

                    while (br.ready()) {
                        System.out.println(br.readLine());

                    }


                    if (isNull) {
                        url = "files/" + "index.html";
                    } else {


                        if (newresourse.contains("?")) {
                            String[] split2 = newresourse.split("[?]");
                            url = "files/" + split2[0];
                            System.out.println("url=" + url);
                            String str = split2[1];
                            String[] get = str.split("&");

                            for (int i = 0; i < get.length; i++) {
                                // System.out.println(get[i]);
                                String[] get_Str = get[i].split("=");
                                map.put(get_Str[0], URLDecoder.decode(get_Str[1]));
                                // System.out.println(get_Str[0]);
                                // System.out.println(get_Str[1]);
                            }

                        } else {
                            url = "files/" + newresourse;

                        }

                        file = new File(url);
                        System.out.println(file.exists());
                        if(!file.exists()){
                            System.out.println("404");
                            url="files/"+"404.html";
                        }
                        Iterator iterator=map.entrySet().iterator();
                        while(iterator.hasNext()){

                            Map.Entry entry=(Map.Entry)iterator.next();
                            System.out.println(entry.getKey());
                            System.out.println(entry.getValue());

                        }
                    }


                    file = new File(url);

                    FileInputStream fileInputStream = new FileInputStream(file);

                    int fileSize = fileInputStream.available();
                    byte[] datas = new byte[fileSize];
                    fileInputStream.read(datas);


                    //OutputStream
                    OutputStream os = socket.getOutputStream();
                    printStream = new PrintStream(os);
                    printStream.println("HTTP/1.1 200 OK");


                    printStream.println();
                    for (int i = 0; i < fileSize; i++) {
                        printStream.write(datas[i]);
                        printStream.flush();
                    }





                }
                if(head.equals("POST")){

                    int size=0;
                    while (br.ready()) {
                        String line=br.readLine();
                        System.out.println(line);
                        if(line.contains("Content-Length")){
                            size=Integer.parseInt(line.substring(16));
                            break;
                        }

                    }
                    System.out.println(size);
                    br.readLine();
                    //DataInputStream dataInputStream=new DataInputStream(is);
                    String info="";
                    for(int i=0;i<size;i++){
                        info+=(char)br.read();
                    }
                    System.out.println(info);
                    url = "files/" + newresourse;
                    file = new File(url);
                    FileInputStream fileInputStream = new FileInputStream(file);

                    int fileSize = fileInputStream.available();
                    byte[] datas = new byte[fileSize];
                    fileInputStream.read(datas);


                    //OutputStream
                    OutputStream os = socket.getOutputStream();
                    printStream = new PrintStream(os);
                    printStream.println("HTTP/1.1 200 OK");


                    printStream.println();
                    for (int i = 0; i < fileSize; i++) {
                        printStream.write(datas[i]);
                        printStream.flush();
                    }

                }










                if(printStream!=null){
                    System.out.println("printStream close");
                    printStream.close();
                }
                if(br!=null){
                    System.out.println("br close");
                    br.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }finally {

            }

        }
    }
    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(10000);
            while (true){
                System.out.println("等待。。。");
                Socket socket = serverSocket.accept();
                System.out.println("链接");
                new WebServer().new ServerThread(socket).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
