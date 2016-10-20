package com.company;

/**
 * Created by dubo on 16/9/9.
 */
public class Exchange {

    private int x;
    private int y;
    public Exchange(int x,int y){
        this.x=x;
        this.y=y;
    }


    public void exchange(){
        x=x+y;
        y=x-y;
        x=x-y;

    }
    public void display(){
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
    public static void main(String[] args){
        Exchange e=new Exchange(100,101);
        e.exchange();
        e.display();
    }
}
