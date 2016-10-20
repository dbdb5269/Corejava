package ccu;

import java.util.Arrays;
import java.security.SecureRandom;

/**
 * Created by dubo on 16/9/27.
 */
public class SimpleArray {
    private static final SecureRandom generator = new SecureRandom();
    private  final int[] arrary;
    private int writeIndex=0;
    private SimpleArray(int size) {
        arrary=new int[size];
    }
    public void add(int value){
        int position=writeIndex;
        try{
            Thread.sleep(generator.nextInt(5000));
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        arrary[position]=value;
        System.out.printf("%s wrote %d to element %d.%n",Thread.currentThread().getName(),value,position);
        ++writeIndex;
        System.out.printf("Next write index:%d%n",writeIndex);
    }
    public String toString(){
        return Arrays.toString(arrary);
    }
}

