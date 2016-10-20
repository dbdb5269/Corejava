package com.ch04;

/**
 * Created by dubo on 16/9/12.
 */
public class ArrayMultipy {
    public static void main(String[] args){
        int arra[]={1,2,3,4,5,6,7,8,9,10};

        int result=1;
        for(int i=0;i<10;i++){
            result=result*arra[i];

        }
        System.out.println(result);
    }
}
