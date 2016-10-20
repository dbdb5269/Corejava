package WebServer.request;

import java.io.*;
import java.net.Socket;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by dubo on 16/10/11.
 */
public class Request {
    private Socket socket;
    private String head;
    private String resourse;
    private String newresourse;
    private BufferedReader br;
    private String url;
    private File file=null;
    private Map<String,String> map=new HashMap<>();
    public Request(Socket socket){
        this.socket=socket;

    }
    public void inputstream(){
        try {
            InputStream is = socket.getInputStream();
            br = new BufferedReader(new InputStreamReader(is));
            String firsrline = br.readLine();
            System.out.println(firsrline);
            String arrayResourse[] = firsrline.split(" ");
            //receive the method of http GET or POST
            setHead(arrayResourse[0]);
            //receive the file URL or file name
            setResourse(arrayResourse[1]);
            //receiver the file URL or file name sub the "/"
            setNewresourse(resourse.substring(1));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public BufferedReader br(){
        return br;
    }
    public String url(){
        if(head.equals("GET")){

            try {
                while (br.ready()) {
                    System.out.println(br.readLine());

                }
            } catch (IOException e) {
                e.printStackTrace();
            }


            if (newresourse.isEmpty()) {
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
//                         System.out.println(get_Str[0]);
//                         System.out.println(get_Str[1]);
                    }

                } else {
                    url = "files/" + newresourse;

                }

                System.out.println("the map iterator");
                Iterator iterator=map.entrySet().iterator();
                while(iterator.hasNext()){

                    Map.Entry entry=(Map.Entry)iterator.next();
                    System.out.println(entry.getKey());
                    System.out.println(entry.getValue());

                }

            }

            return "GET"+" "+url;


        }else {



            //output the post message
            int size=0;
            try {
                System.out.println("start post readline");
                while (br.ready()) {
                    String line=br.readLine();
                    System.out.println(line);
                    if(line.contains("Content-Length")){
                        size=Integer.parseInt(line.substring(16));
                        break;
                    }

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(size);
            try {
                br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            //DataInputStream dataInputStream=new DataInputStream(is);
            String info="";
            for(int i=0;i<size;i++){
                try {
                    info+=(char)br.read();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(info);
            //

            url = "files/" + newresourse;

            return "POST"+" "+url;
        }







    }
    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getNewresourse() {
        return newresourse;
    }

    public void setNewresourse(String newresourse) {
        this.newresourse = newresourse;
    }

    public String getResourse() {
        return resourse;
    }

    public void setResourse(String resourse) {
        this.resourse = resourse;
    }
}
