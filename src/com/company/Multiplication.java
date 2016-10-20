package com.company;

/**
 * Created by dubo on 16/9/12.
 */
public class Multiplication {
    public void type1(){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
    public void type2(){
        for(int i=9;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
    public void type3(){
        for(int i=1;i<=9;i++){
            for(int k=1;k<=9-i;k++){
                System.out.print("         ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Multiplication m=new Multiplication();
//        m.type1();
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        m.type2();
        m.type3();
    }
}
