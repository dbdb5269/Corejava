package IandO;

import java.io.*;

/**
 * Created by dubo on 16/9/29.
 */
public class Copy {
    public static void main(String[] args) {
        if(args.length!=2){
            System.out.println("in put file1 file2");
        }
        FileInputStream fileInputStream=null;
        FileOutputStream fileOutputStream=null;
        BufferedInputStream bufferedInputStream=null;
        BufferedOutputStream bufferedOutputStream=null;
        int data;
        try{
            fileInputStream=new FileInputStream(args[0]);
            fileOutputStream=new FileOutputStream(args[1]);
            bufferedInputStream=new BufferedInputStream(fileInputStream);
            bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
            while((data=bufferedInputStream.read())!= -1){
                bufferedOutputStream.write(data);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

        try {
            bufferedInputStream.close();
            bufferedOutputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
