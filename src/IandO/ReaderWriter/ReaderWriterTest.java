package IandO.ReaderWriter;

import java.io.*;

/**
 * Created by dubo on 16/9/30.
 */
public class ReaderWriterTest {
    public static void main(String[] args) {
       // FileWriter fw=new FileWriter()
        Writer w=null;
        try {
             w=new OutputStreamWriter(new FileOutputStream("a.txt"),"gb2312");
        }catch (UnsupportedEncodingException |FileNotFoundException e){
            e.printStackTrace();
        }
        char [] c=new char[]{'你','好','世','界'};

        try {
            w.write(c);
        }catch (IOException e){
            e.printStackTrace();
        }
        try {
            w.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        //read
        Reader r=null;
        try {
            r=new InputStreamReader(new FileInputStream("a.txt"),"gb2312");
        }catch (UnsupportedEncodingException |FileNotFoundException e){
            e.printStackTrace();
        }

        char[] cc=new char[102];

        try {
            r.read(cc);
            System.out.println(cc);
        }catch (IOException e){
            e.printStackTrace();
        }
        try {
            r.close();
        }catch (IOException e){
            e.printStackTrace();
        }





    }
}
