package com.company;

/**
 * Created by dubo on 16/9/12.
 */
public class Flower {
    public static void main(String[] args){
        for(int i=100;i<999;i++){
            int x=i%10;
            int y=(i/10)%10;
            int z=(i/100)%10;
            if(i==((x*x*x)+(y*y*y)+(z*z*z))){
                System.out.println(i);
            }
        }
    }
}
