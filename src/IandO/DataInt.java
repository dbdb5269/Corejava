package IandO;

import java.io.*;

/**
 * Created by dubo on 16/9/29.
 * 将一个整形数写入文件
 */
public class DataInt {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream=null;
        DataOutputStream dataOutputStream=null;
        DataInputStream dataInputStream=null;
        try{

            fileOutputStream=new FileOutputStream("b.txt");
            dataOutputStream=new DataOutputStream(fileOutputStream);
            double value=10;
            dataOutputStream.writeDouble(value);
            dataOutputStream.writeBoolean(false);
            dataOutputStream.flush();
            dataInputStream=new DataInputStream(new FileInputStream("b.txt"));
            double num=dataInputStream.readDouble();
            boolean d=dataInputStream.readBoolean();
            System.out.println(num);
            System.out.println(d);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

        try {

            dataOutputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
