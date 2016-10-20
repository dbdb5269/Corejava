package IandO;

import java.io.*;

/**
 * Created by dubo on 16/9/30.
 */
public class BufferTest {
    public static void main(String[] args) {
        String s="hello world";
        BufferedWriter bw=null;
        try {
            bw=new BufferedWriter(new FileWriter(("buffered.txt")));
            bw.write(s);
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String ss=null;
        BufferedReader br=null;
        try {
            br=new BufferedReader(new FileReader("buffered.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            ss=br.readLine();
            System.out.println(ss);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
