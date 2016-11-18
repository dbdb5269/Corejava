package WebServer.response;

import java.io.*;
import java.net.Socket;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by dubo on 16/10/11.
 */
public class Response {
    private Socket socket;
    private String url;
    private String method;
    private String filename;
    private File file;
    private PrintStream printStream;
    private BufferedReader br;
    private Map<String,String> map=new HashMap<>();
    public Response(Socket socket,String url,BufferedReader br){
        this.socket=socket;
        this.url=url;
        this.method=url.split(" ")[0];
        this.filename=url.split(" ")[1].substring(6);

    }
    public void display(){
        System.out.println(url);
        System.out.println(method);
        System.out.println(filename);
    }
    public void response(){
        if(method.equals("GET")){
            System.out.println("filename = "+filename);
            if (filename.contains("?")) {
                String[] split2 = filename.split("[?]");
                url = "files/" + split2[0];
                System.out.println("url=" + url);
                String str = split2[1];
                String[] get = str.split("&");

                for (int i = 0; i < get.length; i++) {
                    // System.out.println(get[i]);
                    String[] get_Str = get[i].split("=");
                    //map.put(get_Str[0], URLDecoder.decode(get_Str[1]));
                     System.out.println(get_Str[0]);
                     System.out.println(get_Str[1]);
                }

            } else {
                url = "files/" + filename;
                System.out.println("the url is   "+url);
            }

            file = new File(url);

            System.out.println("file is exists???" + file.exists());
            if(!file.exists()){
                System.out.println("404");
                url="files/"+"404.html";
            }
//            Iterator iterator=map.entrySet().iterator();
//            while(iterator.hasNext()){
//
//                Map.Entry entry=(Map.Entry)iterator.next();
//                System.out.println(entry.getKey());
//                System.out.println(entry.getValue());
//
//            }

            file = new File(url);

            FileInputStream fileInputStream = null;
            try {
                fileInputStream = new FileInputStream(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            int fileSize = 0;
            try {
                fileSize = fileInputStream.available();
                System.out.println(fileSize);
            } catch (IOException e) {
                e.printStackTrace();
            }
            byte[] datas = new byte[fileSize];
            try {
                fileInputStream.read(datas);
            } catch (IOException e) {
                e.printStackTrace();
            }


            //OutputStream
            OutputStream os = null;
            try {
                os = socket.getOutputStream();
            } catch (IOException e) {
                e.printStackTrace();
            }
            printStream = new PrintStream(os);
            printStream.println("HTTP/1.1 200 OK");


            printStream.println();
            System.out.println("start for");
            for (int i = 0; i < fileSize; i++) {
                //System.out.print((char)datas[i]);
                printStream.write(datas[i]);
                printStream.flush();
            }
            System.out.println("end of for");


        }else {
            System.out.println("init url= "+url);
            String newurl=url.substring(5);
            file = new File(newurl);

            System.out.println("file is exists???" + file.exists());
            if(!file.exists()){
                System.out.println("404");
                url="files/"+"404.html";
            }
            else {
                url = "files/" + filename;
            }


            System.out.println("exits the file url= "+url);
            file = new File(url);
            FileInputStream fileInputStream = null;
            try {
                fileInputStream = new FileInputStream(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            int fileSize = 0;
            try {
                fileSize = fileInputStream.available();
            } catch (IOException e) {
                e.printStackTrace();
            }
            byte[] datas = new byte[fileSize];
            try {
                fileInputStream.read(datas);
                System.out.println("123333333");
            } catch (IOException e) {
                e.printStackTrace();
            }


            //OutputStream
            OutputStream os = null;
            try {
                os = socket.getOutputStream();
            } catch (IOException e) {
                e.printStackTrace();
            }
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
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void closeprintStream(){

    }
}
