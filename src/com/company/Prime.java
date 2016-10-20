package com.company;

/**
 * Created by dubo on 16/9/12.
 */
public class Prime {
    public boolean check(int x){
        boolean is=true;

        for(int i=2;i<x;i++){
            if(x%i==0){
                is=false;
                return is;
            }
        }
        return is;
    }
    public static void main(String[] args){
        for(int x=101;x<=200;x++){
            Prime p=new Prime();
            if(p.check(x)){
                System.out.println(x);
            }

        }
    }
}
