package com.ch04.ex3;

/**
 * Created by dubo on 16/9/12.
 */
public class ArrayTest {
    public static void main(String[] args){
        int array1[]={2,3,5,7,11,13,17};
        for(int i=0;i<array1.length;i++){
            System.out.print(array1[i]+" ");
        }
        System.out.println();
        int array2[];
        array2=array1;
        array2[2]=2;
        array2[4]=4;
        for(int i=0;i<array2.length;i++){
            System.out.print(array2[i]+" ");
        }
    }
}
