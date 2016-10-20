package com.ch04.ex4;

/**
 * Created by dubo on 16/9/21.
 */
public class Array2D {
    public static void main(String[] args){
        int[][] twoD=new int[4][];
        int[] arr={1,2,4,5};
        int[] arr2={1,2,4,5,6};
        int[] arr3={1,2,4,5,6,7};
        int[] arr4={1,2,4,5,7,8,10};

        int x=(int)Math.random()*100;
        twoD[0]=arr;
        twoD[1]=arr2;
        twoD[2]=arr3;
        twoD[3]=arr4;

        for(int i=0;i<twoD.length;i++){
            for(int j=0;j<twoD[i].length;j++){
                System.out.print(twoD[i][j]+" ");
            }
            System.out.println();
        }
    }
}
