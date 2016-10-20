package com.company;

/**
 * Created by dubo on 16/9/12.
 */
public class Divide {
    public static void main(String[] args){


        int num = 90;
        System.out.print(num+"=");

        int k = 2;
        for(;k<=num;k++){
            while(k!=num){
                if(num%k==0){
                    System.out.print(k+"*");
                    num = num/k;
                }else
                    break;
            }
        }
        System.out.print(k-1);
        System.out.println();
    }
}
