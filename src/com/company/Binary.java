package com.company;

/**
 * Created by dubo on 16/9/9.
 */
public class Binary {
    private int Binary;
    public Binary(int Binary){
        this.Binary=Binary;
    }
    public void display(){
        for(int i=31;i>=0;i--){
            int result=(Binary >> i ) & 1;
            System.out.print(result);

        }
        System.out.println();
    }
    public static void main(String[] args){
        Binary b=new Binary(255);
        b.display();
    }
}
