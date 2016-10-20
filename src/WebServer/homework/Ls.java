package WebServer.homework;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;
import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by dubo on 16/10/18.
 */
public class Ls {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String path=scanner.next();

        File file=new File(path);
        if(!file.exists()){
            System.out.println("file don't exists");
            System.exit(-1);
        }
        long time=file.lastModified();
        Calendar cal=Calendar.getInstance();
        cal.setTimeInMillis(time);
        System.out.println("文件上一次修改时间"+cal.getTime().toString());
        System.out.println("文件的上一级为"+file.getParentFile());
        if(file.isDirectory()) {
            System.out.println("该文件包括");
            String[] str = file.list();
            for (int i = 0; i < str.length; i++) {

                System.out.println(str[i]);
            }
        }else {
            System.out.println("文件名为"+file.getName());
            //System.out.println(file.getName());
        }
//        try {
//            FileInputStream fileInputStream=new FileInputStream(file);
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}
