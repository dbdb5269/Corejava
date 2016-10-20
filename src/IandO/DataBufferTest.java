package IandO;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;

/**
 * Created by dubo on 16/9/29.
 */
public class DataBufferTest {
    public static void main(String[] args) {
        double value=18.7;
        double[] da=new double[10];
        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
        DataOutputStream dataOutputStream=new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeDouble(value);
        }catch (IOException e){
            e.printStackTrace();
        }
        ByteArrayInputStream byteArrayInputStream=new ByteInputStream();
        DataInputStream dataInputStream=new DataInputStream(byteArrayInputStream);
        try {
             da[0]=dataInputStream.readDouble();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
